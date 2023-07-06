package com.singlestore.adapter.singlestore.metadata.adapter;

import com.informatica.sdk.adapter.metadata.provider.AbstractMetadataAdapter;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.informatica.sdk.adapter.metadata.common.Option;
import com.informatica.sdk.adapter.metadata.patternblocks.catalog.semantic.iface.Catalog;
import com.informatica.sdk.adapter.metadata.patternblocks.procedure.semantic.iface.Parameter;
import com.informatica.sdk.adapter.metadata.patternblocks.procedure.semantic.iface.Procedure;
import com.informatica.sdk.adapter.metadata.patternblocks.hierrecord.semantic.iface.HierRecord;
import com.informatica.sdk.adapter.metadata.patternblocks.index.semantic.iface.Index;
import com.informatica.sdk.adapter.metadata.patternblocks.index.semantic.iface.IndexField;
import com.informatica.sdk.adapter.metadata.patternblocks.shared.semantic.iface.Record;
import com.informatica.sdk.adapter.metadata.patternblocks.shared.semantic.iface.ImportableObject;
import com.informatica.sdk.adapter.metadata.patternblocks.constraint.semantic.iface.PrimaryKey;
import com.informatica.sdk.adapter.metadata.patternblocks.constraint.semantic.iface.UniqueKey;
import com.informatica.sdk.adapter.metadata.provider.Connection;
import com.informatica.sdk.adapter.metadata.common.CCatalogImportOpts;
import com.informatica.sdk.adapter.metadata.patternblocks.semantic.iface.Factory;
import com.informatica.sdk.adapter.metadata.patternblocks.field.semantic.iface.Field;
import com.informatica.sdk.adapter.metadata.patternblocks.flatrecord.semantic.iface.FlatRecord;
import com.informatica.sdk.adapter.metadata.patternblocks.container.semantic.iface.Package;
import com.informatica.sdk.adapter.metadata.common.CWriteObjectsOpts;
import com.informatica.sdk.adapter.metadata.common.Option;
import com.informatica.sdk.adapter.metadata.common.Status;
import com.informatica.sdk.adapter.metadata.common.StatusEnum;
import com.informatica.sdk.adapter.metadata.common.semantic.iface.MetadataObject;
import com.informatica.sdk.adapter.metadata.provider.ConnectionPoolingOptions;
import com.informatica.sdk.adapter.metadata.writeback.ActionTypeEnum;
import com.informatica.sdk.adapter.metadata.writeback.MetadataWriteAction;
import com.informatica.sdk.adapter.metadata.writeback.MetadataWriteOptions;
import com.informatica.sdk.adapter.metadata.writeback.MetadataWriteResults;
import com.informatica.sdk.adapter.metadata.writeback.MetadataWriteSession;
import com.informatica.sdk.adapter.metadata.field.semantic.iface.FieldBase;
import com.informatica.sdk.exceptions.ExceptionManager;
import com.informatica.sdk.adapter.metadata.common.semantic.iface.ChangedProperty;
import com.informatica.sdk.adapter.metadata.common.semantic.iface.MetadataChanges;
import com.informatica.sdk.adapter.metadata.common.CDetailImportOpts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedWriter;

@SuppressWarnings("unused")
public class SingleStoreMetadataAdapter extends AbstractMetadataAdapter  {
	
	public static String escapeIdentifier(String ident) {
		return "`" + ident.replaceAll("`", "``") + "`";
	}

	/**
     * Caters to the user requests pertaining to the native metadata 
     * catalog. This may be performed in a single bulk catalog retrieval call or by 
     * a series of separate incremental requests. The adapter is expected to fetch 
     * the objects such as catalogs, hierarchy, packages, or records using Options 
     * parameter. During incremental processing, the first call will be expected to 
     * set the root objects on the SDKCatalog object and the subsequent calls should 
     * add child metadata objects to the retrieved object specified by the START_AT 
     * SDKOption.
     * 
     * @param options
     *            List of option values that includes a START_AT option. 
     * 			  The START_AT option references a previously retrieved 
     * 			  object from which to start or resume metadata import. 
     * 			  The START_AT option also specifies the depth to indicate 
     * 			  the levels of child metadata objects to retrieve. 
     * 			  If the START_AT option is not provided then retrieval 
     * 			  starts at the root level.
     * @param connection
     *				Adapter connection object to be used for connecting to the third
     *				party
     * @param catalog
     *            The object to store the retrieved metadata catalog which 
     *			  is of interest to the user. The results of incremental 
     *			  calls are maintained in this object.
     * @return true if the adapter applies the filter options, false if the 
     *			  SDK applies the filers on the adapter's behalf.
     */

