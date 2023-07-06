package com.singlestore.adapter.singlestore.runtime.adapter;

import com.informatica.sdk.adapter.javasdk.dataadapter.DataAdapter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.io.PipedOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.concurrent.ConcurrentHashMap;
import com.informatica.sdk.adapter.javasdk.common.Logger;
import com.informatica.sdk.adapter.javasdk.common.RowsStatInfo;
import com.informatica.sdk.adapter.javasdk.common.ELogLevel;
import com.informatica.sdk.adapter.javasdk.common.EMessageLevel;
import com.informatica.sdk.adapter.javasdk.common.EReturnStatus;
import com.informatica.sdk.adapter.javasdk.common.EIUDIndicator;
import com.informatica.sdk.adapter.javasdk.common.EIndicator;
import com.informatica.sdk.adapter.javasdk.dataaccess.DataSession;
import com.informatica.sdk.adapter.javasdk.metadata.EmetadataHandleTypes;
import com.informatica.sdk.adapter.javasdk.metadata.RuntimeConfigMetadata;
import com.informatica.sdk.adapter.metadata.capabilityattribute.semantic.iface.WriteCapabilityAttributes;
import com.informatica.sdk.adapter.metadata.patternblocks.flatrecord.semantic.iface.FlatRecord;
import com.informatica.sdk.adapter.metadata.patternblocks.constraint.semantic.iface.PrimaryKey;
import com.informatica.sdk.adapter.metadata.patternblocks.field.semantic.iface.Field;
import com.informatica.sdk.adapter.metadata.projection.semantic.iface.NativeField;
import com.informatica.sdk.adapter.metadata.patternblocks.shared.semantic.iface.ImportableObject;
import com.informatica.sdk.adapter.metadata.patternblocks.shared.semantic.iface.Record;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.BinaryExpression;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.Constant;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.DateConstant;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.DecimalConstant;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.FieldIdentifier;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.IntegerConstant;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.LeafExpression;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.StringConstant;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.UnaryExpression;
import com.informatica.sdk.adapter.metadata.projection.helper.semantic.iface.BasicProjectionField;
import com.informatica.sdk.adapter.metadata.projection.helper.semantic.iface.BasicProjectionView;
import com.informatica.sdk.exceptions.SDKException;
import com.informatica.sdk.adapter.javasdk.dataadapter.ReadAttributes;
import com.informatica.sdk.adapter.javasdk.dataadapter.WriteAttributes;
import com.informatica.sdk.adapter.javasdk.dataaccess.DataAttributes;
import com.informatica.sdk.adapter.metadata.projection.sourceoperation.semantic.iface.NativeSource;
import com.informatica.sdk.adapter.javasdk.common.InfaUtils;
import com.singlestore.adapter.singlestore.metadata.adapter.MetadataUtils;
import com.singlestore.adapter.singlestore.metadata.adapter.SingleStoreMetadataAdapter;
import com.singlestore.adapter.singlestore.table.runtime.capability.semantic.iface.SEMTableWriteCapabilityAttributesExtension;
import com.informatica.sdk.adapter.metadata.projection.projectionoperation.semantic.iface.ProjectionOperation;
import com.informatica.sdk.adapter.metadata.projection.filteroperation.semantic.iface.FilterOperation;
import com.informatica.sdk.adapter.metadata.projection.joinoperation.semantic.iface.JoinOperation;
import com.informatica.sdk.adapter.metadata.projection.sortoperation.semantic.iface.SortOperation;
import com.informatica.sdk.adapter.metadata.aso.semantic.iface.ASOOperation;
import com.informatica.sdk.adapter.metadata.projection.semantic.iface.Projection;
import com.informatica.sdk.adapter.metadata.common.datasourceoperation.semantic.iface.Capability;
import com.informatica.sdk.adapter.metadata.projection.semantic.iface.OperationBase;
import com.informatica.sdk.adapter.metadata.common.datasourceoperation.semantic.iface.ReadCapability;
import com.informatica.sdk.adapter.metadata.projection.semantic.iface.FieldBase;
import com.informatica.sdk.adapter.metadata.projection.sortoperation.semantic.iface.SortOrderEnum;
import com.informatica.sdk.adapter.metadata.projection.simpleexpression.semantic.iface.LogicalOperatorEnum;
import com.informatica.sdk.adapter.metadata.projection.simpleexpression.semantic.iface.SimpleBinaryExpression;
import com.informatica.sdk.adapter.metadata.projection.simpleexpression.semantic.iface.SimpleSDKExpression;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.SDKExpression;

public class SingleStoreTableDataAdapter extends DataAdapter {

	private Logger logger = null;
    
    Map<DataSession, Statement> sessionToStatement = new ConcurrentHashMap<DataSession, Statement>();
    Map<DataSession, ResultSet> sessionToResultSet = new ConcurrentHashMap<DataSession, ResultSet>();
    Map<DataSession, List<FieldInfo>> sessionToConnectedFields = new ConcurrentHashMap<DataSession, List<FieldInfo>>();


    public SingleStoreTableDataAdapter(InfaUtils infaUtils) {

    }



	/**
     * Initializes the data session. This method is called once for the current 
     * plugin -> Data Source Object -> Thread and is called sequentially for each thread.
     * 
     * @param dataSession
     *            The dataSession instance, which is the container for SDK handles.
     * @return EReturnStatus The status of the initialization call.
     */

    @Override
    public int initDataSession(DataSession dataSession) throws SDKException  {
		this.logger = dataSession.getInfaUtilsHandle().getLogger();

    	return EReturnStatus.SUCCESS;
    }

    
    
    /**
     * Begins the data session once for the current plugin -> DSO -> thread 
     * which could be called in parallel for each thread. If connection pooling 
     * is enabled, then the same connection can initialize multiple data sessions.
     * 
     * @param dataSession
     *            The Data session instance, which is the container for SDK handles.
     * @return EReturnStatus The status of the begin session call.
     */

