package com.singlestore.adapter.singlestore.metadata.adapter;

import com.informatica.sdk.adapter.metadata.provider.AbstractConnection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import com.informatica.sdk.adapter.metadata.common.Status;
import com.informatica.sdk.adapter.metadata.common.StatusEnum;
import java.util.Properties;

public class SingleStoreConnection extends AbstractConnection  {

    private java.sql.Connection nativeConnection = null;


    /**
     * Establishes a connection with the external data source.
     * 
     * @param connAttrs
     *            The list of connection attributes.
     * @return The Status of the connection.
     */

    @Override
    @SuppressWarnings("unused")
    public Status openConnection(Map<String, Object> connAttrs) {
    	String hostname = (String) connAttrs.get("hostname");
    	int port = (int) connAttrs.get("port");
    	String database = (String) connAttrs.get("database");
    	String user = (String) connAttrs.get("user");
    	String password = (String) connAttrs.get("password");
    	boolean useSsl = (boolean) connAttrs.get("useSsl");
    	String serverSslCert = (String) connAttrs.get("serverSslCert");
    	String keyStore = (String) connAttrs.get("keyStore");
    	String keyStorePassword = (String) connAttrs.get("keyStorePassword");
    	String keyPassword = (String) connAttrs.get("keyPassword");
    	String trustStore = (String) connAttrs.get("trustStore");
    	String trustStorePassword = (String) connAttrs.get("trustStorePassword");
    	boolean trustServerCertificate = (boolean) connAttrs.get("trustServerCertificate");
    	boolean disableSslHostnameVerification = (boolean) connAttrs.get("disableSslHostnameVerification");
    			
    	String url = String.format("jdbc:singlestore://%s:%d/%s", hostname, port, database == null ? "" : database);
    	Properties info = new Properties();
    	info.setProperty("user", user);
    	if (password != null) {
     		info.setProperty("password", password);    				
    	}
    	info.setProperty("allowLocalInfile", "true");
    	info.setProperty("connectionAttributes", "_connector_name:SingleStore Informatica CDI Connector,_connector_version:1");
    	
    	if (useSsl) {
        	info.setProperty("useSsl", "true");
        	if (serverSslCert != null) {
        		info.setProperty("serverSslCert", serverSslCert);
        	}
        	if (keyStore != null) {
            	info.setProperty("keyStore", keyStore);
        	}
        	if (keyStorePassword != null) {
            	info.setProperty("keyStorePassword", keyStorePassword);
        	}
        	if (keyStorePassword != null) {
            	info.setProperty("keyPassword", keyPassword);
        	}
        	if (trustStore != null) {
            	info.setProperty("trustStore", trustStore);
        	}
        	if (trustStorePassword != null) {
            	info.setProperty("trustStorePassword", trustStorePassword);
        	}
        	if (trustServerCertificate) {
        		info.setProperty("trustServerCertificate", "true");
        	}
        	if (disableSslHostnameVerification) {
        		info.setProperty("disableSslHostnameVerification", "true");
        	}
    	}
    			
        try {
        	Class.forName("com.singlestore.jdbc.Driver");
    		nativeConnection = DriverManager.getConnection(url, info);
    			
    		return new Status(StatusEnum.SUCCESS, null);
    	} catch (Exception e) {
    		return new Status(StatusEnum.FAILURE, e.getMessage());
    	}
    }



    /**
     * Closes the connection of the data source.
     * 
     * @return The Status of the connection.
     */ 

    @Override
    public Status closeConnection() {
		try {
			nativeConnection.close();
		} catch (Exception e) {
			return new Status(StatusEnum.FAILURE, e.getMessage());
		}
		return new Status(StatusEnum.SUCCESS, null);
    }



    /**
     * A provisional method to access the native connection object that will 
     * be set as a part of the openConnection() method. 
     * 
     * @return The native connection object.
     */ 

    public java.sql.Connection getNativeConnection() {
    	return nativeConnection;
    }



    /**
     * Validates if connection is still open or not by executing a simple query, this is used if testOnBorrow, testOnReturn, testOnCreate is enabled for connection pooling
     * If connector is able to identify a stale/invalid Connection, then overriding the 
     validateConnection API implementation is not mandatory. 
     * Connector will have to throw a InvalidConnectionHandleException in all the metadata adapter APIs.
     */

    @Override
    public Status validateConnection() {
    	String validateConnectionQuery = "SELECT 1";
    	try (Statement stmt = nativeConnection.createStatement()) {
    		stmt.executeQuery(validateConnectionQuery);
    	} catch (SQLException e) {
    		return new Status(StatusEnum.FAILURE, "Following error occurred while executing query  : [" + validateConnectionQuery + "]\n[" + e.getMessage() + "].\n");
    	}
    	return new Status(StatusEnum.SUCCESS, null);       
    }
}