    @Override
    public Boolean populateObjectCatalog(Connection connection, List<Option> options, Catalog catalog) {
    	try {
        	FileWriter fw = new FileWriter("/home/amakarovych-ua/Test/log", true);    		
        	fw.write("Populating catalog\n");
        	fw.close();
    	} catch (Exception e) {
    		
    	}

    	Factory sdkFactory = catalog.getFactory();
    	// Use the startFolder for incremental browsing of metadata
    	Package startFolder =  MetadataUtils.getStartFolder(options);
    	// Use the nameFilter for filtering the metadata by Name when fetching from catalog
    	String nameFilter = MetadataUtils.getNameFilter(options);
    	
    	try {
        	java.sql.Connection nativeConnection = (java.sql.Connection)((SingleStoreConnection)connection).getNativeConnection();

        	if (startFolder == null) {
        		String defaultDatabase = nativeConnection.getCatalog();
        		if (!isNullOrEmpty(defaultDatabase)) {
        			Package pack = sdkFactory.newPackage(catalog);
        			pack.setName(defaultDatabase);
        			catalog.addRootPackage(pack);
        		} else {
        			DatabaseMetaData metadata = ((java.sql.Connection)((SingleStoreConnection)connection).getNativeConnection()).getMetaData();
        			try (ResultSet rs = metadata.getCatalogs()) {
            			while (rs.next()) {
    						Package pack = sdkFactory.newPackage(catalog);
    						pack.setName(rs.getString(1));
    						catalog.addRootPackage(pack);
                		}        				
        			}
        		}
        	} else {
    			DatabaseMetaData metadata = ((java.sql.Connection)((SingleStoreConnection)connection).getNativeConnection()).getMetaData();
    			String databaseName = startFolder.getName();
        		
    			try (ResultSet rs = metadata.getTables(databaseName, null, 
    					isNullOrEmpty(nameFilter) ? "%" : "%" + nameFilter.replace("%", "\\%") + "%", null)) {
            		while (rs.next()) {
    					FlatRecord flatRecord = sdkFactory.newFlatRecord(catalog);
    					String tableName = rs.getString(3);
    					// Skip views
    					if (!rs.getNString(4).equalsIgnoreCase("TABLE")) {
    						continue;
    					}
    					
    					flatRecord.setName(tableName);
    					flatRecord.setNativeName(escapeIdentifier(databaseName) + "." + escapeIdentifier(tableName));
    					flatRecord.setNmoType("Table");
    					startFolder.addChildRecord(flatRecord);
            		}    				
    			}
        	}
    	} catch (SQLException e) {
			ExceptionManager.createNonNlsAdapterSDKException("An error occured while populating object catalog:[" + e.getMessage() + "]");
    	}

    	try {
        	FileWriter fw = new FileWriter("/home/amakarovych-ua/Test/log", true);    		
        	fw.write("Finished Populating catalog\n");
        	fw.close();
    	} catch (Exception e) {
    		
    	}

    	return true;
    }
    
	private static boolean isNullOrEmpty(String str) {
		return str == null || str.trim().isEmpty();
	}


    /**
     * Fetches metadata of the objects based on the options. Use this method to 
     * gather catalog information to support run-time data access when you create 
     * a platform data object corresponding to the fetched metadata object.
     * 
     * @param options 
     *			List of option values.
     * 
     * @param importableObjects 
     *			List of native objects that contains object names for which the 
     *			metadata details are required.
     * 
     * @param connection Adapter connection object to be used for connecting to the third party
     *
     * @param catalog 
     *			SDKCatalog that contains the retrieved metadata.
     */