    @Override
    public int beginDataSession(DataSession dataSession){
		logger.logMessage(EMessageLevel.MSG_INFO, ELogLevel.TRACE_VERBOSE_INIT, "Beginning data session");
		
		
		RuntimeConfigMetadata runtimeMetadataHandle = (RuntimeConfigMetadata) 
				dataSession.getMetadataHandle(EmetadataHandleTypes.runtimeConfigMetadata);
		
    	List<FieldInfo> connectedFields = getConnectedFields(runtimeMetadataHandle);
    	sessionToConnectedFields.put(dataSession, connectedFields);    	
		
		ASOOperation operation = runtimeMetadataHandle.getAdapterDataSourceOperation();				
		if (isReadOperation(operation)) {
	    	try {
	    		String query = generateReadQuery(operation.getReadProjection(), connectedFields);    		
	            SingleStoreTableDataConnection conn = (SingleStoreTableDataConnection) dataSession.getConnection();
	            java.sql.Connection nativeConn = conn.getNativeConnection();
	            Statement stmt = nativeConn.createStatement();
	            
	        	logger.logMessage(EMessageLevel.MSG_INFO, ELogLevel.TRACE_VERBOSE_INIT, "Executing query: " + query);
	            ResultSet rs = stmt.executeQuery(query);
	            	
	            sessionToStatement.put(dataSession, stmt);
	            sessionToResultSet.put(dataSession, rs);
	        } catch (SQLException ex) {
        		logger.logMessage(EMessageLevel.MSG_ERROR, ELogLevel.TRACE_NONE, ex.getMessage());
        		return EReturnStatus.FAILURE;
        	} catch (Exception ex) {
	    		logger.logMessage(EMessageLevel.MSG_ERROR, ELogLevel.TRACE_NONE, ex.getMessage());
	    		return EReturnStatus.FAILURE;    		
	    	}
		}

		logger.logMessage(EMessageLevel.MSG_INFO, ELogLevel.TRACE_VERBOSE_INIT, "Begun data session");
    	return EReturnStatus.SUCCESS;
    }
    
    public static class QueryGenerationException extends Exception {
		private static final long serialVersionUID = -8063625607758336678L;

		public QueryGenerationException(String message) {
    		super(message);
    	}
    }
    
	static public String generateReadQuery(Projection projection, List<FieldInfo> connectedFields) throws QueryGenerationException {
		String sort = "";
		String filter = "";
		String nativeJoin = "";
		List<String> joinTypes = new ArrayList<String>();
		List<String> joinExpressions = new ArrayList<String>();
		String distinct = "";
		String limit = "";

		BasicProjectionView projectionView = projection.getProjectionHelper();

		for (OperationBase operation : projection.getBaseOperations()) {
			if (operation instanceof SortOperation) {
				SortOperation sortOperation = (SortOperation) operation;

				List<FieldBase> fields = sortOperation.getSortFieldsList();
				List<SortOrderEnum> orders = sortOperation.getSortOrdersEnumList();

				for (int i = 0; i < fields.size(); i++) {
					NativeField nf = (NativeField) fields.get(i).getSourceFieldRef();
					NativeSource ns = (NativeSource) nf.getContainingOperation();

					String tableName = ns.getNativeRecord().getNativeName();
					String columnName = nf.getName();
					String order = orders.get(i) == SortOrderEnum.DESCENDING ? " DESC" : "ASC";

					if (sort.isEmpty()) {
						sort = " ORDER BY ";
					} else {
						sort += ", ";
					}

					sort += String.format("%s.%s %s", tableName, columnName, order);
				}
			} else if (operation instanceof FilterOperation) {
				FilterOperation filterOperation = (FilterOperation) operation;

				if (filterOperation.isNativeFilter()) {
					if (!filter.isEmpty()) {
						filter += " AND ";
					} else {
						filter = " WHERE ";
					}
					filter += String.format("(%s)", filterOperation.getFilterExpression());
				} else {
					for (SDKExpression expression : filterOperation.getInfaSDKExpressions()) {
						if (!filter.isEmpty()) {
							filter += " AND ";
						} else {
							filter = " WHERE ";
						}
						filter += String.format("(%s)", convertExpressionToString(expression));
					}
				}
			} else if (operation instanceof JoinOperation) {
				JoinOperation joinOperation = (JoinOperation) operation;

				if (joinOperation.isNativeJoin()) {
					nativeJoin = joinOperation.getJoinCondition();
				} else {
					switch (joinOperation.getJoinPolicyEnum()) {
					case INNERJOIN:
						joinTypes.add("INNER JOIN");
						break;
					case LEFTOUTERJOIN:
						joinTypes.add("LEFT OUTER JOIN");
						break;
					case RIGHTOUTERJOIN:
						joinTypes.add("RIGHT OUTER JOIN");
						break;
					case FULLOUTERJOIN:
						joinTypes.add("FULL OUTER JOIN");
						break;
					default:
						throw new QueryGenerationException("Unsupported join type");
					}

					joinExpressions.add(convertExpressionToString(joinOperation.getInfaSDKExpression()));
				}
			} else if (operation instanceof ProjectionOperation) {
				ProjectionOperation projectionOperation = (ProjectionOperation) operation;
				switch (projectionOperation.getSelectTypeEnum()) {
				case DISTINCT:
					distinct = " DISTINCT ";
					break;
				case FIRST_ROW:
				case LAST_ROW:
				case ANY:
					limit = " LIMIT 1";
					break;
				default:
				}
			}
		}

		String query = "SELECT ";
		query += distinct;
		query += getColumns(connectedFields, true);
		query += " FROM ";
		query += formatJoin(getTableNames(projectionView.getNativeRecords()), nativeJoin, joinTypes, joinExpressions);
		query += filter;
		query += sort;
		query += limit;
		return query;
	}

