/*
 * Copyright (c)  Informatica Corporation. All rights reserved.
 */

/*
 * This file is generated. Do not modify.
 * IMF Version: 
 * Generation time: 
 */
package com.singlestore.adapter.singlestore.connection.impl;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * The package implementation for IPackage.
 * 'com.singlestore.adapter.singlestore.connection'
 */
public final class ConnectionIPackageImpl
extends com.informatica.imf.icore.impl.IPackageImpl
implements com.singlestore.adapter.singlestore.connection.ConnectionIPackage {

    /**
     * The generated Serial Version UID.
     */
      private static final long serialVersionUID = -5154086267752679601L;

    /**
     * The IMF version that this package was generated with.
     */
    private static final String GENERATED_WITH_IMF_VERSION = "9.5.0";

    /**
     * @handcoded
     */
    private static final Logger LOGGER = Logger.getLogger(com.informatica.imf.icore.impl.IPackageImpl.class.getName());


    /**
     * Constant for class 'SingleStoreConnectInfoExtension'.
     */
    public static final int SINGLE_STORE_CONNECT_INFO_EXTENSION = 0;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.database'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__DATABASE =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+0;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.disableSslHostnameVerification'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__DISABLE_SSL_HOSTNAME_VERIFICATION =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+1;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.hostname'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__HOSTNAME =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+2;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.keyPassword'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_PASSWORD =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+3;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.keyStore'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_STORE =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+4;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.keyStorePassword'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_STORE_PASSWORD =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+5;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.password'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__PASSWORD =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+6;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.port'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__PORT =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+7;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.serverSslCert'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__SERVER_SSL_CERT =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+8;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.trustServerCertificate'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_SERVER_CERTIFICATE =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+9;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.trustStore'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_STORE =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+10;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.trustStorePassword'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_STORE_PASSWORD =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+11;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.useSsl'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__USE_SSL =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+12;

    /**
     * Constant for property 'SingleStoreConnectInfoExtension.user'.
     */
    public static final  int SINGLE_STORE_CONNECT_INFO_EXTENSION__USER =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+13;

    /**
     * Constant for feature constant in class 'SingleStoreConnectInfoExtension'.
     */
    private static final int SINGLE_STORE_CONNECT_INFO_EXTENSION_FEATURE_COUNT = com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+14;


    /**
     * Constant for class 'SingleStoreConnectInfo'.
     */
    public static final int SINGLE_STORE_CONNECT_INFO = 1;


    /**
     * Constant for feature constant in class 'SingleStoreConnectInfo'.
     */
    private static final int SINGLE_STORE_CONNECT_INFO_FEATURE_COUNT = com.informatica.metadata.infasdk.connectinfo.sdkadapter.impl.SdkadapterIPackageImpl.getS_D_K_CONNECT_INFOFeatureCount()+0;



    private com.informatica.imf.icore.IClass singleStoreConnectInfoExtensionIClass = null;
    private com.informatica.imf.icore.IClass singleStoreConnectInfoIClass = null;
    private static com.informatica.metadata.infasdk.connectinfo.sdkadapter.impl.SdkadapterIPackageImpl theComInformaticaMetadataInfasdkConnectinfoSdkadapterIPackage = (com.informatica.metadata.infasdk.connectinfo.sdkadapter.impl.SdkadapterIPackageImpl)com.informatica.metadata.infasdk.connectinfo.sdkadapter.SdkadapterIPackage.I_INSTANCE;
    private static com.informatica.metadata.common.core.impl.CoreIPackageImpl theComInformaticaMetadataCommonCoreIPackage = (com.informatica.metadata.common.core.impl.CoreIPackageImpl)com.informatica.metadata.common.core.CoreIPackage.I_INSTANCE;
    private static com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl theComInformaticaMetadataInfasdkConnectinfoCommonSdkmodelextensionIPackage = (com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl)com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.SdkmodelextensionIPackage.I_INSTANCE;
    private static com.informatica.imf.icore.impl.IcoreIPackageImpl theComInformaticaImfIcoreIPackage = (com.informatica.imf.icore.impl.IcoreIPackageImpl)com.informatica.imf.icore.IcoreIPackage.I_INSTANCE;
    private static com.informatica.metadata.common.modelextension.impl.ModelextensionIPackageImpl theComInformaticaMetadataCommonModelextensionIPackage = (com.informatica.metadata.common.modelextension.impl.ModelextensionIPackageImpl)com.informatica.metadata.common.modelextension.ModelextensionIPackage.I_INSTANCE;
    private static com.informatica.metadata.common.connectinfo.impl.ConnectinfoIPackageImpl theComInformaticaMetadataCommonConnectinfoIPackage = (com.informatica.metadata.common.connectinfo.impl.ConnectinfoIPackageImpl)com.informatica.metadata.common.connectinfo.ConnectinfoIPackage.I_INSTANCE;
    private ConnectionIPackageImpl() {
        super(com.singlestore.adapter.singlestore.connection.ConnectionIFactory.I_INSTANCE);
        // set all the package-info
        setVersion("1.0.0");

    }

    /**
     * Creates, registers, and initializes the <b>Package</b> for this
     * model, and for any others upon which it depends.  Simple
     * dependencies are satisfied by calling this method on all
     * dependent packages before doing anything else. This method drives
     * initialization for interdependent packages directly, in parallel
     * with this package, itself.
     * <p>Of this package and its interdependencies, all packages which
     * have not yet been registered by their fully qualified name  values are first created
     * and registered.  The packages are then initialized in two steps:
     * meta-model objects for all of the packages are created before any
     * are initialized, since one package's meta-model objects may refer to
     * those of another.
     * <p>Invocation of this method will not affect any packages that have
     * already been initialized.
     * @return the initialized package for this model.</br>
     *         null if the package was not found.
     */
     public static com.singlestore.adapter.singlestore.connection.ConnectionIPackage init() {
       synchronized(com.informatica.imf.icore.IMFRuntime.getInstance().getIMFRegistryLockObject()) {
          LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.connection.ConnectionIPackage: enter 'init()'");
            com.informatica.imf.icore.IMFRuntime imfRuntime = com.informatica.imf.icore.IMFRuntime.getInstance();
          if (imfRuntime.isPackageRegistered(com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_QUALIFIED_NAME)) {
            LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.connection.ConnectionIPackage: already initialized");
            return (com.singlestore.adapter.singlestore.connection.ConnectionIPackage)
              imfRuntime.getIPackageForName(com.singlestore.adapter.singlestore.connection.ConnectionIPackage.I_QUALIFIED_NAME);
          }

          // Create and register package
          ConnectionIPackageImpl theComSinglestoreAdapterSinglestoreConnectionIPackage = (ConnectionIPackageImpl)
              new com.singlestore.adapter.singlestore.connection.impl.ConnectionIPackageImpl();

          theComSinglestoreAdapterSinglestoreConnectionIPackage.createPackageContents();



          theComSinglestoreAdapterSinglestoreConnectionIPackage.initializePackageContents();



          imfRuntime.registerPackage(theComSinglestoreAdapterSinglestoreConnectionIPackage);

          LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.connection.ConnectionIPackage: exit 'init()'");
          return theComSinglestoreAdapterSinglestoreConnectionIPackage;
      }
    }



    /**
     * Returns the IMF version that this package was generated with.
     * @return The used IMF version that was used for the generation of this package.
     */
    @Override
    public String getGeneratedWithIMFVersion() {
        return GENERATED_WITH_IMF_VERSION;
    }
    /**
     * Retrieves the 'SingleStoreConnectInfoExtension' IClass defined
     * in this IPackage.
     * @return the 'SingleStoreConnectInfoExtension' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getSingleStoreConnectInfoExtensionIClass() {
        return this.singleStoreConnectInfoExtensionIClass;
    }


    /**
     * @return the feature count of SINGLE_STORE_CONNECT_INFO_EXTENSION class
    */
    public static int getSINGLE_STORE_CONNECT_INFO_EXTENSIONFeatureCount(){
    return SINGLE_STORE_CONNECT_INFO_EXTENSION_FEATURE_COUNT;
    }

    /**
     * Retrieves the 'SingleStoreConnectInfo' IClass defined
     * in this IPackage.
     * @return the 'SingleStoreConnectInfo' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getSingleStoreConnectInfoIClass() {
        return this.singleStoreConnectInfoIClass;
    }


    /**
     * @return the feature count of SINGLE_STORE_CONNECT_INFO class
    */
    public static int getSINGLE_STORE_CONNECT_INFOFeatureCount(){
    return SINGLE_STORE_CONNECT_INFO_FEATURE_COUNT;
    }



    /**
     * Retrieves the factory class defined in this package.
     * @return the factory class defined in this package.
     */
    @Override
    public com.informatica.imf.icore.IFactory getFactory() {
       return com.singlestore.adapter.singlestore.connection.ConnectionIFactory.I_INSTANCE;
    }

    /**
     * @generated
     * @see com.informatica.imf.icore.INamedElement#getNamespace()
     */
    @Override
    public String getQualifiedName() {
      return I_QUALIFIED_NAME;
    }

   private boolean isCreated = false;

    /**
      * Creates the meta-model objects for the package.  This method is
      * guarded to have no affect on any invocation but its first.
      *
      *
      */
     @Override
     public void createPackageContents() {
         LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.connection.ConnectionIPackage: enter 'createPackageContents()'");
         if (this.isCreated) {
           LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.connection.ConnectionIPackage: already created");
           return;
         }
         this.isCreated = true;

         // Create classes and their features
         this.singleStoreConnectInfoExtensionIClass = createIClass(SINGLE_STORE_CONNECT_INFO_EXTENSION);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__DATABASE);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__DISABLE_SSL_HOSTNAME_VERIFICATION);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__HOSTNAME);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_PASSWORD);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_STORE);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_STORE_PASSWORD);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__PASSWORD);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__PORT);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__SERVER_SSL_CERT);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_SERVER_CERTIFICATE);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_STORE);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_STORE_PASSWORD);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__USE_SSL);
         createIProperty(this.singleStoreConnectInfoExtensionIClass,SINGLE_STORE_CONNECT_INFO_EXTENSION__USER);

         this.singleStoreConnectInfoIClass = createIClass(SINGLE_STORE_CONNECT_INFO);


         LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.connection.ConnectionIPackage: exit 'createPackageContents()'");
    }
  private boolean isInitialized = false;
    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     *
     */
    @Override
    public void initializePackageContents() {
        LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.connection.ConnectionIPackage: enter 'initializePackageContents()'");
      if (this.isInitialized) {
          LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.connection.ConnectionIPackage: already initialized");
          return;
        }

        this.isInitialized = true;
        // Initialize package
        setName(I_NAME);
        setNsPrefix(I_NS_PREFIX);
        setComment(I_COMMENT);
      iSetIdentity(getQualifiedName());

        // Initialize types defined in this package
        addSuperTypesToClasses();
        initClasses();
        setFactory(com.singlestore.adapter.singlestore.connection.ConnectionIFactory.I_INSTANCE);

        //initialize the targets for the Annotations present in this package
        initAnnotationTargets();
        //initialize annotations for all classes and properties, if any
        initAnnotationsForAllElements();

        LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.connection.ConnectionIPackage: exit 'initializePackageContents()'");
    }
    private void addSuperTypesToClasses() {
        assert (this.singleStoreConnectInfoExtensionIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.singleStoreConnectInfoExtensionIClass)).setSuperClass(com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.SdkmodelextensionIPackage.I_INSTANCE.getSDKConnectInfoModelExtensionIClass());
        assert (this.singleStoreConnectInfoIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.singleStoreConnectInfoIClass)).setSuperClass(com.informatica.metadata.infasdk.connectinfo.sdkadapter.SdkadapterIPackage.I_INSTANCE.getSDKConnectInfoIClass());
    }
    private void initClasses() {
        // Initialize classes and features; add operations and parameters
        initIClass(this.singleStoreConnectInfoExtensionIClass, "SingleStoreConnectInfoExtension",
        	!IS_ABSTRACT, IS_SECOND_CLASS, IS_INTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED, "");
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__DATABASE), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "database",
        	"", BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__DISABLE_SSL_HOSTNAME_VERIFICATION), com.informatica.imf.icore.ICoreDatatypes.I_BOOLEAN, "disableSslHostnameVerification",
        	false, BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__HOSTNAME), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "hostname",
        	"", BOUNDS_VALUE_ONE, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_PASSWORD), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "keyPassword",
        	"", BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_STORE), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "keyStore",
        	"", BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_STORE_PASSWORD), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "keyStorePassword",
        	"", BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__PASSWORD), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "password",
        	"", BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__PORT), com.informatica.imf.icore.ICoreDatatypes.I_INTEGER, "port",
        	3306, BOUNDS_VALUE_ONE, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__SERVER_SSL_CERT), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "serverSslCert",
        	"", BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_SERVER_CERTIFICATE), com.informatica.imf.icore.ICoreDatatypes.I_BOOLEAN, "trustServerCertificate",
        	false, BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_STORE), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "trustStore",
        	"", BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_STORE_PASSWORD), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "trustStorePassword",
        	"", BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__USE_SSL), com.informatica.imf.icore.ICoreDatatypes.I_BOOLEAN, "useSsl",
        	false, BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
        initIProperty(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__USER), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "user",
        	"root", BOUNDS_VALUE_ONE, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
        initIClass(this.singleStoreConnectInfoIClass, "SingleStoreConnectInfo",
        	!IS_ABSTRACT, IS_FIRST_CLASS, IS_EXTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED, "");

    }
    private void initEnums() {
        com.informatica.imf.icore.IEnumerationLiteral defaultLiteral = null;
        // Initialize enums and add enum literals
    }

    private void initAnnotationTargets() {
        //Set Annotation Targets for all the Annotation IClasses in this Package.
    }


    private void initAnnotationsForAllElements() {
      //This method initialize annotations present on various elements
      //(package, types and properties) in a package.



      		//initialization of annotations for class SingleStoreConnectInfoExtension
      		com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl SingleStoreConnectInfoExtensionCppSerializeAsGeneric = 
      					new com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl();
      		SingleStoreConnectInfoExtensionCppSerializeAsGeneric.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getCppSerializeAsGenericIClass());
      		SingleStoreConnectInfoExtensionCppSerializeAsGeneric.setContainerProperty("genericContainer");
      		SingleStoreConnectInfoExtensionCppSerializeAsGeneric.setExtensionPoint("com.informatica.metadata.infasdk.connectinfo.sdkadapter.SDKConnectInfo");
      		SingleStoreConnectInfoExtensionCppSerializeAsGeneric.setSerializedExtensionClass("com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.GenericSDKConnectInfoModelExtension");
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass, SingleStoreConnectInfoExtensionCppSerializeAsGeneric);


      		//initialization of annotations for property database
      		com.informatica.imf.annotations.constraints.impl.LengthImpl singlestoreconnectinfoextensionDatabaseLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		singlestoreconnectinfoextensionDatabaseLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		singlestoreconnectinfoextensionDatabaseLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		singlestoreconnectinfoextensionDatabaseLength.setMax(255);
      		singlestoreconnectinfoextensionDatabaseLength.setMin(0);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__DATABASE), singlestoreconnectinfoextensionDatabaseLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl singlestoreconnectinfoextensionDatabasePersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		singlestoreconnectinfoextensionDatabasePersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		singlestoreconnectinfoextensionDatabasePersistence.setSize(255);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__DATABASE), singlestoreconnectinfoextensionDatabasePersistence);

      		//initialization of annotations for property hostname
      		com.informatica.imf.annotations.constraints.impl.LengthImpl singlestoreconnectinfoextensionHostnameLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		singlestoreconnectinfoextensionHostnameLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		singlestoreconnectinfoextensionHostnameLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		singlestoreconnectinfoextensionHostnameLength.setMax(511);
      		singlestoreconnectinfoextensionHostnameLength.setMin(0);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__HOSTNAME), singlestoreconnectinfoextensionHostnameLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl singlestoreconnectinfoextensionHostnamePersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		singlestoreconnectinfoextensionHostnamePersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		singlestoreconnectinfoextensionHostnamePersistence.setSize(511);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__HOSTNAME), singlestoreconnectinfoextensionHostnamePersistence);

      		//initialization of annotations for property keyPassword
      		com.informatica.imf.annotations.constraints.impl.LengthImpl singlestoreconnectinfoextensionKeypasswordLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		singlestoreconnectinfoextensionKeypasswordLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		singlestoreconnectinfoextensionKeypasswordLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		singlestoreconnectinfoextensionKeypasswordLength.setMax(255);
      		singlestoreconnectinfoextensionKeypasswordLength.setMin(0);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_PASSWORD), singlestoreconnectinfoextensionKeypasswordLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl singlestoreconnectinfoextensionKeypasswordPersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		singlestoreconnectinfoextensionKeypasswordPersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		singlestoreconnectinfoextensionKeypasswordPersistence.setSize(255);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_PASSWORD), singlestoreconnectinfoextensionKeypasswordPersistence);

      		//initialization of annotations for property keyStore
      		com.informatica.imf.annotations.constraints.impl.LengthImpl singlestoreconnectinfoextensionKeystoreLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		singlestoreconnectinfoextensionKeystoreLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		singlestoreconnectinfoextensionKeystoreLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		singlestoreconnectinfoextensionKeystoreLength.setMax(1023);
      		singlestoreconnectinfoextensionKeystoreLength.setMin(0);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_STORE), singlestoreconnectinfoextensionKeystoreLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl singlestoreconnectinfoextensionKeystorePersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		singlestoreconnectinfoextensionKeystorePersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		singlestoreconnectinfoextensionKeystorePersistence.setSize(1023);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_STORE), singlestoreconnectinfoextensionKeystorePersistence);

      		//initialization of annotations for property keyStorePassword
      		com.informatica.imf.annotations.constraints.impl.LengthImpl singlestoreconnectinfoextensionKeystorepasswordLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		singlestoreconnectinfoextensionKeystorepasswordLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		singlestoreconnectinfoextensionKeystorepasswordLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		singlestoreconnectinfoextensionKeystorepasswordLength.setMax(255);
      		singlestoreconnectinfoextensionKeystorepasswordLength.setMin(0);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_STORE_PASSWORD), singlestoreconnectinfoextensionKeystorepasswordLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl singlestoreconnectinfoextensionKeystorepasswordPersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		singlestoreconnectinfoextensionKeystorepasswordPersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		singlestoreconnectinfoextensionKeystorepasswordPersistence.setSize(255);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__KEY_STORE_PASSWORD), singlestoreconnectinfoextensionKeystorepasswordPersistence);

      		//initialization of annotations for property password
      		com.informatica.imf.annotations.constraints.impl.LengthImpl singlestoreconnectinfoextensionPasswordLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		singlestoreconnectinfoextensionPasswordLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		singlestoreconnectinfoextensionPasswordLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		singlestoreconnectinfoextensionPasswordLength.setMax(255);
      		singlestoreconnectinfoextensionPasswordLength.setMin(0);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__PASSWORD), singlestoreconnectinfoextensionPasswordLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl singlestoreconnectinfoextensionPasswordPersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		singlestoreconnectinfoextensionPasswordPersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		singlestoreconnectinfoextensionPasswordPersistence.setSize(255);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__PASSWORD), singlestoreconnectinfoextensionPasswordPersistence);

      		//initialization of annotations for property port
      		com.informatica.imf.annotations.constraints.impl.RangeImpl singlestoreconnectinfoextensionPortRange = 
      					new com.informatica.imf.annotations.constraints.impl.RangeImpl();
      		singlestoreconnectinfoextensionPortRange.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getRangeIClass());
      		singlestoreconnectinfoextensionPortRange.setMaxValue("65353");
      		singlestoreconnectinfoextensionPortRange.setMinValue("0");
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__PORT), singlestoreconnectinfoextensionPortRange);

      		//initialization of annotations for property serverSslCert
      		com.informatica.imf.annotations.constraints.impl.LengthImpl singlestoreconnectinfoextensionServersslcertLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		singlestoreconnectinfoextensionServersslcertLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		singlestoreconnectinfoextensionServersslcertLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		singlestoreconnectinfoextensionServersslcertLength.setMax(24576);
      		singlestoreconnectinfoextensionServersslcertLength.setMin(0);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__SERVER_SSL_CERT), singlestoreconnectinfoextensionServersslcertLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl singlestoreconnectinfoextensionServersslcertPersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		singlestoreconnectinfoextensionServersslcertPersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		singlestoreconnectinfoextensionServersslcertPersistence.setSize(24576);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__SERVER_SSL_CERT), singlestoreconnectinfoextensionServersslcertPersistence);

      		//initialization of annotations for property trustStore
      		com.informatica.imf.annotations.constraints.impl.LengthImpl singlestoreconnectinfoextensionTruststoreLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		singlestoreconnectinfoextensionTruststoreLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		singlestoreconnectinfoextensionTruststoreLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		singlestoreconnectinfoextensionTruststoreLength.setMax(1023);
      		singlestoreconnectinfoextensionTruststoreLength.setMin(0);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_STORE), singlestoreconnectinfoextensionTruststoreLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl singlestoreconnectinfoextensionTruststorePersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		singlestoreconnectinfoextensionTruststorePersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		singlestoreconnectinfoextensionTruststorePersistence.setSize(1023);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_STORE), singlestoreconnectinfoextensionTruststorePersistence);

      		//initialization of annotations for property trustStorePassword
      		com.informatica.imf.annotations.constraints.impl.LengthImpl singlestoreconnectinfoextensionTruststorepasswordLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		singlestoreconnectinfoextensionTruststorepasswordLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		singlestoreconnectinfoextensionTruststorepasswordLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		singlestoreconnectinfoextensionTruststorepasswordLength.setMax(255);
      		singlestoreconnectinfoextensionTruststorepasswordLength.setMin(0);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_STORE_PASSWORD), singlestoreconnectinfoextensionTruststorepasswordLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl singlestoreconnectinfoextensionTruststorepasswordPersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		singlestoreconnectinfoextensionTruststorepasswordPersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		singlestoreconnectinfoextensionTruststorepasswordPersistence.setSize(255);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__TRUST_STORE_PASSWORD), singlestoreconnectinfoextensionTruststorepasswordPersistence);

      		//initialization of annotations for property user
      		com.informatica.imf.annotations.constraints.impl.LengthImpl singlestoreconnectinfoextensionUserLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		singlestoreconnectinfoextensionUserLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		singlestoreconnectinfoextensionUserLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		singlestoreconnectinfoextensionUserLength.setMax(255);
      		singlestoreconnectinfoextensionUserLength.setMin(0);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__USER), singlestoreconnectinfoextensionUserLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl singlestoreconnectinfoextensionUserPersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		singlestoreconnectinfoextensionUserPersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		singlestoreconnectinfoextensionUserPersistence.setSize(255);
      		this.addAnnotationToElement(this.singleStoreConnectInfoExtensionIClass.getAllProperties(true).get(SINGLE_STORE_CONNECT_INFO_EXTENSION__USER), singlestoreconnectinfoextensionUserPersistence);
      		//initialization of annotations for class SingleStoreConnectInfo
      		com.informatica.metadata.common.annotation.impl.SerializeAsGenericClassImpl SingleStoreConnectInfoSerializeAsGenericClass = 
      					new com.informatica.metadata.common.annotation.impl.SerializeAsGenericClassImpl();
      		SingleStoreConnectInfoSerializeAsGenericClass.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getSerializeAsGenericClassIClass());
      		SingleStoreConnectInfoSerializeAsGenericClass.setGenericClass("com.informatica.metadata.infasdk.connectinfo.sdkadapter.GenericSDKConnectInfo");
      		this.addAnnotationToElement(this.singleStoreConnectInfoIClass, SingleStoreConnectInfoSerializeAsGenericClass);


    }
}