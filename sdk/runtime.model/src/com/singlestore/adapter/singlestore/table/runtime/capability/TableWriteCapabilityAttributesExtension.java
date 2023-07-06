/*
 * Copyright (c) 2023 Informatica Corporation. All rights reserved.
 */

/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0
 * Generation time: 2023-06-15 16:24:31
 */

package com.singlestore.adapter.singlestore.table.runtime.capability;


/**
 * The interface for IClass
 *     'TableWriteCapabilityAttributesExtension'.
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
 *     <li>{@link com.singlestore.adapter.singlestore.table.runtime.capability.TableWriteCapabilityAttributesExtension#getUpdateMode() <em>UpdateMode</em>} </li>
 * </ul>
 * </p>
 * @Class (isSeeded=false, classKind=com.informatica.imf.annotations.ClassKind.SECOND_CLASS_INTERNAL, isAbstract=false)
 */
 public interface TableWriteCapabilityAttributesExtension extends com.informatica.adapter.sdkadapter.asoextension.D_ModelExtensionWriteCapAttributes {

    /** A constant that references the IClass for this generated Java Class. */
    com.informatica.imf.icore.IClass ICLASS = CapabilityIPackage.I_INSTANCE.getTableWriteCapabilityAttributesExtensionIClass();
    /**
     * Retrieves the 'UpdateMode' property value for this IObject.
     * @return the 'UpdateMode' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getUpdateMode();


    /**
     * Sets the 'UpdateMode' property value for this IObject.
     * @param updateMode is the new property value for this IObject
     * @see #getUpdateMode
     */
    void setUpdateMode(java.lang.String updateMode);

    /**
     * Exposes the IProperties of the IClass associated with this Object
     */
    static class Properties {

        public static com.informatica.imf.icore.IProperty UPDATE_MODE = null;
        static  {
			com.singlestore.adapter.singlestore.table.runtime.capability.impl.TableWriteCapabilityAttributesExtensionImpl.initIProperties();
		}
    }
 }