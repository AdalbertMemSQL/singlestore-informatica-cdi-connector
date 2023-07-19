/*
 * Copyright (c) 2023 Informatica Corporation. All rights reserved.
 */

/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0
 * Generation time: 2023-07-19 12:14:25
 */
package com.singlestore.adapter.singlestore.connection.impl;

/**
 * The implementation for an SingleStoreConnectInfoExtension.
 *
 */
public class SingleStoreConnectInfoExtensionImpl
extends com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SDKConnectInfoModelExtensionImpl
implements com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension {
    /**
     * The generated Serial Version UID.
     */
    private static final long serialVersionUID = -4301589598645049658L;

    private static int PROPERTY_ID;

    protected java.lang.String database = "";

    protected java.lang.Boolean disableSslHostnameVerification = false;

    protected java.lang.String hostname = "";

    protected java.lang.String keyPassword = "";

    protected java.lang.String keyStore = "";

    protected java.lang.String keyStorePassword = "";

    protected java.lang.String password = "";

    protected int port = 3306;

    protected java.lang.String serverSslCert = "";

    protected java.lang.Boolean trustServerCertificate = false;

    protected java.lang.String trustStore = "";

    protected java.lang.String trustStorePassword = "";

    protected java.lang.Boolean useSsl = false;

    private static final String DEFAULT_USER = "root";

    protected java.lang.String user = DEFAULT_USER;


    /**
     * Default constructor for SingleStoreConnectInfoExtensionImpl.
     */
    public SingleStoreConnectInfoExtensionImpl() {
        assert iObjInfo != null;
        iSetIClass(com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE
                .getSingleStoreConnectInfoExtensionIClass());
    }


     /**
     * Retrieves the 'database' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getDatabase()
     * @return the 'database' property value for this Object
     */
     public java.lang.String getDatabase() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return this.database;
     }

    /**
     * Sets the 'database' property value for this IObject.
     * If a <code>null</code> is specified as the value for this property,
     * the default value of the String, i.e., empty string('""') will be set.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setDatabase(java.lang.String database)
     * @param database is the new value for property 'database'
     */public void setDatabase(java.lang.String database) {
        if (this.database.equals(database)) {
            return;
        }
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.String oldVal = this.database;
        if (database == null) {
            database = "";
        }
        this.database = database;
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.DATABASE, oldVal, database);
        }
    }

     


     /**
     * Retrieves the 'disableSslHostnameVerification' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#isDisableSslHostnameVerification()
     * @return the 'disableSslHostnameVerification' property value for this Object
     */
     public java.lang.Boolean isDisableSslHostnameVerification() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return this.disableSslHostnameVerification;
     }

    /**
     * Sets the 'disableSslHostnameVerification' property value for this IObject.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setDisableSslHostnameVerification(java.lang.Boolean disableSslHostnameVerification)
     * @param disableSslHostnameVerification is the new value for property 'disableSslHostnameVerification'
     */public void setDisableSslHostnameVerification(java.lang.Boolean disableSslHostnameVerification) {
        if (this.disableSslHostnameVerification == disableSslHostnameVerification) {
            return;
        }
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.Boolean oldVal = this.disableSslHostnameVerification;
        this.disableSslHostnameVerification = disableSslHostnameVerification;
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.DISABLE_SSL_HOSTNAME_VERIFICATION, oldVal, disableSslHostnameVerification);
        }
    }

     


     /**
     * Retrieves the 'hostname' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getHostname()
     * @return the 'hostname' property value for this Object
     */
     public java.lang.String getHostname() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return this.hostname;
     }

    /**
     * Sets the 'hostname' property value for this IObject.
     * If a <code>null</code> is specified as the value for this property,
     * the default value of the String, i.e., empty string('""') will be set.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setHostname(java.lang.String hostname)
     * @param hostname is the new value for property 'hostname'
     */public void setHostname(java.lang.String hostname) {
        if (this.hostname.equals(hostname)) {
            return;
        }
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.String oldVal = this.hostname;
        if (hostname == null) {
            hostname = "";
        }
        this.hostname = hostname;
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.HOSTNAME, oldVal, hostname);
        }
    }

     


     /**
     * Retrieves the 'keyPassword' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getKeyPassword()
     * @return the 'keyPassword' property value for this Object
     */
     public java.lang.String getKeyPassword() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return decrypt(this.keyPassword,com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_PASSWORD, this);
     }

    /**
     * Sets the 'keyPassword' property value for this IObject.
     * If a <code>null</code> is specified as the value for this property,
     * the default value of the String, i.e., empty string('""') will be set.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setKeyPassword(java.lang.String keyPassword)
     * @param keyPassword is the new value for property 'keyPassword'
     */public void setKeyPassword(java.lang.String keyPassword) {
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.String oldVal = decrypt(this.keyPassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_PASSWORD, this);
        if (oldVal.equals(keyPassword)) {
            return;
        }
        if (keyPassword == null) {
            keyPassword = "";
        }
        this.keyPassword = encrypt(keyPassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_PASSWORD, this);
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_PASSWORD, oldVal, keyPassword);
        }
    }

     

    /**
     * Retrieves the 'keyPassword'  property value for this IObject.
     * @param encrypted
     *			boolean indicating if the return value must be encrypted or not
     * @return the 'keyPassword'  property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    	public java.lang.String getKeyPassword(boolean encrypted) {

    		if (this.iIsProxy()) {
    			if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
    				throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
    					com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
    			}
    		}
    		if(encrypted) {
    			return this.keyPassword;
    		}
    		return decrypt(this.keyPassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_PASSWORD, this);
    	}

    /**
     * Sets the 'keyPassword' property value for this IObject.
     * @param keyPassword' is the new property value for this IObject
     * @param encrypted boolean indicating if the String argument is already encrypted or not
     * @see #getKeyPassword
     */
    	public void setKeyPassword(java.lang.String keyPassword, boolean encrypted) {
    		if (this.iIsProxy()) {
    			if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
    				throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
    					com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
    			}
    		}
    		if(encrypted && (this.keyPassword.equals(keyPassword))) {
    			return;
    		}
    		java.lang.String oldVal = decrypt(this.keyPassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_PASSWORD, this);
    		if(!encrypted && (oldVal.equals(keyPassword))) {
    			return;
    		}
    		if(keyPassword == null) {
    			keyPassword = "";
    		}
    		if(encrypted) {
    			this.keyPassword = keyPassword;
    		} else {
    			this.keyPassword = encrypt(keyPassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_PASSWORD, this);
    		}
            if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
                com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(
                    this, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_PASSWORD, oldVal, keyPassword);
            }
    	}


     /**
     * Retrieves the 'keyStore' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getKeyStore()
     * @return the 'keyStore' property value for this Object
     */
     public java.lang.String getKeyStore() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return this.keyStore;
     }

    /**
     * Sets the 'keyStore' property value for this IObject.
     * If a <code>null</code> is specified as the value for this property,
     * the default value of the String, i.e., empty string('""') will be set.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setKeyStore(java.lang.String keyStore)
     * @param keyStore is the new value for property 'keyStore'
     */public void setKeyStore(java.lang.String keyStore) {
        if (this.keyStore.equals(keyStore)) {
            return;
        }
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.String oldVal = this.keyStore;
        if (keyStore == null) {
            keyStore = "";
        }
        this.keyStore = keyStore;
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_STORE, oldVal, keyStore);
        }
    }

     


     /**
     * Retrieves the 'keyStorePassword' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getKeyStorePassword()
     * @return the 'keyStorePassword' property value for this Object
     */
     public java.lang.String getKeyStorePassword() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return decrypt(this.keyStorePassword,com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_STORE_PASSWORD, this);
     }

    /**
     * Sets the 'keyStorePassword' property value for this IObject.
     * If a <code>null</code> is specified as the value for this property,
     * the default value of the String, i.e., empty string('""') will be set.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setKeyStorePassword(java.lang.String keyStorePassword)
     * @param keyStorePassword is the new value for property 'keyStorePassword'
     */public void setKeyStorePassword(java.lang.String keyStorePassword) {
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.String oldVal = decrypt(this.keyStorePassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_STORE_PASSWORD, this);
        if (oldVal.equals(keyStorePassword)) {
            return;
        }
        if (keyStorePassword == null) {
            keyStorePassword = "";
        }
        this.keyStorePassword = encrypt(keyStorePassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_STORE_PASSWORD, this);
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_STORE_PASSWORD, oldVal, keyStorePassword);
        }
    }

     

    /**
     * Retrieves the 'keyStorePassword'  property value for this IObject.
     * @param encrypted
     *			boolean indicating if the return value must be encrypted or not
     * @return the 'keyStorePassword'  property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    	public java.lang.String getKeyStorePassword(boolean encrypted) {

    		if (this.iIsProxy()) {
    			if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
    				throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
    					com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
    			}
    		}
    		if(encrypted) {
    			return this.keyStorePassword;
    		}
    		return decrypt(this.keyStorePassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_STORE_PASSWORD, this);
    	}

    /**
     * Sets the 'keyStorePassword' property value for this IObject.
     * @param keyStorePassword' is the new property value for this IObject
     * @param encrypted boolean indicating if the String argument is already encrypted or not
     * @see #getKeyStorePassword
     */
    	public void setKeyStorePassword(java.lang.String keyStorePassword, boolean encrypted) {
    		if (this.iIsProxy()) {
    			if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
    				throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
    					com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
    			}
    		}
    		if(encrypted && (this.keyStorePassword.equals(keyStorePassword))) {
    			return;
    		}
    		java.lang.String oldVal = decrypt(this.keyStorePassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_STORE_PASSWORD, this);
    		if(!encrypted && (oldVal.equals(keyStorePassword))) {
    			return;
    		}
    		if(keyStorePassword == null) {
    			keyStorePassword = "";
    		}
    		if(encrypted) {
    			this.keyStorePassword = keyStorePassword;
    		} else {
    			this.keyStorePassword = encrypt(keyStorePassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_STORE_PASSWORD, this);
    		}
            if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
                com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(
                    this, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_STORE_PASSWORD, oldVal, keyStorePassword);
            }
    	}


     /**
     * Retrieves the 'password' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getPassword()
     * @return the 'password' property value for this Object
     */
     public java.lang.String getPassword() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return decrypt(this.password,com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.PASSWORD, this);
     }

    /**
     * Sets the 'password' property value for this IObject.
     * If a <code>null</code> is specified as the value for this property,
     * the default value of the String, i.e., empty string('""') will be set.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setPassword(java.lang.String password)
     * @param password is the new value for property 'password'
     */public void setPassword(java.lang.String password) {
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.String oldVal = decrypt(this.password, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.PASSWORD, this);
        if (oldVal.equals(password)) {
            return;
        }
        if (password == null) {
            password = "";
        }
        this.password = encrypt(password, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.PASSWORD, this);
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.PASSWORD, oldVal, password);
        }
    }

     

    /**
     * Retrieves the 'password'  property value for this IObject.
     * @param encrypted
     *			boolean indicating if the return value must be encrypted or not
     * @return the 'password'  property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    	public java.lang.String getPassword(boolean encrypted) {

    		if (this.iIsProxy()) {
    			if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
    				throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
    					com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
    			}
    		}
    		if(encrypted) {
    			return this.password;
    		}
    		return decrypt(this.password, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.PASSWORD, this);
    	}

    /**
     * Sets the 'password' property value for this IObject.
     * @param password' is the new property value for this IObject
     * @param encrypted boolean indicating if the String argument is already encrypted or not
     * @see #getPassword
     */
    	public void setPassword(java.lang.String password, boolean encrypted) {
    		if (this.iIsProxy()) {
    			if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
    				throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
    					com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
    			}
    		}
    		if(encrypted && (this.password.equals(password))) {
    			return;
    		}
    		java.lang.String oldVal = decrypt(this.password, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.PASSWORD, this);
    		if(!encrypted && (oldVal.equals(password))) {
    			return;
    		}
    		if(password == null) {
    			password = "";
    		}
    		if(encrypted) {
    			this.password = password;
    		} else {
    			this.password = encrypt(password, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.PASSWORD, this);
    		}
            if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
                com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(
                    this, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.PASSWORD, oldVal, password);
            }
    	}


     /**
     * Retrieves the 'port' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getPort()
     * @return the 'port' property value for this Object
     */
     public int getPort() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return this.port;
     }

    /**
     * Sets the 'port' property value for this IObject.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setPort(int port)
     * @param port is the new value for property 'port'
     */public void setPort(int port) {
        if (this.port == port) {
            return;
        }
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        int oldVal = this.port;
        this.port = port;
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.PORT, oldVal, port);
        }
    }

     


     /**
     * Retrieves the 'serverSslCert' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getServerSslCert()
     * @return the 'serverSslCert' property value for this Object
     */
     public java.lang.String getServerSslCert() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return this.serverSslCert;
     }

    /**
     * Sets the 'serverSslCert' property value for this IObject.
     * If a <code>null</code> is specified as the value for this property,
     * the default value of the String, i.e., empty string('""') will be set.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setServerSslCert(java.lang.String serverSslCert)
     * @param serverSslCert is the new value for property 'serverSslCert'
     */public void setServerSslCert(java.lang.String serverSslCert) {
        if (this.serverSslCert.equals(serverSslCert)) {
            return;
        }
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.String oldVal = this.serverSslCert;
        if (serverSslCert == null) {
            serverSslCert = "";
        }
        this.serverSslCert = serverSslCert;
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.SERVER_SSL_CERT, oldVal, serverSslCert);
        }
    }

     


     /**
     * Retrieves the 'trustServerCertificate' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#isTrustServerCertificate()
     * @return the 'trustServerCertificate' property value for this Object
     */
     public java.lang.Boolean isTrustServerCertificate() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return this.trustServerCertificate;
     }

    /**
     * Sets the 'trustServerCertificate' property value for this IObject.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setTrustServerCertificate(java.lang.Boolean trustServerCertificate)
     * @param trustServerCertificate is the new value for property 'trustServerCertificate'
     */public void setTrustServerCertificate(java.lang.Boolean trustServerCertificate) {
        if (this.trustServerCertificate == trustServerCertificate) {
            return;
        }
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.Boolean oldVal = this.trustServerCertificate;
        this.trustServerCertificate = trustServerCertificate;
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_SERVER_CERTIFICATE, oldVal, trustServerCertificate);
        }
    }

     


     /**
     * Retrieves the 'trustStore' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getTrustStore()
     * @return the 'trustStore' property value for this Object
     */
     public java.lang.String getTrustStore() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return this.trustStore;
     }

    /**
     * Sets the 'trustStore' property value for this IObject.
     * If a <code>null</code> is specified as the value for this property,
     * the default value of the String, i.e., empty string('""') will be set.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setTrustStore(java.lang.String trustStore)
     * @param trustStore is the new value for property 'trustStore'
     */public void setTrustStore(java.lang.String trustStore) {
        if (this.trustStore.equals(trustStore)) {
            return;
        }
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.String oldVal = this.trustStore;
        if (trustStore == null) {
            trustStore = "";
        }
        this.trustStore = trustStore;
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_STORE, oldVal, trustStore);
        }
    }

     


     /**
     * Retrieves the 'trustStorePassword' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getTrustStorePassword()
     * @return the 'trustStorePassword' property value for this Object
     */
     public java.lang.String getTrustStorePassword() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return decrypt(this.trustStorePassword,com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_STORE_PASSWORD, this);
     }

    /**
     * Sets the 'trustStorePassword' property value for this IObject.
     * If a <code>null</code> is specified as the value for this property,
     * the default value of the String, i.e., empty string('""') will be set.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setTrustStorePassword(java.lang.String trustStorePassword)
     * @param trustStorePassword is the new value for property 'trustStorePassword'
     */public void setTrustStorePassword(java.lang.String trustStorePassword) {
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.String oldVal = decrypt(this.trustStorePassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_STORE_PASSWORD, this);
        if (oldVal.equals(trustStorePassword)) {
            return;
        }
        if (trustStorePassword == null) {
            trustStorePassword = "";
        }
        this.trustStorePassword = encrypt(trustStorePassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_STORE_PASSWORD, this);
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_STORE_PASSWORD, oldVal, trustStorePassword);
        }
    }

     

    /**
     * Retrieves the 'trustStorePassword'  property value for this IObject.
     * @param encrypted
     *			boolean indicating if the return value must be encrypted or not
     * @return the 'trustStorePassword'  property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    	public java.lang.String getTrustStorePassword(boolean encrypted) {

    		if (this.iIsProxy()) {
    			if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
    				throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
    					com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
    			}
    		}
    		if(encrypted) {
    			return this.trustStorePassword;
    		}
    		return decrypt(this.trustStorePassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_STORE_PASSWORD, this);
    	}

    /**
     * Sets the 'trustStorePassword' property value for this IObject.
     * @param trustStorePassword' is the new property value for this IObject
     * @param encrypted boolean indicating if the String argument is already encrypted or not
     * @see #getTrustStorePassword
     */
    	public void setTrustStorePassword(java.lang.String trustStorePassword, boolean encrypted) {
    		if (this.iIsProxy()) {
    			if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
    				throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
    					com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
    			}
    		}
    		if(encrypted && (this.trustStorePassword.equals(trustStorePassword))) {
    			return;
    		}
    		java.lang.String oldVal = decrypt(this.trustStorePassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_STORE_PASSWORD, this);
    		if(!encrypted && (oldVal.equals(trustStorePassword))) {
    			return;
    		}
    		if(trustStorePassword == null) {
    			trustStorePassword = "";
    		}
    		if(encrypted) {
    			this.trustStorePassword = trustStorePassword;
    		} else {
    			this.trustStorePassword = encrypt(trustStorePassword, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_STORE_PASSWORD, this);
    		}
            if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
                com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(
                    this, com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_STORE_PASSWORD, oldVal, trustStorePassword);
            }
    	}


     /**
     * Retrieves the 'useSsl' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#isUseSsl()
     * @return the 'useSsl' property value for this Object
     */
     public java.lang.Boolean isUseSsl() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return this.useSsl;
     }

    /**
     * Sets the 'useSsl' property value for this IObject.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setUseSsl(java.lang.Boolean useSsl)
     * @param useSsl is the new value for property 'useSsl'
     */public void setUseSsl(java.lang.Boolean useSsl) {
        if (this.useSsl == useSsl) {
            return;
        }
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.Boolean oldVal = this.useSsl;
        this.useSsl = useSsl;
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.USE_SSL, oldVal, useSsl);
        }
    }

     


     /**
     * Retrieves the 'user' property value for this Object.
     *
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#getUser()
     * @return the 'user' property value for this Object
     */
     public java.lang.String getUser() {
         if (this.iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                 throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                     com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
             }
         }
         return this.user;
     }

    /**
     * Sets the 'user' property value for this IObject.
     * If a <code>null</code> is specified as the value for this property,
     * the default value of the String, i.e., empty string('""') will be set.
     * @see com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension#setUser(java.lang.String user)
     * @param user is the new value for property 'user'
     */public void setUser(java.lang.String user) {
        if (this.user.equals(user)) {
            return;
        }
        if (this.iIsProxy()) {
            if (!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
            }
        }
        java.lang.String oldVal = this.user;
        if (user == null) {
            user = "";
        }
        this.user = user;
        if (com.informatica.imf.icore.IMFRuntime.getInstance().isListenerActive()) {
            com.informatica.imf.icore.IMFRuntime.getInstance().getObjectChangeListener().onPropertyChange(this,
                com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.USER, oldVal, user);
        }
    }

     



    /**
     * Returns the value of the specified IProperty.
     * @param iProperty is any IProperty
     * @return the value of the specified property
     *
     */

    @SuppressWarnings("unchecked")
    @Override
    public java.lang.Object iGet(com.informatica.imf.icore.IProperty iProperty) {
    	if(!this.iGetIClass().containsIProperty(iProperty)) {
    		throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass().getQualifiedName());
    	}
    	int propertyId= ((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getPropertyId();
    	if( propertyId <com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount())
    	return super.iGet(iProperty);
    	else
    	switch (((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getQualifiedName()){
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.database":
            return this.getDatabase();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.disableSslHostnameVerification":
            return this.isDisableSslHostnameVerification();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.hostname":
            return this.getHostname();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyPassword":
            return this.getKeyPassword();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyStore":
            return this.getKeyStore();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyStorePassword":
            return this.getKeyStorePassword();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.password":
            return this.getPassword();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.port":
            return this.getPort();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.serverSslCert":
            return this.getServerSslCert();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustServerCertificate":
            return this.isTrustServerCertificate();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustStore":
            return this.getTrustStore();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustStorePassword":
            return this.getTrustStorePassword();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.useSsl":
            return this.isUseSsl();
        case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.user":
            return this.getUser();
        default:
                throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass());
        }
    }

    /**
     * Returns the value of the specified IProperty.
     * @param iProperty is any IProperty
     * @param encrypted indicates if the returned string value needs to be
     * 			encrypted. Applicable only to string properties.
     * @return the value of the specified property
     */
    @SuppressWarnings("unchecked")
    @Override
    public java.lang.Object iGet(com.informatica.imf.icore.IProperty iProperty,
    							boolean encrypted) {
    	if(!this.iGetIClass().containsIProperty(iProperty)) {
    		throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass().getQualifiedName());
    	}
    	int propertyId= ((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getPropertyId();
    	if( propertyId <com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount())
    	return super.iGet(iProperty,encrypted);
    	else
    	switch (((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getQualifiedName()){
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.database":
                return this.getDatabase();
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.disableSslHostnameVerification":
                return this.isDisableSslHostnameVerification();
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.hostname":
                return this.getHostname();
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyPassword":
                return this.getKeyPassword(encrypted);
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyStore":
                return this.getKeyStore();
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyStorePassword":
                return this.getKeyStorePassword(encrypted);
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.password":
                return this.getPassword(encrypted);
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.port":
                return this.getPort();
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.serverSslCert":
                return this.getServerSslCert();
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustServerCertificate":
                return this.isTrustServerCertificate();
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustStore":
                return this.getTrustStore();
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustStorePassword":
                return this.getTrustStorePassword(encrypted);
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.useSsl":
                return this.isUseSsl();
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.user":
                return this.getUser();
            default:
                   throw new com.informatica.core.exception.IllegalArgumentException(
                       com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                       iProperty.getName(),
                       this.iGetIClass());
        }
    }

    /**
     * Returns true if the specified collection has items in it.
     * @param iProperty is any IProperty
     * @return true if the specified collection has items in it.
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean iHasItems(com.informatica.imf.icore.IProperty iProperty) {
        if(!this.iGetIClass().containsIProperty(iProperty)) {
            throw new com.informatica.core.exception.IllegalArgumentException(
                  com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                  iProperty.getName(),
                  this.iGetIClass().getQualifiedName());
        }
        if (iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
              }
        }
    	int propertyId= ((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getPropertyId();
    	if( propertyId <com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount())
    	return super.iHasItems(iProperty);
    	else
        	switch (((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getQualifiedName()){
            default:
                    throw new com.informatica.core.exception.IllegalArgumentException(
                        com.informatica.imf.ImfMsg.ILLEGAL_INVOCATION_OF_HASITEMS_ON_NON_COLLECTION_PROPERTY_property_FOR_CLASS_class,
                        iProperty.getName(),
                        this.iGetIClass());
            }
        }

     /**
     * Sets the value of the specified IProperty.
     * @param iProperty is any IProperty
     * @param newValue is the new value for the specified IProperty
     *
     */
    @SuppressWarnings("unchecked")
    @Override
    public void iSet(com.informatica.imf.icore.IProperty iProperty, java.lang.Object newValue) {
    	if(!this.iGetIClass().containsIProperty(iProperty)) {
    		throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass().getQualifiedName());
    	}
    	int propertyId= ((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getPropertyId();
    	if( propertyId <com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount())
    	super.iSet(iProperty,newValue);
    	else
        	switch (((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getQualifiedName()) {
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.database":
                this.setDatabase((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.disableSslHostnameVerification":

                if (newValue == null) {
                        throw new com.informatica.core.exception.IllegalArgumentException(
                               com.informatica.imf.ImfMsg.MANDATORY_PROPERTY_property_OF_class_CANNOT_BE_SET_TO_NULL,
                               iProperty.getName(),
                               this.iGetIClass());
                 }
                this.setDisableSslHostnameVerification((java.lang.Boolean) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.hostname":
                this.setHostname((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyPassword":
                this.setKeyPassword((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyStore":
                this.setKeyStore((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyStorePassword":
                this.setKeyStorePassword((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.password":
                this.setPassword((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.port":

                if (newValue == null) {
                        throw new com.informatica.core.exception.IllegalArgumentException(
                               com.informatica.imf.ImfMsg.MANDATORY_PROPERTY_property_OF_class_CANNOT_BE_SET_TO_NULL,
                               iProperty.getName(),
                               this.iGetIClass());
                 }
                this.setPort((java.lang.Integer) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.serverSslCert":
                this.setServerSslCert((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustServerCertificate":

                if (newValue == null) {
                        throw new com.informatica.core.exception.IllegalArgumentException(
                               com.informatica.imf.ImfMsg.MANDATORY_PROPERTY_property_OF_class_CANNOT_BE_SET_TO_NULL,
                               iProperty.getName(),
                               this.iGetIClass());
                 }
                this.setTrustServerCertificate((java.lang.Boolean) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustStore":
                this.setTrustStore((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustStorePassword":
                this.setTrustStorePassword((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.useSsl":

                if (newValue == null) {
                        throw new com.informatica.core.exception.IllegalArgumentException(
                               com.informatica.imf.ImfMsg.MANDATORY_PROPERTY_property_OF_class_CANNOT_BE_SET_TO_NULL,
                               iProperty.getName(),
                               this.iGetIClass());
                 }
                this.setUseSsl((java.lang.Boolean) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.user":
                this.setUser((java.lang.String) newValue);
                break;
            default:
                  throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_SET_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass());
            }
        }

    /**
     * Sets the value of the specified IProperty.
     * @param iProperty is any IProperty
     * @param newValue is the new value for the specified IProperty
     * @param encrypted boolean indicating if the value passed is already
     * 			encrypted or not.
     *
     */
    @SuppressWarnings("unchecked")
    @Override
    public void iSet(com.informatica.imf.icore.IProperty iProperty, java.lang.Object newValue
    	, boolean encrypted) {
    	if(!this.iGetIClass().containsIProperty(iProperty)) {
    		throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass().getQualifiedName());
    	}
    	int propertyId= ((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getPropertyId();
    	if( propertyId <com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount())
    	super.iSet(iProperty,newValue,encrypted);
    	else
        	switch (((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getQualifiedName()){
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.database":
                this.setDatabase((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.disableSslHostnameVerification":

                if (newValue == null) {
                        throw new com.informatica.core.exception.IllegalArgumentException(
                               com.informatica.imf.ImfMsg.MANDATORY_PROPERTY_property_OF_class_CANNOT_BE_SET_TO_NULL,
                               iProperty.getName(),
                               this.iGetIClass());
                 }
                this.setDisableSslHostnameVerification((java.lang.Boolean) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.hostname":
                this.setHostname((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyPassword":
                this.setKeyPassword((java.lang.String) newValue, encrypted);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyStore":
                this.setKeyStore((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyStorePassword":
                this.setKeyStorePassword((java.lang.String) newValue, encrypted);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.password":
                this.setPassword((java.lang.String) newValue, encrypted);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.port":

                if (newValue == null) {
                        throw new com.informatica.core.exception.IllegalArgumentException(
                               com.informatica.imf.ImfMsg.MANDATORY_PROPERTY_property_OF_class_CANNOT_BE_SET_TO_NULL,
                               iProperty.getName(),
                               this.iGetIClass());
                 }
                this.setPort((java.lang.Integer) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.serverSslCert":
                this.setServerSslCert((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustServerCertificate":

                if (newValue == null) {
                        throw new com.informatica.core.exception.IllegalArgumentException(
                               com.informatica.imf.ImfMsg.MANDATORY_PROPERTY_property_OF_class_CANNOT_BE_SET_TO_NULL,
                               iProperty.getName(),
                               this.iGetIClass());
                 }
                this.setTrustServerCertificate((java.lang.Boolean) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustStore":
                this.setTrustStore((java.lang.String) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustStorePassword":
                this.setTrustStorePassword((java.lang.String) newValue, encrypted);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.useSsl":

                if (newValue == null) {
                        throw new com.informatica.core.exception.IllegalArgumentException(
                               com.informatica.imf.ImfMsg.MANDATORY_PROPERTY_property_OF_class_CANNOT_BE_SET_TO_NULL,
                               iProperty.getName(),
                               this.iGetIClass());
                 }
                this.setUseSsl((java.lang.Boolean) newValue);
                break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.user":
                this.setUser((java.lang.String) newValue);
                break;
            default:
                  throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_SET_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass());
        }
    }

    /**
     * Sets the value of the specified IProperty.
     * Note on setting collection property: Even though collection properties can be set using this method, it is to be
     * noted that the wrapped collections as such are not directly replaced instead, the core collection in the wrappers
     * are replaced using the passed wrappers core (i.e: lhs.setWrappedCollection(rhs.getWrappedCollection())
     * @param iProperty is any IProperty
     * @param newValue is the new value for the specified IProperty
     *
     */
    @SuppressWarnings("unchecked")
    @Override
    public void iInverseSet(com.informatica.imf.icore.IProperty iProperty, java.lang.Object newValue) {
    	if(!this.iGetIClass().containsIProperty(iProperty)) {
    		throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass().getQualifiedName());
    	}
    	int propertyId= ((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getPropertyId();
    	if( propertyId <com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount())
    	super.iInverseSet(iProperty,newValue);
    	else
        	switch (((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getQualifiedName()) {
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.database":
               this.database = (java.lang.String) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.disableSslHostnameVerification":
               this.disableSslHostnameVerification = (java.lang.Boolean) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.hostname":
               this.hostname = (java.lang.String) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyPassword":
               this.keyPassword = (java.lang.String) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyStore":
               this.keyStore = (java.lang.String) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.keyStorePassword":
               this.keyStorePassword = (java.lang.String) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.password":
               this.password = (java.lang.String) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.port":
               this.port = (java.lang.Integer) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.serverSslCert":
               this.serverSslCert = (java.lang.String) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustServerCertificate":
               this.trustServerCertificate = (java.lang.Boolean) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustStore":
               this.trustStore = (java.lang.String) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.trustStorePassword":
               this.trustStorePassword = (java.lang.String) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.useSsl":
               this.useSsl = (java.lang.Boolean) newValue;
               break;
            case "com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.user":
               this.user = (java.lang.String) newValue;
               break;
            default:
                  throw new com.informatica.core.exception.IllegalArgumentException(
                      com.informatica.imf.ImfMsg.COULD_NOT_SET_PROPERTY_property_FOR_CLASS_class,
                      iProperty.getName(),
                      this.iGetIClass());
         }
    }


    /**
     * @generated
     */
    @Override
    public String toString() {
        return com.informatica.imf.io.TextFormatter.format(this);
    }

    public static void initIProperties() {
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__DATABASE;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.DATABASE =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__DISABLE_SSL_HOSTNAME_VERIFICATION;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.DISABLE_SSL_HOSTNAME_VERIFICATION =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__HOSTNAME;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.HOSTNAME =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_PASSWORD;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_PASSWORD =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_STORE;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_STORE =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_STORE_PASSWORD;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.KEY_STORE_PASSWORD =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__PASSWORD;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.PASSWORD =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__PORT;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.PORT =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__SERVER_SSL_CERT;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.SERVER_SSL_CERT =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_SERVER_CERTIFICATE;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_SERVER_CERTIFICATE =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_STORE;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_STORE =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_STORE_PASSWORD;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.TRUST_STORE_PASSWORD =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__USE_SSL;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.USE_SSL =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
        PROPERTY_ID = com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl.SINGLE_STORE_CONNECT_INFO_EXTENSION__USER;
        		com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension.Properties.USER =
        			com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_INSTANCE.getSingleStoreConnectInfoExtensionIClass().getAllProperties(true).get(PROPERTY_ID);
    }
}