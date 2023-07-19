/*
 * Copyright (c) 2023 Informatica Corporation. All rights reserved.
 */

/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0
 * Generation time: 2023-07-19 12:14:25
 */

package com.singlestore.adapter.singlestore.connection;


/**
 * The interface for IClass
 *     'SingleStoreConnectInfoExtension'.
 * 
 * <p><br>
 * <b>Thread-Safety</b>
 * <p>
 * <strong>Note that this interface is not thread-safe.</strong> If multiple
 * threads access an instance of this interface concurrently, it must be
 * synchronized externally.</p>
 * </br></p>
 * <p>
 * The following features (Attributes/references) are supported:
 * <ul>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getDatabase() <em>database</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#isDisableSslHostnameVerification() <em>disableSslHostnameVerification</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getHostname() <em>hostname</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getKeyPassword() <em>keyPassword</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getKeyStore() <em>keyStore</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getKeyStorePassword() <em>keyStorePassword</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getPassword() <em>password</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getPort() <em>port</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getServerSslCert() <em>serverSslCert</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#isTrustServerCertificate() <em>trustServerCertificate</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getTrustStore() <em>trustStore</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getTrustStorePassword() <em>trustStorePassword</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#isUseSsl() <em>useSsl</em>} </li>
 *     <li>{@link com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getUser() <em>user</em>} </li>
 * </ul>
 * </p>
 * @Class (isSeeded=false, classKind=com.informatica.imf.annotations.ClassKind.SECOND_CLASS_INTERNAL, isAbstract=false)
 */
 public interface SingleStoreConnectInfoExtension extends com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.SDKConnectInfoModelExtension {

    /** A constant that references the IClass for this generated Java Class. */
    com.informatica.imf.icore.IClass ICLASS = ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass();
    /**
     * Retrieves the 'database' property value for this IObject.
     * @return the 'database' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getDatabase();


    /**
     * Sets the 'database' property value for this IObject.
     * @param database is the new property value for this IObject
     * @see #getDatabase
     */
    void setDatabase(java.lang.String database);


    /**
     * Retrieves the 'disableSslHostnameVerification' property value for this IObject.
     * @return the 'disableSslHostnameVerification' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.Boolean isDisableSslHostnameVerification();


    /**
     * Sets the 'disableSslHostnameVerification' property value for this IObject.
     * @param disableSslHostnameVerification is the new property value for this IObject
     * @see #getDisableSslHostnameVerification
     */
    void setDisableSslHostnameVerification(java.lang.Boolean disableSslHostnameVerification);


    /**
     * Retrieves the 'hostname' property value for this IObject.
     * @return the 'hostname' property value for this IObject.
     * @Property (redefines="", minOccurs=1, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getHostname();


    /**
     * Sets the 'hostname' property value for this IObject.
     * @param hostname is the new property value for this IObject
     * @see #getHostname
     */
    void setHostname(java.lang.String hostname);


    /**
     * Retrieves the 'keyPassword' property value for this IObject.
     * @return the 'keyPassword' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getKeyPassword();

    /**
     * Retrieves the 'keyPassword' property value for this IObject.
     * @param encrypted
     *			boolean indicating if the return value must be encrypted or not
     * @return the 'keyPassword' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getKeyPassword(boolean encrypted);

    /**
     * Sets the 'keyPassword' property value for this IObject.
     * @param keyPassword is the new property value for this IObject
     * @see #getKeyPassword
     */
    void setKeyPassword(java.lang.String keyPassword);

    /**
     * Sets the 'keyPassword' property value for this IObject.
     * @param keyPassword is the new property value for this IObject
     * @param encrypted boolean indicating if the String argument is already encrypted or not
     * @see #getKeyPassword
     */
    void setKeyPassword(java.lang.String keyPassword, boolean encrypted);

    /**
     * Retrieves the 'keyStore' property value for this IObject.
     * @return the 'keyStore' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getKeyStore();


    /**
     * Sets the 'keyStore' property value for this IObject.
     * @param keyStore is the new property value for this IObject
     * @see #getKeyStore
     */
    void setKeyStore(java.lang.String keyStore);


    /**
     * Retrieves the 'keyStorePassword' property value for this IObject.
     * @return the 'keyStorePassword' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getKeyStorePassword();

    /**
     * Retrieves the 'keyStorePassword' property value for this IObject.
     * @param encrypted
     *			boolean indicating if the return value must be encrypted or not
     * @return the 'keyStorePassword' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getKeyStorePassword(boolean encrypted);

    /**
     * Sets the 'keyStorePassword' property value for this IObject.
     * @param keyStorePassword is the new property value for this IObject
     * @see #getKeyStorePassword
     */
    void setKeyStorePassword(java.lang.String keyStorePassword);

    /**
     * Sets the 'keyStorePassword' property value for this IObject.
     * @param keyStorePassword is the new property value for this IObject
     * @param encrypted boolean indicating if the String argument is already encrypted or not
     * @see #getKeyStorePassword
     */
    void setKeyStorePassword(java.lang.String keyStorePassword, boolean encrypted);

    /**
     * Retrieves the 'password' property value for this IObject.
     * @return the 'password' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getPassword();

    /**
     * Retrieves the 'password' property value for this IObject.
     * @param encrypted
     *			boolean indicating if the return value must be encrypted or not
     * @return the 'password' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getPassword(boolean encrypted);

    /**
     * Sets the 'password' property value for this IObject.
     * @param password is the new property value for this IObject
     * @see #getPassword
     */
    void setPassword(java.lang.String password);

    /**
     * Sets the 'password' property value for this IObject.
     * @param password is the new property value for this IObject
     * @param encrypted boolean indicating if the String argument is already encrypted or not
     * @see #getPassword
     */
    void setPassword(java.lang.String password, boolean encrypted);

    /**
     * Retrieves the 'port' property value for this IObject.
     * @return the 'port' property value for this IObject.
     * @Property (redefines="", minOccurs=1, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    int getPort();


    /**
     * Sets the 'port' property value for this IObject.
     * @param port is the new property value for this IObject
     * @see #getPort
     */
    void setPort(int port);


    /**
     * Retrieves the 'serverSslCert' property value for this IObject.
     * @return the 'serverSslCert' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getServerSslCert();


    /**
     * Sets the 'serverSslCert' property value for this IObject.
     * @param serverSslCert is the new property value for this IObject
     * @see #getServerSslCert
     */
    void setServerSslCert(java.lang.String serverSslCert);


    /**
     * Retrieves the 'trustServerCertificate' property value for this IObject.
     * @return the 'trustServerCertificate' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.Boolean isTrustServerCertificate();


    /**
     * Sets the 'trustServerCertificate' property value for this IObject.
     * @param trustServerCertificate is the new property value for this IObject
     * @see #getTrustServerCertificate
     */
    void setTrustServerCertificate(java.lang.Boolean trustServerCertificate);


    /**
     * Retrieves the 'trustStore' property value for this IObject.
     * @return the 'trustStore' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getTrustStore();


    /**
     * Sets the 'trustStore' property value for this IObject.
     * @param trustStore is the new property value for this IObject
     * @see #getTrustStore
     */
    void setTrustStore(java.lang.String trustStore);


    /**
     * Retrieves the 'trustStorePassword' property value for this IObject.
     * @return the 'trustStorePassword' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getTrustStorePassword();

    /**
     * Retrieves the 'trustStorePassword' property value for this IObject.
     * @param encrypted
     *			boolean indicating if the return value must be encrypted or not
     * @return the 'trustStorePassword' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getTrustStorePassword(boolean encrypted);

    /**
     * Sets the 'trustStorePassword' property value for this IObject.
     * @param trustStorePassword is the new property value for this IObject
     * @see #getTrustStorePassword
     */
    void setTrustStorePassword(java.lang.String trustStorePassword);

    /**
     * Sets the 'trustStorePassword' property value for this IObject.
     * @param trustStorePassword is the new property value for this IObject
     * @param encrypted boolean indicating if the String argument is already encrypted or not
     * @see #getTrustStorePassword
     */
    void setTrustStorePassword(java.lang.String trustStorePassword, boolean encrypted);

    /**
     * Retrieves the 'useSsl' property value for this IObject.
     * @return the 'useSsl' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.Boolean isUseSsl();


    /**
     * Sets the 'useSsl' property value for this IObject.
     * @param useSsl is the new property value for this IObject
     * @see #getUseSsl
     */
    void setUseSsl(java.lang.Boolean useSsl);


    /**
     * Retrieves the 'user' property value for this IObject.
     * @return the 'user' property value for this IObject.
     * @Property (redefines="", minOccurs=1, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getUser();


    /**
     * Sets the 'user' property value for this IObject.
     * @param user is the new property value for this IObject
     * @see #getUser
     */
    void setUser(java.lang.String user);

    /**
     * Exposes the IProperties of the IClass associated with this Object
     */
    static class Properties {

        public static com.informatica.imf.icore.IProperty DATABASE = null;

        public static com.informatica.imf.icore.IProperty DISABLE_SSL_HOSTNAME_VERIFICATION = null;

        public static com.informatica.imf.icore.IProperty HOSTNAME = null;

        public static com.informatica.imf.icore.IProperty KEY_PASSWORD = null;

        public static com.informatica.imf.icore.IProperty KEY_STORE = null;

        public static com.informatica.imf.icore.IProperty KEY_STORE_PASSWORD = null;

        public static com.informatica.imf.icore.IProperty PASSWORD = null;

        public static com.informatica.imf.icore.IProperty PORT = null;

        public static com.informatica.imf.icore.IProperty SERVER_SSL_CERT = null;

        public static com.informatica.imf.icore.IProperty TRUST_SERVER_CERTIFICATE = null;

        public static com.informatica.imf.icore.IProperty TRUST_STORE = null;

        public static com.informatica.imf.icore.IProperty TRUST_STORE_PASSWORD = null;

        public static com.informatica.imf.icore.IProperty USE_SSL = null;

        public static com.informatica.imf.icore.IProperty USER = null;
        static  {
			com.singlestore.adapter.singlestore.connection.impl.SingleStoreConnectInfoExtensionImpl.initIProperties();
		}
    }
 }