	static private List<String> getTableNames(List<ImportableObject> records) {
		return records.stream().map(record -> {
			return ((FlatRecord) record).getNativeName();
		}).collect(Collectors.toList());
	}

	static private String formatJoin(List<String> tableNames, String nativeJoin, List<String> joinTypes,
			List<String> joinExpressions) {
		String join = "";
		for (int i = 0; i < tableNames.size(); i++) {
			if (i != 0) {
				if (nativeJoin.isEmpty() && i - 1 < joinTypes.size()) {
					join += String.format(" %s ", joinTypes.get(i - 1));
				} else {
					join += " INNER JOIN ";
				}
			}

			join += tableNames.get(i);

			if (i != 0 && nativeJoin.isEmpty() && i - 1 < joinExpressions.size()) {
				join += " ON " + joinExpressions.get(i - 1);
			}
		}

		join += " " + nativeJoin;

		return join;
	}

	static private String convertExpressionToString(SDKExpression expression) throws QueryGenerationException {
		if (expression instanceof SimpleSDKExpression) {
			SimpleSDKExpression simpleExpression = (SimpleSDKExpression) expression;
			List<SimpleBinaryExpression> binaryExpressions = simpleExpression.getSimpleBinaryExpressions();
			LogicalOperatorEnum operator = simpleExpression.getLogicalOperator();			
			List<String> binaryExpressionStrings = new ArrayList<String>();
			for (SimpleBinaryExpression binaryExpression: binaryExpressions) {
				binaryExpressionStrings.add(String.format("(%s)", convertExpressionToString(binaryExpression)));
			}

			switch (operator) {
			case OR:
				return String.join(" OR ", binaryExpressionStrings);
			case AND:
				return String.join(" AND ", binaryExpressionStrings);
			default:
				throw new QueryGenerationException(String.format("Unsupported logical operator %s", operator));		
			}
		} else if (expression instanceof UnaryExpression) {
			UnaryExpression unaryExpression = (UnaryExpression) expression;
			switch (unaryExpression.getUnaryOperator()) {
			case NOT:
				return String.format("NOT (%s)", convertExpressionToString(unaryExpression.getUnaryOperand()));
			default:
				throw new QueryGenerationException(String.format("Unsupported unary expression %s", unaryExpression.getUnaryOperator()));
			}
		} else if (expression instanceof BinaryExpression) {
			BinaryExpression binaryExpression = (BinaryExpression) expression;
			String left = convertExpressionToString(binaryExpression.getLeftOperand());
			String right = convertExpressionToString(binaryExpression.getRightOperand());

			switch (binaryExpression.getBinaryOperator()) {
			case PLUS:
				return String.format("(%s) + (%s)", left, right);
			case MINUS:
				return String.format("(%s) - (%s)", left, right);
			case DIVIDE:
				return String.format("(%s) / (%s)", left, right);
			case MULTIPLY:
				return String.format("(%s) * (%s)", left, right);
			case MOD:
				return String.format("(%s) % (%s)", left, right);
			case EQUALS:
				return String.format("(%s) = (%s)", left, right);
			case NOT_EQUALS:
				return String.format("(%s) != (%s)", left, right);
			case LESS:
				return String.format("(%s) < (%s)", left, right);
			case LESS_OR_EQUALS:
				return String.format("(%s) <= (%s)", left, right);
			case GREATER:
				return String.format("(%s) > (%s)", left, right);
			case GREATER_OR_EQUALS:
				return String.format("(%s) >= (%s)", left, right);
			case AND:
				return String.format("(%s) AND (%s)", left, right);
			case OR:
				return String.format("(%s) OR (%s)", left, right);
			case CONTAINS:
				return String.format("LIKE(%s, CONCAT(CONCAT('%', %s), '%')", left, right);
			case STARTS_WITH:
				return String.format("LIKE(%s, CONCAT(%s, '%')", left, right);
			case ENDS_WITH:
				return String.format("LIKE(%s, CONCAT('%', %s)", left, right);
			case IS_NULL:
				return String.format("(%s IS NULL)", left);
			case IS_NOT_NULL:
				return String.format("(%s IS NOT NULL)", right);
			default:
				throw new QueryGenerationException (String.format("Unsupported binary expression %s", binaryExpression.getBinaryOperator()));
			}
		} else if (expression instanceof LeafExpression) {
			// TODO use parameterization
			LeafExpression leafExpression = (LeafExpression) expression;
			if (leafExpression instanceof Constant) {
				Constant constant = (Constant) leafExpression;
				if (constant instanceof DateConstant) {
					DateConstant dateConstant = (DateConstant) constant;
					java.util.Date date = dateConstant.getDateValue();
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					return String.format("'%s'", formatter.format(date));
				} else if (constant instanceof DecimalConstant) {
					DecimalConstant decimalConstant = (DecimalConstant) constant;
					BigDecimal decimal = decimalConstant.getDecimalDataValue();
					return Double.toString(decimal.doubleValue());
				} else if (constant instanceof IntegerConstant) {
					IntegerConstant integerConstant = (IntegerConstant) constant;
					BigInteger integer = integerConstant.getIntegerDataValue();
					return Long.toString(integer.longValue());
				} else if (constant instanceof StringConstant) {
					StringConstant stringConstant = (StringConstant) constant;
					String string = stringConstant.getStringDataValue();
					return String.format("'%s'", string.replace("\\", "\\\\").replace("'", "\\'"));
				} else {
					throw new QueryGenerationException (String.format("Unsupported constant expression %s", constant));
				}
			} else if (leafExpression instanceof FieldIdentifier) {
				FieldIdentifier fieldIdentifier = (FieldIdentifier) leafExpression;
				Field field = (Field) fieldIdentifier.getNativeFieldRef();
				if (field == null) {
					return "NULL";
				}

				String tableName = field.getParentRecord().getNativeName();
				String columnName = field.getNativeName();
				return String.format("%s.%s", tableName, SingleStoreMetadataAdapter.escapeIdentifier(columnName));
			} else {
				throw new QueryGenerationException (String.format("Unsupported leaf expression %s", leafExpression));
			}
		} else {
			throw new QueryGenerationException (String.format("Unsupported expression %s", expression));
		}
	}
    
