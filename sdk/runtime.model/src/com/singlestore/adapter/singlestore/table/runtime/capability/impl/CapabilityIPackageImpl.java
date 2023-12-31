/*
 * Copyright (c)  Informatica Corporation. All rights reserved.
 */

/*
 * This file is generated. Do not modify.
 * IMF Version: 
 * Generation time: 
 */
package com.singlestore.adapter.singlestore.table.runtime.capability.impl;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * The package implementation for IPackage.
 * 'com.singlestore.adapter.singlestore.table.runtime.capability'
 */
public final class CapabilityIPackageImpl
extends com.informatica.imf.icore.impl.IPackageImpl
implements com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage {

    /**
     * The generated Serial Version UID.
     */
      private static final long serialVersionUID = 4688982327040974361L;

    /**
     * The IMF version that this package was generated with.
     */
    private static final String GENERATED_WITH_IMF_VERSION = "9.5.0";

    /**
     * @handcoded
     */
    private static final Logger LOGGER = Logger.getLogger(com.informatica.imf.icore.impl.IPackageImpl.class.getName());


    /**
     * Constant for class 'TableCallCapabilityAttributesExtension'.
     */
    public static final int TABLE_CALL_CAPABILITY_ATTRIBUTES_EXTENSION = 0;


    /**
     * Constant for feature constant in class 'TableCallCapabilityAttributesExtension'.
     */
    private static final int TABLE_CALL_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT = com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_CALL_CAP_ATTRIBUTESFeatureCount()+0;


    /**
     * Constant for class 'TableLookupCapabilityAttributesExtension'.
     */
    public static final int TABLE_LOOKUP_CAPABILITY_ATTRIBUTES_EXTENSION = 1;


    /**
     * Constant for feature constant in class 'TableLookupCapabilityAttributesExtension'.
     */
    private static final int TABLE_LOOKUP_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT = com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_LOOKUP_CAP_ATTRIBUTESFeatureCount()+0;


    /**
     * Constant for class 'TableReadCapabilityAttributesExtension'.
     */
    public static final int TABLE_READ_CAPABILITY_ATTRIBUTES_EXTENSION = 2;


    /**
     * Constant for feature constant in class 'TableReadCapabilityAttributesExtension'.
     */
    private static final int TABLE_READ_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT = com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_READ_CAP_ATTRIBUTESFeatureCount()+0;


    /**
     * Constant for class 'TableWriteCapabilityAttributesExtension'.
     */
    public static final int TABLE_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION = 3;

    /**
     * Constant for property 'TableWriteCapabilityAttributesExtension.UpdateMode'.
     */
    public static final  int TABLE_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION__UPDATE_MODE =com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_WRITE_CAP_ATTRIBUTESFeatureCount()+0;

    /**
     * Constant for feature constant in class 'TableWriteCapabilityAttributesExtension'.
     */
    private static final int TABLE_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT = com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_WRITE_CAP_ATTRIBUTESFeatureCount()+1;



    private com.informatica.imf.icore.IClass tableCallCapabilityAttributesExtensionIClass = null;
    private com.informatica.imf.icore.IClass tableLookupCapabilityAttributesExtensionIClass = null;
    private com.informatica.imf.icore.IClass tableReadCapabilityAttributesExtensionIClass = null;
    private com.informatica.imf.icore.IClass tableWriteCapabilityAttributesExtensionIClass = null;
    private static com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl theComInformaticaAdapterSdkadapterAsoextensionIPackage = (com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl)com.informatica.adapter.sdkadapter.asoextension.AsoextensionIPackage.I_INSTANCE;
    private static com.informatica.imf.icore.impl.IcoreIPackageImpl theComInformaticaImfIcoreIPackage = (com.informatica.imf.icore.impl.IcoreIPackageImpl)com.informatica.imf.icore.IcoreIPackage.I_INSTANCE;
    private static com.informatica.metadata.common.modelextension.impl.ModelextensionIPackageImpl theComInformaticaMetadataCommonModelextensionIPackage = (com.informatica.metadata.common.modelextension.impl.ModelextensionIPackageImpl)com.informatica.metadata.common.modelextension.ModelextensionIPackage.I_INSTANCE;
    private CapabilityIPackageImpl() {
        super(com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIFactory.I_INSTANCE);
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
     public static com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage init() {
       synchronized(com.informatica.imf.icore.IMFRuntime.getInstance().getIMFRegistryLockObject()) {
          LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage: enter 'init()'");
            com.informatica.imf.icore.IMFRuntime imfRuntime = com.informatica.imf.icore.IMFRuntime.getInstance();
          if (imfRuntime.isPackageRegistered(com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage.I_QUALIFIED_NAME)) {
            LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage: already initialized");
            return (com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage)
              imfRuntime.getIPackageForName(com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage.I_QUALIFIED_NAME);
          }

          // Create and register package
          CapabilityIPackageImpl theComSinglestoreAdapterSinglestoreTableRuntimeCapabilityIPackage = (CapabilityIPackageImpl)
              new com.singlestore.adapter.singlestore.table.runtime.capability.impl.CapabilityIPackageImpl();

          theComSinglestoreAdapterSinglestoreTableRuntimeCapabilityIPackage.createPackageContents();



          theComSinglestoreAdapterSinglestoreTableRuntimeCapabilityIPackage.initializePackageContents();



          imfRuntime.registerPackage(theComSinglestoreAdapterSinglestoreTableRuntimeCapabilityIPackage);

          LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage: exit 'init()'");
          return theComSinglestoreAdapterSinglestoreTableRuntimeCapabilityIPackage;
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
     * Retrieves the 'TableCallCapabilityAttributesExtension' IClass defined
     * in this IPackage.
     * @return the 'TableCallCapabilityAttributesExtension' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getTableCallCapabilityAttributesExtensionIClass() {
        return this.tableCallCapabilityAttributesExtensionIClass;
    }


    /**
     * @return the feature count of TABLE_CALL_CAPABILITY_ATTRIBUTES_EXTENSION class
    */
    public static int getTABLE_CALL_CAPABILITY_ATTRIBUTES_EXTENSIONFeatureCount(){
    return TABLE_CALL_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT;
    }

    /**
     * Retrieves the 'TableLookupCapabilityAttributesExtension' IClass defined
     * in this IPackage.
     * @return the 'TableLookupCapabilityAttributesExtension' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getTableLookupCapabilityAttributesExtensionIClass() {
        return this.tableLookupCapabilityAttributesExtensionIClass;
    }


    /**
     * @return the feature count of TABLE_LOOKUP_CAPABILITY_ATTRIBUTES_EXTENSION class
    */
    public static int getTABLE_LOOKUP_CAPABILITY_ATTRIBUTES_EXTENSIONFeatureCount(){
    return TABLE_LOOKUP_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT;
    }

    /**
     * Retrieves the 'TableReadCapabilityAttributesExtension' IClass defined
     * in this IPackage.
     * @return the 'TableReadCapabilityAttributesExtension' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getTableReadCapabilityAttributesExtensionIClass() {
        return this.tableReadCapabilityAttributesExtensionIClass;
    }


    /**
     * @return the feature count of TABLE_READ_CAPABILITY_ATTRIBUTES_EXTENSION class
    */
    public static int getTABLE_READ_CAPABILITY_ATTRIBUTES_EXTENSIONFeatureCount(){
    return TABLE_READ_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT;
    }

    /**
     * Retrieves the 'TableWriteCapabilityAttributesExtension' IClass defined
     * in this IPackage.
     * @return the 'TableWriteCapabilityAttributesExtension' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getTableWriteCapabilityAttributesExtensionIClass() {
        return this.tableWriteCapabilityAttributesExtensionIClass;
    }


    /**
     * @return the feature count of TABLE_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION class
    */
    public static int getTABLE_WRITE_CAPABILITY_ATTRIBUTES_EXTENSIONFeatureCount(){
    return TABLE_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT;
    }



    /**
     * Retrieves the factory class defined in this package.
     * @return the factory class defined in this package.
     */
    @Override
    public com.informatica.imf.icore.IFactory getFactory() {
       return com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIFactory.I_INSTANCE;
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
         LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage: enter 'createPackageContents()'");
         if (this.isCreated) {
           LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage: already created");
           return;
         }
         this.isCreated = true;

         // Create classes and their features
         this.tableCallCapabilityAttributesExtensionIClass = createIClass(TABLE_CALL_CAPABILITY_ATTRIBUTES_EXTENSION);

         this.tableLookupCapabilityAttributesExtensionIClass = createIClass(TABLE_LOOKUP_CAPABILITY_ATTRIBUTES_EXTENSION);

         this.tableReadCapabilityAttributesExtensionIClass = createIClass(TABLE_READ_CAPABILITY_ATTRIBUTES_EXTENSION);

         this.tableWriteCapabilityAttributesExtensionIClass = createIClass(TABLE_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION);
         createIProperty(this.tableWriteCapabilityAttributesExtensionIClass,TABLE_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION__UPDATE_MODE);


         LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage: exit 'createPackageContents()'");
    }
  private boolean isInitialized = false;
    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     *
     */
    @Override
    public void initializePackageContents() {
        LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage: enter 'initializePackageContents()'");
      if (this.isInitialized) {
          LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage: already initialized");
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
        setFactory(com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIFactory.I_INSTANCE);

        //initialize the targets for the Annotations present in this package
        initAnnotationTargets();
        //initialize annotations for all classes and properties, if any
        initAnnotationsForAllElements();

        LOGGER.log(Level.FINE, "Initialization of com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIPackage: exit 'initializePackageContents()'");
    }
    private void addSuperTypesToClasses() {
        assert (this.tableCallCapabilityAttributesExtensionIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.tableCallCapabilityAttributesExtensionIClass)).setSuperClass(com.informatica.adapter.sdkadapter.asoextension.AsoextensionIPackage.I_INSTANCE.getD_ModelExtensionCallCapAttributesIClass());
        assert (this.tableLookupCapabilityAttributesExtensionIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.tableLookupCapabilityAttributesExtensionIClass)).setSuperClass(com.informatica.adapter.sdkadapter.asoextension.AsoextensionIPackage.I_INSTANCE.getD_ModelExtensionLookupCapAttributesIClass());
        assert (this.tableReadCapabilityAttributesExtensionIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.tableReadCapabilityAttributesExtensionIClass)).setSuperClass(com.informatica.adapter.sdkadapter.asoextension.AsoextensionIPackage.I_INSTANCE.getD_ModelExtensionReadCapAttributesIClass());
        assert (this.tableWriteCapabilityAttributesExtensionIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.tableWriteCapabilityAttributesExtensionIClass)).setSuperClass(com.informatica.adapter.sdkadapter.asoextension.AsoextensionIPackage.I_INSTANCE.getD_ModelExtensionWriteCapAttributesIClass());
    }
    private void initClasses() {
        // Initialize classes and features; add operations and parameters
        initIClass(this.tableCallCapabilityAttributesExtensionIClass, "TableCallCapabilityAttributesExtension",
        	!IS_ABSTRACT, IS_SECOND_CLASS, IS_INTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED, "");

        initIClass(this.tableLookupCapabilityAttributesExtensionIClass, "TableLookupCapabilityAttributesExtension",
        	!IS_ABSTRACT, IS_SECOND_CLASS, IS_INTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED, "");

        initIClass(this.tableReadCapabilityAttributesExtensionIClass, "TableReadCapabilityAttributesExtension",
        	!IS_ABSTRACT, IS_SECOND_CLASS, IS_INTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED, "");

        initIClass(this.tableWriteCapabilityAttributesExtensionIClass, "TableWriteCapabilityAttributesExtension",
        	!IS_ABSTRACT, IS_SECOND_CLASS, IS_INTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED, "");
        initIProperty(this.tableWriteCapabilityAttributesExtensionIClass.getAllProperties(true).get(TABLE_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION__UPDATE_MODE), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "UpdateMode",
        	"Update As Update", BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
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



      		//initialization of annotations for class TableCallCapabilityAttributesExtension
      		com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl TableCallCapabilityAttributesExtensionCppSerializeAsGeneric = 
      					new com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl();
      		TableCallCapabilityAttributesExtensionCppSerializeAsGeneric.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getCppSerializeAsGenericIClass());
      		TableCallCapabilityAttributesExtensionCppSerializeAsGeneric.setContainerProperty("genericContainer");
      		TableCallCapabilityAttributesExtensionCppSerializeAsGeneric.setExtensionPoint("com.informatica.adapter.sdkadapter.capabilityattribute.D_CallCapabilityAttributes");
      		TableCallCapabilityAttributesExtensionCppSerializeAsGeneric.setSerializedExtensionClass("com.informatica.adapter.sdkadapter.asoextension.D_GenericModelExtensionCallCapAttributes");
      		this.addAnnotationToElement(this.tableCallCapabilityAttributesExtensionIClass, TableCallCapabilityAttributesExtensionCppSerializeAsGeneric);


      		//initialization of annotations for class TableLookupCapabilityAttributesExtension
      		com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl TableLookupCapabilityAttributesExtensionCppSerializeAsGeneric = 
      					new com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl();
      		TableLookupCapabilityAttributesExtensionCppSerializeAsGeneric.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getCppSerializeAsGenericIClass());
      		TableLookupCapabilityAttributesExtensionCppSerializeAsGeneric.setContainerProperty("genericContainer");
      		TableLookupCapabilityAttributesExtensionCppSerializeAsGeneric.setExtensionPoint("com.informatica.adapter.sdkadapter.capabilityattribute.D_LookupCapabilityAttributes");
      		TableLookupCapabilityAttributesExtensionCppSerializeAsGeneric.setSerializedExtensionClass("com.informatica.adapter.sdkadapter.asoextension.D_GenericModelExtensionLookupCapAttributes");
      		this.addAnnotationToElement(this.tableLookupCapabilityAttributesExtensionIClass, TableLookupCapabilityAttributesExtensionCppSerializeAsGeneric);


      		//initialization of annotations for class TableReadCapabilityAttributesExtension
      		com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl TableReadCapabilityAttributesExtensionCppSerializeAsGeneric = 
      					new com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl();
      		TableReadCapabilityAttributesExtensionCppSerializeAsGeneric.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getCppSerializeAsGenericIClass());
      		TableReadCapabilityAttributesExtensionCppSerializeAsGeneric.setContainerProperty("genericContainer");
      		TableReadCapabilityAttributesExtensionCppSerializeAsGeneric.setExtensionPoint("com.informatica.adapter.sdkadapter.capabilityattribute.D_ReadCapabilityAttributes");
      		TableReadCapabilityAttributesExtensionCppSerializeAsGeneric.setSerializedExtensionClass("com.informatica.adapter.sdkadapter.asoextension.D_GenericModelExtensionReadCapAttributes");
      		this.addAnnotationToElement(this.tableReadCapabilityAttributesExtensionIClass, TableReadCapabilityAttributesExtensionCppSerializeAsGeneric);


      		//initialization of annotations for class TableWriteCapabilityAttributesExtension
      		com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl TableWriteCapabilityAttributesExtensionCppSerializeAsGeneric = 
      					new com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl();
      		TableWriteCapabilityAttributesExtensionCppSerializeAsGeneric.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getCppSerializeAsGenericIClass());
      		TableWriteCapabilityAttributesExtensionCppSerializeAsGeneric.setContainerProperty("genericContainer");
      		TableWriteCapabilityAttributesExtensionCppSerializeAsGeneric.setExtensionPoint("com.informatica.adapter.sdkadapter.capabilityattribute.D_WriteCapabilityAttributes");
      		TableWriteCapabilityAttributesExtensionCppSerializeAsGeneric.setSerializedExtensionClass("com.informatica.adapter.sdkadapter.asoextension.D_GenericModelExtensionWriteCapAttributes");
      		this.addAnnotationToElement(this.tableWriteCapabilityAttributesExtensionIClass, TableWriteCapabilityAttributesExtensionCppSerializeAsGeneric);


      		//initialization of annotations for property UpdateMode
      		com.informatica.imf.annotations.constraints.impl.LengthImpl tablewritecapabilityattributesextensionUpdatemodeLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		tablewritecapabilityattributesextensionUpdatemodeLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		tablewritecapabilityattributesextensionUpdatemodeLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		tablewritecapabilityattributesextensionUpdatemodeLength.setMax(0);
      		tablewritecapabilityattributesextensionUpdatemodeLength.setMin(0);
      		this.addAnnotationToElement(this.tableWriteCapabilityAttributesExtensionIClass.getAllProperties(true).get(TABLE_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION__UPDATE_MODE), tablewritecapabilityattributesextensionUpdatemodeLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl tablewritecapabilityattributesextensionUpdatemodePersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		tablewritecapabilityattributesextensionUpdatemodePersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		tablewritecapabilityattributesextensionUpdatemodePersistence.setSize(0);
      		this.addAnnotationToElement(this.tableWriteCapabilityAttributesExtensionIClass.getAllProperties(true).get(TABLE_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION__UPDATE_MODE), tablewritecapabilityattributesextensionUpdatemodePersistence);
    }
}