    @Override
    public void populateObjectDetails(Connection connection, List<Option> options, List<ImportableObject> importableObjects, Catalog catalog) {
    	try {
        	FileWriter fw = new FileWriter("/home/amakarovych-ua/Test/log", true);    		
        	fw.write("Populating details\n");
        	fw.close();
    	} catch (Exception e) {
    		
    	}

    	
    	try {
        	java.sql.Connection nativeConnection = (java.sql.Connection)((SingleStoreConnection)connection).getNativeConnection();
    		for (ImportableObject obj : importableObjects) {
    			FlatRecord record = (FlatRecord) obj;
    			addColumnsAndKeys(nativeConnection, catalog, record);
    		}
    	} catch (SQLException ex) {
    		ExceptionManager.createNonNlsAdapterSDKException("An error occured while populating object details:["
					+ ex.getMessage() + "]");
    	}

    	try {
        	FileWriter fw = new FileWriter("/home/amakarovych-ua/Test/log", true);    		
        	fw.write("Finnished Populating details\n");
        	fw.close();
    	} catch (Exception e) {
    		
    	}
    }
    
    private List<String> unescapeIdentifier(String ident) {
    	List<String> res = new ArrayList<String>();
    	StringBuilder curPart = new StringBuilder();
    	boolean isOpen = false;
    	boolean isPrevBacktick = false;
    	for (char c: ident.toCharArray()) {
    		if (c == '`') {
    			isOpen = !isOpen;
    			
    			if (isPrevBacktick) {
    				curPart.append(c);
    			}
    			
    			isPrevBacktick = true;
    		} else {
    			if (isOpen) {
    				curPart.append(c);
    			} else if (c == '.'){
    				res.add(curPart.toString());
    				curPart = new StringBuilder();
    			}

    			isPrevBacktick = false;
    		}
    	}
    	res.add(curPart.toString());
    	
    	return res;
    }
    
    private void addColumnsAndKeys(java.sql.Connection connection, Catalog catalog, FlatRecord record) throws SQLException {
    	final class KeyColumn implements Comparable<KeyColumn> {
    		int seqInIndex;
    		String columnName;
    		boolean isUnique;
    		
    		KeyColumn(int seqInIndex, String columnName, boolean isUnique) {
    			this.seqInIndex = seqInIndex;
    			this.columnName = columnName;
    			this.isUnique = isUnique;
    		}
    		
    		public int compareTo(KeyColumn kc){  
    			if (this.seqInIndex == kc.seqInIndex) {
    				return 0;
    			} else if (this.seqInIndex > kc.seqInIndex) {
    				return 1;
    			} else {
    				return -1;
    			}
    		}
    	}
    	
		Factory sdkFactory = catalog.getFactory();
		List<String> path = unescapeIdentifier(record.getNativeName());
		String database = path.get(0);
		String table = path.get(1);
		
		Map<String, List<KeyColumn>> keyToColumns = new HashMap<String, List<KeyColumn>>();
		
		try (Statement stmt = connection.createStatement();
				ResultSet keysIter = stmt.executeQuery(String.format("SHOW KEYS IN %s", record.getNativeName()))) {
			while (keysIter.next()) {
				boolean isUnique = keysIter.getBoolean(2);
				String keyName = keysIter.getString(3);
				int seqInIndex = keysIter.getInt(4);
				String columnName = keysIter.getString(5);
				
				if (!keyToColumns.containsKey(keyName)) {
					keyToColumns.put(keyName, new ArrayList<KeyColumn>());
				}
				keyToColumns.get(keyName).add(new KeyColumn(seqInIndex, columnName, isUnique));
			}	
		}
		
		Map<String, Field> columnNameToField = new HashMap<String, Field>();
		DatabaseMetaData metadata = connection.getMetaData();

		try (ResultSet columnsIter = metadata.getColumns(database, null, table, null)) {
			while (columnsIter.next()) {
				Field field = sdkFactory.newField(catalog);
				populateField(field, columnsIter, record);
				record.addField(field);

				columnNameToField.put(field.getName(), field);
			}			
		}
		
		
		for (Map.Entry<String, List<KeyColumn>> entry: keyToColumns.entrySet()) {
			String keyName = entry.getKey();
			List<KeyColumn> columns = entry.getValue();

			// TODO handle shard keys
			if (keyName.equalsIgnoreCase("__SHARDKEY")) {
				continue;
			}
			
			Collections.sort(columns);
			
			if (keyName.equalsIgnoreCase("PRIMARY")) {
				PrimaryKey pk = sdkFactory.newPrimaryKey(catalog);
				pk.setName(keyName);
				pk.setNativeName(keyName);
				
				for (KeyColumn column: columns) {
					pk.addField(columnNameToField.get(column.columnName));
				}
				
				record.addPrimaryKey(pk);
			} else if (columns.get(0).isUnique) {
				UniqueKey uk = sdkFactory.newUniqueKey(catalog);
				uk.setName(keyName);
				uk.setNativeName(keyName);
				
				for (KeyColumn column: columns) {
					uk.addField(columnNameToField.get(column.columnName));
				}
				
				record.addUniqueKey(uk);
			} else {
				Index ind = sdkFactory.newIndex(catalog);
				ind.setName(keyName);
				ind.setNativeName(keyName);

				for (KeyColumn column: columns) {
					Field field = columnNameToField.get(column.columnName);
					IndexField idxFld = sdkFactory.newIndexField(catalog);
					idxFld.setIndexBaseField(field);
					idxFld.setName(field.getName());

					ind.addIndexField(idxFld);
				}
				
				record.addIndex(ind);
			}
		}
	}
    