    static public boolean isReadOperation(ASOOperation operation) {
    	Capability capability = operation.getCapabilities().get(0);
    	return capability instanceof ReadCapability;
    }
    
	private List<FieldInfo> getConnectedFields(RuntimeConfigMetadata runtimeMetadataHandle) {
		BasicProjectionView projectionView = runtimeMetadataHandle.getBasicProjection();
    	List<BasicProjectionField> projectionFields = projectionView.getProjectionFields();
    	
		ArrayList<FieldInfo> fields = new ArrayList<FieldInfo>();
		for (int i = 0; i < projectionFields.size(); i++) {
			if (runtimeMetadataHandle.isFieldConnected(i)) {
				FieldInfo f = new FieldInfo(projectionFields.get(i), i);
				fields.add(f);
			}
		}
		return fields;
	}
    
    private static String getColumns(List<FieldInfo> connectedFields, boolean addTableName) {
    	StringBuilder res = new StringBuilder();
    	for (FieldInfo f: connectedFields) {
    		if (res.length() != 0) {
				res.append(MetadataUtils.COMMA);
			}
			
			BasicProjectionField field = f.field;    			
			Field nativeField = field.getNativeFieldRef();
			String columnName = nativeField.getNativeName();
			
			if (addTableName) {
				Record parentRecord = nativeField.getParentRecord();
				String tableName = parentRecord.getNativeName();
				res.append(tableName);
				res.append(MetadataUtils.DOT);				
			}

			res.append(SingleStoreMetadataAdapter.escapeIdentifier(columnName));
    	}
    	
    	return res.toString();
    }


    /**
     * Ends the data session once for the current plugin -> DSO -> thread which 
     * could be called in parallel for each thread. If connection pooling is enabled, 
     * then the same connection can initialize multiple data sessions.
     * 
     * @param dataSession
     *            The Data session instance, which is the container for SDK handles.
     * @return EReturnStatus The status of the end session call.
     */

    @Override
    public int endDataSession(DataSession dataSession) {
		RuntimeConfigMetadata runtimeMetadataHandle = (RuntimeConfigMetadata) 
				dataSession.getMetadataHandle(EmetadataHandleTypes.runtimeConfigMetadata);
		ASOOperation operation = runtimeMetadataHandle.getAdapterDataSourceOperation();
		if (!isReadOperation(operation)) {
    		return EReturnStatus.SUCCESS;			
		}
		
    	try {
        	sessionToResultSet.get(dataSession).close();    		
        	sessionToStatement.get(dataSession).close();    		
    	} catch (SQLException ex) {
    		logger.logMessage(EMessageLevel.MSG_ERROR, ELogLevel.TRACE_NONE, ex.getMessage());
    		return EReturnStatus.FAILURE;
    	}

    	sessionToResultSet.remove(dataSession);
    	sessionToStatement.remove(dataSession);
    	sessionToConnectedFields.remove(dataSession);
    	return EReturnStatus.SUCCESS;
    }



    /**
     * Deinitializes the data session. This method is called once for the current 
     * plugin -> Data Source Object -> Thread and is called sequentially for each thread.
     * 
     * @param dataSession
     *            The dataSession instance, which is the container for SDK handles.
     * @return EReturnStatus The status of the deinitialization call.
     */

    @Override
    public int deinitDataSession(DataSession dataSession) {
    	return EReturnStatus.SUCCESS;
    }



    /**
     * Reads data from the external data source. Returning NO_MORE_DATA after 
     * completion of reading data, stops calling the read method again. Returning 
     * a success informs SDK to continue calling the method.
     * 
     * @param dataSession
     *            The dataSession instance, which is the container for SDK handles.
     * @param readAttr
     *            The ReadAttributes that provides access to the read specific 
     *			  attributes for the data adapter passed during the read phase.
     * @return EReturnStatus The status of the read call.
     */

    @Override
    public int read(DataSession dataSession, ReadAttributes readAttr) throws SDKException  {
    	int rowsToRead = readAttr.getNumRowsToRead();

    	ResultSet rs = sessionToResultSet.get(dataSession);
    	List<FieldInfo> connectedFields = sessionToConnectedFields.get(dataSession);
    	int rowsRead = 0;
    	try {
    		ResultSetMetaData md = rs.getMetaData();
        	while ((rowsRead < rowsToRead) && rs.next()) {
        		for (int i = 0; i < md.getColumnCount(); i++) {
        			setDataToPlatform(dataSession, rs, connectedFields, rowsRead, i);
        		}
        		rowsRead++;
        	}    		
    	} catch (Exception ex) {
    		logger.logMessage(EMessageLevel.MSG_ERROR, ELogLevel.TRACE_NONE, ex.getMessage());
    		readAttr.setNumRowsRead(rowsRead);
	    	return EReturnStatus.FAILURE;						
    	}
    	
		readAttr.setNumRowsRead(rowsRead);
		
		logger.logMessage(EMessageLevel.MSG_TRACE, ELogLevel.TRACE_VERBOSE_DATA, String.format("Read %d rows out of %d", rowsRead, rowsToRead));
		if (rowsRead < rowsToRead) {
	    	return EReturnStatus.NO_MORE_DATA;			
		} else {
	    	return EReturnStatus.SUCCESS;						
		}
    }



