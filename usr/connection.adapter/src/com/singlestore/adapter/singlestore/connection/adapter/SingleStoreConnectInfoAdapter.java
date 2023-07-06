package com.singlestore.adapter.singlestore.connection.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.informatica.sdk.adapter.connection.SDKConnectionConsumerAttribute;
import com.informatica.sdk.adapter.connection.SDKConsumerTypeEnum;
import com.informatica.sdk.adapter.connection.SDKErrorInfo;

public class SingleStoreConnectInfoAdapter extends SingleStoreBaseConnectInfoAdapter  {
	
	/**
     * Validates the connection attributes of an adapter.
     *
     * Use this method to validate the values for the attributes of an adapter 
     * and to perform validation that is specific to an adapter.
     *
     * @param  attrNameValmap  The attribute name and corresponding value map
     *						   for all attributes of an adapter.
     *
     * @return  An error key and value for attribute the errors found during 
     *			attribute validation.
     */

	@Override
    public SDKErrorInfo validateAttributes(Map<String, Object> attrNameValmap) {
    	return null;
    }


    /**
     * Gets the list of objects for the wizard pages which appears in the 
     * client application that uses the adapter.
     *
     * Use this method to provide the list of objects that appears in the 
     * client application. The pages, groups, and attributes appears based 
     * on the type of consumer application that uses the adapter. You must 
     * provide the corresponding properties file.
     *
     * @param   consumerType  The client application that use the adapter.
     * @param   map A map containing the attribute name as keys and corresponding 
     * values as objects.
     *
     * @return  A list of the objects to be included in the 
     *			client application that uses the adapter.
     */

    @Override
    public List<Object> getConnectInfoUpdatedConsumerInfo(
    		Map<String, Object> map, SDKConsumerTypeEnum consumerType) {
    	ArrayList<Object> newAttributes = new ArrayList<>();
    		
        String hostname = (String) map.get("hostname");
        int port = (int) map.get("port");
        String database = (String) map.get("database");
        String user = (String) map.get("user");
        String password = (String) map.get("password");
        boolean useSsl = (boolean) map.get("useSsl");
        String serverSslCert = (String) map.get("serverSslCert");
        String keyStore = (String) map.get("keyStore");
        String keyStorePassword = (String) map.get("keyStorePassword");
        String keyPassword = (String) map.get("keyPassword");
        String trustStore = (String) map.get("trustStore");
        String trustStorePassword = (String) map.get("trustStorePassword");
        boolean trustServerCertificate = (boolean) map.get("trustServerCertificate");
        boolean disableSslHostnameVerification = (boolean) map.get("disableSslHostnameVerification");

        SDKConnectionConsumerAttribute hostnameNew = createAttributePresentation("hostname", "HOSTNAME",
        		"HOSTNAME_TOOLTIP", true, false, true);
		SDKConnectionConsumerAttribute portNew = createAttributePresentation("port", "PORT",
				"PORT_TOOLTIP", true, false, true);
		SDKConnectionConsumerAttribute databaseNew = createAttributePresentation("database", "DATABASE",
				"DATABASE_TOOLTIP", true, false, false);
		SDKConnectionConsumerAttribute userNew = createAttributePresentation("user", "USER",
				"USER_TOOLTIP", true, false, true);
		SDKConnectionConsumerAttribute passwordNew = createAttributePresentation("password", "PASSWORD",
				"PASSWORD_TOOLTIP", true, false, false);
		SDKConnectionConsumerAttribute useSslNew = createAttributePresentation("useSsl", "USESSL",
				"USESSL_TOOLTIP", true, true, false);
		SDKConnectionConsumerAttribute serverSslCertNew = createAttributePresentation("serverSslCer", "SERVERSSLCERT",
				"SERVERSSLCERT_TOOLTIP", useSsl, false, false);
		SDKConnectionConsumerAttribute keyStoreNew = createAttributePresentation("keyStore", "KEYSTORE",
				"KEYSTORE_TOOLTIP", useSsl, false, false);
		SDKConnectionConsumerAttribute keyStorePasswordNew = createAttributePresentation("keyStorePassword", "KEYSTOREPASSWORD",
				"KEYSTOREPASSWORD_TOOLTIP", useSsl, false, false);
		SDKConnectionConsumerAttribute keyPasswordNew = createAttributePresentation("keyPassword", "KEYPASSWORD",
				"KEYPASSWORD_TOOLTIP", useSsl, false, false);
		SDKConnectionConsumerAttribute trustStoreNew = createAttributePresentation("trustStore", "TRUSTSTORE",
				"TRUSTSTORE_TOOLTIP", useSsl, false, false);
		SDKConnectionConsumerAttribute trustStorePasswordNew = createAttributePresentation("trustStorePassword", "TRUSTSTOREPASSOWRD",
				"TRUSTSTOREPASSWORD_TOOLTIP", useSsl, false, false);
		SDKConnectionConsumerAttribute trustServerCertificateNew = createAttributePresentation("trustServerCertificate", "TRUSTSERVICECERTIFICATE",
				"TRUSTSERVICECERTIFICATE_TOOLTIP", useSsl, false, false);
		SDKConnectionConsumerAttribute disableSslHostnameVerificationNew = createAttributePresentation("disableSslHostnameVerification", "DISABLESSLHOSTNAMEVERIFICATION",
				"DISABLESSLHOSTNAMEVERIFICATION_TOOLTIP", useSsl, false, false);

			
		hostnameNew.getAttributeType().setAttributeValue(hostname);
		newAttributes.add(hostnameNew);

		portNew.getAttributeType().setAttributeValue(port);
		newAttributes.add(portNew);
			
		databaseNew.getAttributeType().setAttributeValue(database);
		newAttributes.add(databaseNew);
		
		userNew.getAttributeType().setAttributeValue(user);
		newAttributes.add(userNew);

		passwordNew.getAttributeType().setAttributeValue(password);
		newAttributes.add(passwordNew);

		useSslNew.getAttributeType().setAttributeValue(useSsl);
		newAttributes.add(useSslNew);
			
		serverSslCertNew.getAttributeType().setAttributeValue(serverSslCert);
		newAttributes.add(serverSslCertNew);

		keyStoreNew.getAttributeType().setAttributeValue(keyStore);
		newAttributes.add(keyStoreNew);

		keyStorePasswordNew.getAttributeType().setAttributeValue(keyStorePassword);
		newAttributes.add(keyStorePasswordNew);

		keyPasswordNew.getAttributeType().setAttributeValue(keyPassword);
		newAttributes.add(keyPasswordNew);

		trustStoreNew.getAttributeType().setAttributeValue(trustStore);
		newAttributes.add(trustStoreNew);

		trustStorePasswordNew.getAttributeType().setAttributeValue(trustStorePassword);
		newAttributes.add(trustStorePasswordNew);

		trustServerCertificateNew.getAttributeType().setAttributeValue(trustServerCertificate);
		newAttributes.add(trustServerCertificateNew);

		disableSslHostnameVerificationNew.getAttributeType().setAttributeValue(disableSslHostnameVerification);
		newAttributes.add(disableSslHostnameVerificationNew);
			
		return newAttributes;
    }
}