    private void populateField(Field field, ResultSet columnsIter, Record record) throws SQLException {
    	String name = columnsIter.getString(4);
    	String typeName = formatDataType(columnsIter.getString(6));
    	int precision = columnsIter.getInt(7);
    	int scale = columnsIter.getInt(9);
    	boolean isNullable = columnsIter.getBoolean(11);
    	String defValue = columnsIter.getString(13);
		int length = columnsIter.getInt(16);
		
		if (typeName.equalsIgnoreCase("BIT") && precision == 3) {
			typeName = "BOOL";
			precision = 1;
		}
		
		field.setName(name);
		field.setNativeName(name);
		field.setLength(length);
		field.setDataType(typeName);	
		
		if (typeName.equalsIgnoreCase("DOUBLE")) {
			field.setPrecision(15);
			field.setScale(11);
		} else if (typeName.equalsIgnoreCase("FLOAT")) {
			field.setPrecision(8);
			field.setScale(8);
		} else if (typeName.equalsIgnoreCase("GEOGRAPHY") || 
				typeName.equalsIgnoreCase("GEOGRAPHYPOINT") ||
				typeName.equalsIgnoreCase("JSON")) {
			field.setPrecision(Integer.MAX_VALUE);
			field.setScale(0);				
		} else {
			field.setPrecision(precision);
			field.setScale(scale);			
		}
		// TODO set the default value
		// field.setDefaultValue(defValue);
		field.setNullableField(isNullable);
    }



    /**
     * Gets the adapter metadata connection instance.
     * 
     * @param options
     *            The various Options of the metadata connection instance. Ex: NMO-type
     * @param connAttrs
     *            The connection attributes of the adapter.
     * @return INFASDKConnection object that is the adapter specific connection instance.
     */

    @Override
    public Connection getMetadataConnection(List<Option> options, Map<String, Object> connAttrs){
    	return new SingleStoreConnection();
    }


    
    private String formatDataType(String typeName) {
		String[] typeNameParts = typeName.split(" ");
		if(typeNameParts.length>1 && typeNameParts[1].equalsIgnoreCase("UNSIGNED")) {
			return typeNameParts[0];
		}
		return typeName;
    }



    /**
     * Caters to the user request to create/update/delete metadata in external system 
     * using the objects and options provided
     * 
     * @param sdkConnection
     *        Adapter connection object to be used for connecting to the third party.
     * @param writeSession
     *        Session Object used to get metadata object on which action is required 
     *        and corresponding overridden options. Also used to update back metadata 
     *        write related results for each object.
     * @param defOptions
     *        default writeOptions for metadata object
     * @return Status object that contains method success status.
     */