    private void setDataToPlatform(DataSession dataSession, ResultSet rs, List<FieldInfo> connectedFields, int rowNum, int colNum) throws SDKException , SQLException {
		DataAttributes attributes = new DataAttributes();
		attributes.setDataSetId(0);
		attributes.setColumnIndex(connectedFields.get(colNum).index);
		attributes.setRowIndex(rowNum);

		String dataType = connectedFields.get(colNum).field.getNativeFieldRef().getDataType();

		if (dataType.equalsIgnoreCase("DOUBLE") ||
				dataType.equalsIgnoreCase("REAL")) {
			Double data = rs.getDouble(colNum+1);
			setIndicator(data, attributes);
			dataSession.setDoubleData(data, attributes);
		} else if (dataType.equalsIgnoreCase("FLOAT")) {
			Float data = rs.getFloat(colNum+1);
			setIndicator(data, attributes);
			dataSession.setFloatData(data, attributes);
		} else if (dataType.equalsIgnoreCase("BIGINT")) {
			Long data = rs.getLong(colNum+1);
			setIndicator(data, attributes);
			dataSession.setLongData(data, attributes);
		} else if (dataType.equalsIgnoreCase("TINYINT") ||
				dataType.equalsIgnoreCase("SMALLINT") ||
				dataType.equalsIgnoreCase("BOOLEAN") ||
				dataType.equalsIgnoreCase("BOOL")) {
			Short data = rs.getShort(colNum+1);
			setIndicator(data, attributes);
			dataSession.setShortData(data, attributes);
		} else if (dataType.equalsIgnoreCase("INT") ||
				dataType.equalsIgnoreCase("INTEGER") || 
				dataType.equalsIgnoreCase("MEDIUMINT")) {
			Integer data = rs.getInt(colNum+1);
			setIndicator(data, attributes);
			dataSession.setIntData(data, attributes);
		} else if (dataType.equalsIgnoreCase("DATE") ||
				dataType.equalsIgnoreCase("TIME") ||
				dataType.equalsIgnoreCase("DATETIME") ||
				dataType.equalsIgnoreCase("TIMESTAMP") ||
				dataType.equalsIgnoreCase("YEAR")) {
			Timestamp data = rs.getTimestamp(colNum+1);
			setIndicator(data, attributes);
			dataSession.setDateTimeData(data, attributes);
		} else if (dataType.equalsIgnoreCase("BIT") || 
				dataType.equalsIgnoreCase("VARBINARY") || 
				dataType.equalsIgnoreCase("BINARY") || 
				dataType.equalsIgnoreCase("BLOB") || 
				dataType.equalsIgnoreCase("TINYBLOB") || 
				dataType.equalsIgnoreCase("MEDIUMBLOB") || 
				dataType.equalsIgnoreCase("LONGBLOB")) {
			byte[] data = rs.getBytes(colNum+1);
			setIndicator(data, attributes);
			dataSession.setBinaryData(data, attributes);
		} else if (dataType.equalsIgnoreCase("DECIMAL") || 
				dataType.equalsIgnoreCase("DEC") || 
				dataType.equalsIgnoreCase("FIXED") || 
				dataType.equalsIgnoreCase("NUMERIC")) {
			BigDecimal data = rs.getBigDecimal(colNum+1);
			setIndicator(data, attributes);
			dataSession.setBigDecimalData(data, attributes);
		} else {
			String data = rs.getString(colNum+1);
			if (data == null) {
				attributes.setLength(0);
				attributes.setIndicator(EIndicator.NULL);
			} else {
				int fieldLength = connectedFields.get(colNum).field.getPrec();
				if (data.length() > fieldLength) {
					data = data.substring(0, fieldLength);
					attributes.setIndicator(EIndicator.TRUNCATED);
				} else {
					attributes.setIndicator(EIndicator.VALID);
				}
				
				attributes.setLength(data.length());
			}

			dataSession.setStringData(data, attributes);
		}
    }
    
    
    
    private void setIndicator(Object data, DataAttributes attributes) {
		if (data == null) {
			attributes.setIndicator(EIndicator.NULL);				
		} else {
			attributes.setIndicator(EIndicator.VALID);				
		}
    }

    public static class WritingException extends Exception {
		private static final long serialVersionUID = -8063625607758336678L;

		public WritingException(String message) {
    		super(message);
    	}
    }

    /**
     * Writes data to the external data source. The SDK continues to call this 
     * method until it completes writing data to the data source.
     * 
     * @param dataSession
     *            The dataSession instance, which is the container for SDK handles.
     * @param writeAttr
     *            The WriteAttributes that provides access to the write specific 
     *			  attributes for the data adapter passed during the read phase.
     * @return EReturnStatus The status of the write call.
     */

