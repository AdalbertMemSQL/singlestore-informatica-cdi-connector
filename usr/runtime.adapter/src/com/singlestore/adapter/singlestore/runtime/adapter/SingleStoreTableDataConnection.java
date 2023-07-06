package com.singlestore.adapter.singlestore.runtime.adapter;

import com.informatica.sdk.adapter.javasdk.dataadapter.Connection;
import java.util.Map;
import java.util.HashMap;
import com.informatica.sdk.adapter.javasdk.common.ELogLevel;
import com.informatica.sdk.adapter.javasdk.common.EMessageLevel;
import com.informatica.sdk.adapter.javasdk.common.EReturnStatus;
import com.informatica.sdk.adapter.javasdk.common.Logger;
import com.informatica.sdk.adapter.javasdk.metadata.MetadataContext;
import com.informatica.sdk.adapter.metadata.common.Status;
import com.informatica.sdk.adapter.metadata.common.StatusEnum;
import com.informatica.sdk.exceptions.SDKException;
import com.singlestore.adapter.singlestore.metadata.adapter.SingleStoreConnection;

public class SingleStoreTableDataConnection extends Connection  {

    private Logger logger = null;

    private SingleStoreConnection metadataConn = new SingleStoreConnection();

    public SingleStoreTableDataConnection(Logger infaLogger) {
     	this.logger = infaLogger; 
    }



    /**
     * Connects to the external data source. This method reuses the metadata connection to connect to the data source. 
     * Optionally, override this method if you want use a connection that is different from the metadata connection.
     * @param connHandle The connection handle.
     * @return An integer value defined in the EReturnStatus class that indicates the status of the connect operation.
     * @throws SDKException
     */

    @Override
    public int connect(MetadataContext connHandle) {
        Map<String,Object> attrMap = new HashMap<String,Object>();

        try {
        	attrMap.put("hostname", connHandle.getStringAttribute("hostname"));
        	attrMap.put("port", connHandle.getIntegerAttribute("port"));
        	attrMap.put("database", connHandle.getStringAttribute("database"));
        	attrMap.put("user", connHandle.getStringAttribute("user"));
        	attrMap.put("password", connHandle.getStringAttribute("password"));
        	attrMap.put("useSsl", connHandle.getBooleanAttribute("useSsl"));
        	attrMap.put("serverSslCert", connHandle.getStringAttribute("serverSslCert"));
        	attrMap.put("keyStore", connHandle.getStringAttribute("keyStore"));
        	attrMap.put("keyStorePassword", connHandle.getStringAttribute("keyStorePassword"));
        	attrMap.put("keyPassword", connHandle.getStringAttribute("keyPassword"));
        	attrMap.put("trustStore", connHandle.getStringAttribute("trustStore"));
        	attrMap.put("trustStorePassword", connHandle.getStringAttribute("trustStorePassword"));
        	attrMap.put("trustServerCertificate", connHandle.getBooleanAttribute("trustServerCertificate"));
        	attrMap.put("disableSslHostnameVerification", connHandle.getBooleanAttribute("disableSslHostnameVerification"));

        	return checkStatus(metadataConn.openConnection(attrMap));
        } catch (SDKException e) {
        	logger.logMessage(EMessageLevel.MSG_ERROR, ELogLevel.TRACE_NONE, e.getMessage());
        	return EReturnStatus.FAILURE;
        }
    }

    
    
    private int checkStatus(Status status) {
    	if(status.getStatus() == StatusEnum.SUCCESS) {
    		return EReturnStatus.SUCCESS;
       	} else {
       		String msg = status.getMessage();
       		if(msg != null) {
       			logger.logMessage(EMessageLevel.MSG_ERROR, ELogLevel.TRACE_NONE, msg);
       		}
       		return EReturnStatus.FAILURE;
       	}
    }
    


    /**
     * Closes the connection with the external data source. This method reuses the metadata connection to disconnect from the data source. 
     * Optionally, override this method if you want use a connection that is different from the metadata connection.
     * @param connHandle The connection handle.
     * @return An integer value defined in the EReturnStatus class that indicates the status of the disconnect operation.
     */                           

    @Override
    public int disConnect(MetadataContext connHandle) {
    	return checkStatus(metadataConn.closeConnection());
    }



    /**
     * Gets the connection with the external data source. This method reuses the metadata connection to connect to the data source. 
     * Optionally, override this method if you want use a connection that is different from the metadata connection.
     * @return An integer value defined in the EReturnStatus class that indicates the status of the get operation.
     */                           

    public java.sql.Connection getNativeConnection(){
    	return metadataConn.getNativeConnection();
    }
}