    @Override
    public Status writeObjects(Connection connection, MetadataWriteSession writeSession, MetadataWriteOptions defOptions) {
    	super.writeObjects(connection, writeSession, defOptions);
    	ActionTypeEnum defActType = defOptions.getActionType();
    	java.sql.Connection nativeConnection = (java.sql.Connection)((SingleStoreConnection)connection).getNativeConnection();
    	boolean defDropAndCreate = true;
    	for (Option option: defOptions.getOptions()) {
    		int optionID = option.getDescription().getEffectiveDefinition().getOptionID();
    		if (optionID == CWriteObjectsOpts.DROP_AND_CREATE) {
				defDropAndCreate = (Boolean) option.getValue();
			}
    	}
    	try {
        	for (MetadataWriteAction action: writeSession.getWriteActions()) {
        		MetadataObject objToWrite = action.getObjectToWrite();
    			if (objToWrite instanceof FlatRecord) {
    				FlatRecord rec = (FlatRecord) objToWrite;
    				ActionTypeEnum actType = defActType;
    				boolean dropAndCreate = defDropAndCreate;
    				
    				
    				MetadataWriteOptions options = action.getWriteOptions();
    				if (options != null) {
    					actType = options.getActionType();
    					for (Option option: options.getOptions()) {
    			    		int optionID = option.getDescription().getEffectiveDefinition().getOptionID();
    			    		if (optionID == CWriteObjectsOpts.DROP_AND_CREATE) {
    							dropAndCreate = (Boolean) option.getValue();
    						}
    					}
    				}
    				
    				switch (actType) {
    				case create:
    					if (dropAndCreate) {
    						dropTableIfExists(nativeConnection, rec);
    					}
    					
    					createTable(nativeConnection, rec);
    					break;
    				case update:
    					alterTable(nativeConnection, rec);
    					break;
    				case delete:
    					dropTable(nativeConnection, rec);
    					break;
    				default:
    					return new Status(StatusEnum.FAILURE, "Unsupported Option for Create Target");
    				}
    			}
        	}
    	} catch (SQLException e) {
			Status status = new Status(StatusEnum.FAILURE, "Target creation failed");
			status.setDetailedMessage(e);
			return status;
    	}
    	
		return new Status(StatusEnum.SUCCESS, "");
    }
    
    private void executeQuery(java.sql.Connection connection, String query) throws SQLException {
    	try (Statement stmt = connection.createStatement()) {
        	stmt.execute(query);    		
    	}
    }
    
    private void dropTableIfExists(java.sql.Connection connection, FlatRecord rec) throws SQLException {
    	String query = String.format("DROP TABLE IF EXISTS %s", rec.getNativeName());
    	executeQuery(connection, query);
    }
    
    private void dropTable(java.sql.Connection connection, FlatRecord rec) throws SQLException {
    	String query = String.format("DROP TABLE %s", rec.getNativeName());
    	executeQuery(connection, query);
    }
    