    @Override
    public int write(DataSession dataSession, WriteAttributes writeAttr) throws SDKException  {
    	int rowsToWrite = writeAttr.getNumRowsToWrite();
    	SingleStoreTableDataConnection conn = (SingleStoreTableDataConnection)dataSession.getConnection();
    	java.sql.Connection nativeConn = conn.getNativeConnection();
    	
    	RuntimeConfigMetadata runtimeMetadataHandle = (RuntimeConfigMetadata) 
				dataSession.getMetadataHandle(EmetadataHandleTypes.runtimeConfigMetadata);

		
    	BasicProjectionView projectionView = runtimeMetadataHandle.getBasicProjection();
    	FlatRecord fr = (FlatRecord) projectionView.getNativeRecords().get(0);
    	String tableName = fr.getNativeName();
    	
    	ASOOperation operation = runtimeMetadataHandle.getAdapterDataSourceOperation();
		WriteCapabilityAttributes currPartInfo = operation.getWriteCapabilityAttributes();
		final boolean isUpsert = isUpsert(currPartInfo);
		logger.logMessage(EMessageLevel.MSG_TRACE, ELogLevel.TRACE_VERBOSE_DATA, "Writing data update mode: " + isUpsert);

    	List<FieldInfo> connectedFields = sessionToConnectedFields.get(dataSession);
		
    	PrimaryKey pk = fr.getPrimaryKey();

    	
    	List<Integer> insertIds = new ArrayList<Integer>();
    	List<Integer> deleteIds = new ArrayList<Integer>();
    	List<Integer> updateIds = new ArrayList<Integer>();
    	
    	for (int row = 0; row < rowsToWrite; row++) {
    		int rowIUDIndicator = runtimeMetadataHandle.getRowIUDIndicator(row);
    		switch (rowIUDIndicator) {
    		case EIUDIndicator.INSERT:
    		case EIUDIndicator.STREAMING_INSERT:
    			insertIds.add(row);
    			break;
    		case EIUDIndicator.UPDATE:
    			updateIds.add(row);
    			break;
    		case EIUDIndicator.DELETE:
    			deleteIds.add(row);
    			break;
    		default:
    		}
    	}

    	try (com.singlestore.jdbc.Statement stmt = (com.singlestore.jdbc.Statement)nativeConn.createStatement()) {
    		if (insertIds.size() != 0) {
    			performWrite(new LoadDataWriter(dataSession, stmt, connectedFields, tableName, false), insertIds);
    		}
    		
    		if (deleteIds.size() != 0) {
    			performWrite(new DeleteWriter(dataSession, stmt, connectedFields, tableName, pk), deleteIds);
    		}

    		if (updateIds.size() != 0) {
    			if (isUpsert) {
    				performWrite(new LoadDataWriter(dataSession, stmt, connectedFields, tableName, true), updateIds);
    			} else {
    				performWrite(new UpdateWriter(dataSession, stmt, connectedFields, tableName, pk), updateIds);
    			}
    		}
    	} catch (SQLException|SDKException|WritingException|IOException|InterruptedException e) {
    		logger.logMessage(EMessageLevel.MSG_ERROR, ELogLevel.TRACE_NONE, e.getMessage());
			return EReturnStatus.FAILURE;    		
    	}

    	return EReturnStatus.SUCCESS;
    }
    
    private void performWrite(Writer writer, List<Integer> ids) throws WritingException, SQLException, SDKException, IOException, InterruptedException {
    	writer.write(ids);
    	writer.finish();
    }
    
    List<Integer> primaryKeyColumns(PrimaryKey pk, List<FieldInfo> connectedFields) throws WritingException {
    	List<Integer> primaryKeyColumns = new ArrayList<Integer>();
    	if (pk == null) {
    		throw new WritingException("No primary key is defined");
    	}
    	
    	
    	for (Field f: pk.getFieldList()) {
    		Integer index = null;
    		for (int i = 0; i < connectedFields.size(); i++) {
    			if (connectedFields.get(i).field.getNativeFieldRef().getName() == f.getName()) {
    				index = i;
    				break;
    			}
    		}
    		if (index == null) {
    			throw new WritingException(String.format("Failed to find '%s' column in the connected columns", f.getName()));
    		}
    			
    		primaryKeyColumns.add(index);
    	}

    	return primaryKeyColumns;
    }
    
    private abstract class Writer {
		RowsStatInfo stat;

    	public void write(List<Integer> rows) throws SDKException, WritingException, SQLException, IOException {
    		for (Integer row: rows) {
    			write(row);
    		}
    	}
    	
    	public abstract void write(int row) throws SDKException, WritingException, SQLException, IOException;
    	public abstract void finish() throws SDKException, WritingException, SQLException, IOException, InterruptedException;
    }
    
    private RowsStatInfo getRowsStatInfo(DataSession dataSession, int indicator) {
		RuntimeConfigMetadata runtimeMd = (RuntimeConfigMetadata) dataSession
				.getMetadataHandle(EmetadataHandleTypes.runtimeConfigMetadata);
		
		return runtimeMd.getRowsStatInfo(indicator);
    }
    
    
    private class DeleteWriter extends Writer {
    	Statement stmt;
    	final int BATCH_SIZE = 10000;
    	List<Integer> batch = new ArrayList<Integer>();
    	String tableName;
    	List<Integer> primaryKeyIndexes;
    	List<FieldInfo> connectedFields;
		DataSession dataSession;
    	
    	public DeleteWriter(DataSession dataSession, com.singlestore.jdbc.Statement stmt, List<FieldInfo> connectedFields, String tableName, PrimaryKey pk) throws WritingException {
    		this.stmt = stmt;
    		this.dataSession = dataSession;
    		this.tableName = tableName;
    		this.connectedFields = connectedFields;
    		this.stat = getRowsStatInfo(dataSession, EIUDIndicator.DELETE);
    		this.primaryKeyIndexes = primaryKeyColumns(pk, connectedFields);
    	}
    	
    	public void write(int row) throws SDKException, WritingException, SQLException {
    		batch.add(row);
    		if (batch.size() == BATCH_SIZE) {
    			try {
    	    		stat.incrementRequested(batch.size());
    	    		try {
    	        		int affected = processBatch();
    	        		stat.incrementApplied(batch.size());
    	        		stat.incrementAffected(affected);
    	    		} catch (Exception e) {
    	    			stat.incrementRejected(batch.size());
    	    			throw e;
    	    		}
    			} finally {
    				batch.clear();
    			}
    		}
    	}
    	