    private boolean containsGeographyField(FlatRecord rec) {
    	for (FieldBase fld: rec.getFieldList()) {
    		if (fld.getDataType().equalsIgnoreCase("GEOGRAPHY")) {
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    private void createTable(java.sql.Connection connection, FlatRecord rec) throws SQLException {
    	StringBuffer query = new StringBuffer(containsGeographyField(rec) ? "CREATE ROWSTORE TABLE " : "CREATE TABLE");
    	query.append(rec.getNativeName());
    	query.append(MetadataUtils.SPACE);
    	query.append(MetadataUtils.OPEN_PARANTHESIS);
    	
    	for (FieldBase fld: rec.getFieldList()) {
    		query.append(escapeIdentifier(fld.getName()));
        	query.append(MetadataUtils.SPACE);
        	// TODO handle unsigned data types
        	query.append(formatTypeString((Field)fld));
        	query.append(MetadataUtils.COMMA);
    	}
    	
    	for (Index ind: rec.getIndexList()) {
    		query.append("INDEX ");
    		query.append(escapeIdentifier(ind.getName()));
    		query.append(MetadataUtils.OPEN_PARANTHESIS);
    		for (IndexField field: ind.getIndexFields()) {
    			query.append(escapeIdentifier(field.getName()));
            	query.append(MetadataUtils.COMMA);
    		}
        	query.deleteCharAt(query.length()-1);
    		query.append(MetadataUtils.CLOSE_PARANTHESIS);    		
    	}

    	for (UniqueKey uk: rec.getUniqueKeys()) {
    		query.append("UNIQUE ");
    		query.append(escapeIdentifier(uk.getName()));
    		query.append(MetadataUtils.OPEN_PARANTHESIS);
    		for (Field field: uk.getFieldList()) {
    			query.append(escapeIdentifier(field.getName()));
            	query.append(MetadataUtils.COMMA);
    		}
        	query.deleteCharAt(query.length()-1);
    		query.append(MetadataUtils.CLOSE_PARANTHESIS);    		
    	}
    	
    	PrimaryKey pk = rec.getPrimaryKey();
    	if (pk != null) {
    		query.append("PRIMARY KEY ");
    		query.append(MetadataUtils.OPEN_PARANTHESIS);
    		for (Field field: pk.getFieldList()) {
    			// TODO escape identifier
    			query.append(escapeIdentifier(field.getName()));
            	query.append(MetadataUtils.COMMA);
    		}
        	query.deleteCharAt(query.length()-1);
    		query.append(MetadataUtils.CLOSE_PARANTHESIS);    		
    	}

    	query.deleteCharAt(query.length()-1);
		query.append(MetadataUtils.CLOSE_PARANTHESIS);

		executeQuery(connection, query.toString());
    }
    
    private String formatTypeString(Field fld) {
    	String type = fld.getDataType();
    	if (type.equalsIgnoreCase("DECIMAL") ||
    			type.equalsIgnoreCase("DEC") ||
    			type.equalsIgnoreCase("FIXED") ||
    			type.equalsIgnoreCase("NUMERIC")) {
    		return String .format("%s (%d, %d)", type, fld.getPrecision(), fld.getScale());
    	} else if (type.equalsIgnoreCase("BIT") ||
    			type.equalsIgnoreCase("CHAR") || 
    			type.equalsIgnoreCase("BINARY") ||
    			type.equalsIgnoreCase("VARCHAR") || 
    			type.equalsIgnoreCase("VARBINARY")) {
    		return String .format("%s (%d)", type, fld.getPrecision());    		
    	} else if (type.equalsIgnoreCase("TIME")) {
    		if (fld.getPrecision() == 10) {
    			return type;
    		} else {
    			return String.format("%s (6)", type);
    		}    		
    	} else if (type.equalsIgnoreCase("DATETIME") ||
    			type.equalsIgnoreCase("TIMESTAMP")) {
    		if (fld.getPrecision() == 19) {
    			return type;
    		} else {
    			return String.format("%s (6)", type);
    		}    		
    	} else {
    		return type;
    	}
    }
    
    private void alterTable(java.sql.Connection connection, FlatRecord rec) throws SQLException {
    	StringBuffer query = new StringBuffer("ALTER TABLE ");
    	query.append(rec.getNativeName());
    	query.append(MetadataUtils.SPACE);

    	for (FieldBase fld: rec.getFieldList()) {
    		MetadataChanges changes = fld.getMetadataChanges();
    		
    		if (changes.isAdded()) {
    			query.append("ADD ");
    			// TODO escape identifier
    			query.append(escapeIdentifier(fld.getName()));
    	    	query.append(MetadataUtils.SPACE);
    	    	query.append(formatTypeString((Field)fld));
    	    	query.append(MetadataUtils.COMMA);
    		} else {
    			query.append("MODIFY ");    			
    			query.append(escapeIdentifier(fld.getName()));
    	    	query.append(MetadataUtils.SPACE);
    	    	query.append(formatTypeString((Field)fld));
    	    	query.append(MetadataUtils.COMMA);
    		}
    	}
    	query.deleteCharAt(query.length()-1);
    	
		executeQuery(connection, query.toString());
    }
}