    	private int processBatch() throws SDKException, WritingException, SQLException {
    		if (batch.size() == 0) {
    			return 0;
    		}
    		
    		stat.incrementRequested(batch.size());

        	StringBuilder query = new StringBuilder(String.format("DELETE FROM %s WHERE ", tableName));
        	for (int i = 0; i < batch.size(); i++) {
        		if (i != 0) {
        			query.append(" OR ");
        		}
        			
        		query.append("(");
        		for (int j = 0; j < primaryKeyIndexes.size(); j++) {
        			if (j != 0) {
        				query.append(" AND ");
        			}
        				
        			Integer primaryKeyIndex = primaryKeyIndexes.get(j);
        			BasicProjectionField field = connectedFields.get(primaryKeyIndex).field;
        			query.append(SingleStoreMetadataAdapter.escapeIdentifier(field.getNativeFieldRef().getName()));
        			query.append(" = ");
        				
        				
        			DataAttributes attributes = new DataAttributes();
        			attributes.setRowIndex(batch.get(i));
        			attributes.setColumnIndex(connectedFields.get(primaryKeyIndex).index);
        			attributes.setDataSetId(0); // currently 0

        			query.append(escapeLiteral(getFieldValue(dataSession, attributes, field)));
        		}
        		query.append(")");
        	}
        		
        	String queryString = query.toString();
        	logger.logMessage(EMessageLevel.MSG_TRACE, ELogLevel.TRACE_VERBOSE_DATA, "Executing query: " + queryString);
    		return stmt.executeUpdate(queryString);    		
    	}
    	
    	public void finish() throws SDKException, WritingException, SQLException {
    		stat.incrementRequested(batch.size());
    		try {
        		int affected = processBatch();
        		stat.incrementAffected(affected);
        		stat.incrementApplied(affected);
    		} catch (Exception e) {
    			stat.incrementRejected(batch.size());
    			throw e;
    		}
    	}
    }
    
    private class UpdateWriter extends Writer {
    	Statement stmt;
    	String tableName;
    	List<Integer> primaryKeyIndexes;
    	List<FieldInfo> connectedFields;
		DataSession dataSession;

    	public UpdateWriter(DataSession dataSession, com.singlestore.jdbc.Statement stmt, List<FieldInfo> connectedFields, String tableName, PrimaryKey pk) throws WritingException {
    		this.stmt = stmt;
    		this.dataSession = dataSession;
    		this.tableName = tableName;
    		this.connectedFields = connectedFields;
    		this.stat = getRowsStatInfo(dataSession, EIUDIndicator.UPDATE);
    		try {
    			primaryKeyIndexes = primaryKeyColumns(pk, connectedFields);
    		} catch (Exception e) {
    			// TODO create better error message
    			throw e;
    		}
    	}
    	
    	public void write(int row) throws WritingException, SDKException, SQLException {
    		stat.incrementRequested(1);
    		try {
        		StringBuffer query = new StringBuffer("UPDATE ");
        		// TODO escape
        		query.append(tableName);
        		query.append(" SET ");
        		
        		for (int i = 0; i < connectedFields.size(); i++) {
    				BasicProjectionField field = connectedFields.get(i).field;
    				// TODO escape
    				query.append(field.getNativeFieldRef().getName());
    				query.append(" = ");

        			
    				DataAttributes attributes = new DataAttributes();
    				attributes.setRowIndex(row);
    				attributes.setColumnIndex(connectedFields.get(i).index);
    				attributes.setDataSetId(0); // currently 0

    				query.append(escapeLiteral(getFieldValue(dataSession, attributes, field)));
    				if (i+1 != connectedFields.size()) {
    					query.append(", ");					
    				}
        		}
        		
        		query.append(" WHERE ");
        		
        		for (int i = 0; i < primaryKeyIndexes.size(); i++) {
    				if (i != 0) {
    					query.append(" AND ");
    				}
        			
        			Integer primaryKeyIndex = primaryKeyIndexes.get(i);
    				BasicProjectionField field = connectedFields.get(primaryKeyIndex).field;
    				// TODO escape
    				query.append(field.getNativeFieldRef().getName());
    				query.append(" = ");
    				
    				
    				DataAttributes attributes = new DataAttributes();
    				attributes.setRowIndex(row);
    				attributes.setColumnIndex(connectedFields.get(primaryKeyIndex).index);
    				attributes.setDataSetId(0); // currently 0

    				query.append(escapeLiteral(getFieldValue(dataSession, attributes, field)));
    		    }
        		
        		String queryString = query.toString();
        		logger.logMessage(EMessageLevel.MSG_TRACE, ELogLevel.TRACE_VERBOSE_DATA, "Executing query: " + queryString);
        		int affected = stmt.executeUpdate(queryString); 
        		stat.incrementApplied(1);
        		stat.incrementAffected(affected);
    		} catch (Exception e) {
        		stat.incrementRejected(1);
    			throw e;
    		}
    	}

    	public void finish() {}
    }
    
    private class LoadDataWriter extends Writer {
        final int BUFFER_SIZE = 524288;
		PipedOutputStream outputStream = new PipedOutputStream();
		PipedInputStream inputStream;
		List<FieldInfo> connectedFields;
		DataSession dataSession;
		int affected = 0;
		Thread t;
		final SQLException[] queryException = new SQLException[1];
    	
    	public LoadDataWriter(DataSession dataSession, com.singlestore.jdbc.Statement stmt, List<FieldInfo> connectedFields, String tableName, boolean upsert) throws SQLException, IOException {
    		this.inputStream = new PipedInputStream(outputStream, BUFFER_SIZE);
    		this.connectedFields = connectedFields;
    		this.dataSession = dataSession;
    		if (upsert) {
        		this.stat = getRowsStatInfo(dataSession, EIUDIndicator.UPDATE);
    		} else {
        		this.stat = getRowsStatInfo(dataSession, EIUDIndicator.INSERT);    			
    		}
    		stmt.setNextLocalInfileInputStream(inputStream);

    		t = new Thread(new Runnable() {
    		    @Override
    		    public void run() {
    		    	try {
    		    		String query = String.format("LOAD DATA LOCAL INFILE '###.tsv' %s INTO TABLE %s (%s)", upsert ? "REPLACE" : "", tableName, getColumns(connectedFields, false));
    		    		logger.logMessage(EMessageLevel.MSG_INFO, ELogLevel.TRACE_VERBOSE_DATA, String.format("Executing query: %s", query));
    		    		affected = stmt.executeUpdate(query);
    		    		logger.logMessage(EMessageLevel.MSG_INFO, ELogLevel.TRACE_VERBOSE_DATA, String.format("Finished query execution: %s", query));
    		    	} catch (SQLException e) {
    		    		queryException[0] = e;
    		    	}
    		    }
    		});
    		t.start();
    	}
    	

    	public void write(int row) throws SQLException, SDKException, IOException, WritingException {
    		stat.incrementRequested(1);
    		for (int i = 0; i < connectedFields.size(); i++) {
				BasicProjectionField field = connectedFields.get(i).field;
				
				DataAttributes attributes = new DataAttributes();
				attributes.setRowIndex(row);
				attributes.setColumnIndex(connectedFields.get(i).index);
				attributes.setDataSetId(0); // currently 0

				byte []valueOfTheField = escapeTSV(getFieldValue(dataSession, attributes, field));
				logger.logMessage(EMessageLevel.MSG_INFO, ELogLevel.TRACE_VERBOSE_DATA, String.format("Writing data to LOAD DATA stream - data %s - column %d", new String(valueOfTheField, StandardCharsets.UTF_8), i));
				
				outputStream.write(valueOfTheField);
				if (i != connectedFields.size() - 1) {
					outputStream.write('\t');
				} else {
					outputStream.write('\n');    								
				}
    		}
    	}
    	
    	public void finish() throws SQLException, IOException, InterruptedException,SDKException {
    		try {
        		outputStream.close();
        		t.join();
        		if (queryException[0] != null) {
        			throw queryException[0];
        		}
        		stat.incrementAffected(affected);
        		stat.incrementApplied(stat.getRequestedRows());
    		} catch (Exception e) {
        		stat.incrementRejected(stat.getRequestedRows());    			
    			throw e;
    		}
    	}
    }

    
    
    private boolean isUpsert(WriteCapabilityAttributes currPartInfo) {
    	if (currPartInfo != null) {
			SEMTableWriteCapabilityAttributesExtension partAttris = (SEMTableWriteCapabilityAttributesExtension) (currPartInfo)
					.getExtensions();
			return partAttris.getUpdateMode().equalsIgnoreCase("Update Else Insert");
		}
		return false;
    }
   
    

    /**
     * This API returns the value for individual fields in a write data row
     * @param dataSession
     * @param pDataAttributes
     * @param field
     * @return
     * @throws SDKException
     */

    private Object getFieldValue(DataSession dataSession, DataAttributes pDataAttributes, BasicProjectionField field) throws SDKException, WritingException {
    	String dataType = field.getDataType();
		logger.logMessage(EMessageLevel.MSG_INFO, ELogLevel.TRACE_VERBOSE_DATA, String.format("Parsing data - type %s - column %d", dataType, pDataAttributes.getColumnIndex()));
    	switch (dataType.toLowerCase()) {
    	case "string":
    		return dataSession.getStringData(pDataAttributes);
    	case "integer":
    		return dataSession.getIntData(pDataAttributes);
    	case "bigint":
    		return dataSession.getLongData(pDataAttributes);
    	case "double":
    		return dataSession.getDoubleData(pDataAttributes);
    	case "date/time":
    		return dataSession.getDateTimeData(pDataAttributes);
    	case "decimal":
    		return dataSession.getBigDecimalData(pDataAttributes);
    	case "binary":
    		return dataSession.getBinaryData(pDataAttributes);
    	default:
    		throw new WritingException(String.format("Unknown data type: %s", dataType));
    	}
    }
    
    private String escapeLiteral(Object data) {
    	if (data == null) {
    		return "NULL";
    	}
    	
    	if (data instanceof byte[]) {
    		data = new String((byte[])data, StandardCharsets.UTF_8);
    	}
    	
    	if (data instanceof String || data instanceof java.sql.Timestamp) {
    		return String.format("'%s'", data.toString().replace("\\", "\\\\").replace("'", "\\'"));
    	} else {
    		return data.toString();
    	}
    }

    private byte[] escapeTSV(Object data) {
    	if (data == null) {
    		return "\\N".getBytes();
    	}
    	
    	String stringData;
    	if (data instanceof byte[]) {
    		stringData = new String((byte[])data, StandardCharsets.UTF_8);
    	} else {
    		stringData = data.toString();
    	}

    	if (stringData.contains("\\")) {
    		stringData = stringData.replaceAll("\\", "\\\\");
    	}
    	if (stringData.contains("\n")) {
    		stringData = stringData.replaceAll("\n", "\\\n");
    	}
    	if (stringData.contains("\t")) {
    		stringData = stringData.replaceAll("\t", "\\\t");
    	}
    	
    	return stringData.getBytes();
    }


    /**
     * This API should be implemented by adapter developer in conjunction with read
     * API to implement lookup. SDK will provide updated filter condition with reset API.
     * Adapter developer are expected to reset the adapter context in reset API. 
     * 
     * @param dataSession
     *            DataSession instance
     * @return EReturnStatus
     */

    @Override
    public int reset(DataSession dataSession) throws SDKException  {
    	return EReturnStatus.SUCCESS;
    }



    /*
     * Class holding information about the projected field and the index 
     * 
     */
    private class FieldInfo {
    	BasicProjectionField field;
    	int index;
    	public FieldInfo(BasicProjectionField field, int index) {
    		super();
    		this.field = field;
    		this.index = index;
    	}
    }
}