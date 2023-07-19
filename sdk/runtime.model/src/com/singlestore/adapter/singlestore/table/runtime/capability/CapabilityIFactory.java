/* 
 * Copyright (c) 2023 Informatica Corporation. All rights reserved. 
 */
 
/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0 
 * Generation time: 2023-07-19 12:14:34
 */ 
package com.singlestore.adapter.singlestore.table.runtime.capability;

/**
 * The factory interface for IPackage.
 * 'com.singlestore.adapter.singlestore.table.runtime.capability'
 *
 * <p><br>
 * <b>Thread-Safety</b>
 * <br>This interface is thread-safe. An instance of the class implementing
 * this interface can be accessed by multiple threads concurrently.</br>
 * </br></p>
 */

public interface CapabilityIFactory
extends com.informatica.imf.icore.IFactory {

    /**
     * The Factory instance for package
     * 'com.singlestore.adapter.singlestore.table.runtime.capability'.
     */
    com.singlestore.adapter.singlestore.table.runtime.capability.CapabilityIFactory I_INSTANCE = new
        com.singlestore.adapter.singlestore.table.runtime.capability.impl.CapabilityIFactoryImpl();
    /**
     * Creates an instance of TableCallCapabilityAttributesExtension IClass.
     * @return an object of type TableCallCapabilityAttributesExtension.
     */

    com.singlestore.adapter.singlestore.table.runtime.capability.TableCallCapabilityAttributesExtension createTableCallCapabilityAttributesExtension();
    /**
     * Creates an instance of TableLookupCapabilityAttributesExtension IClass.
     * @return an object of type TableLookupCapabilityAttributesExtension.
     */

    com.singlestore.adapter.singlestore.table.runtime.capability.TableLookupCapabilityAttributesExtension createTableLookupCapabilityAttributesExtension();
    /**
     * Creates an instance of TableReadCapabilityAttributesExtension IClass.
     * @return an object of type TableReadCapabilityAttributesExtension.
     */

    com.singlestore.adapter.singlestore.table.runtime.capability.TableReadCapabilityAttributesExtension createTableReadCapabilityAttributesExtension();
    /**
     * Creates an instance of TableWriteCapabilityAttributesExtension IClass.
     * @return an object of type TableWriteCapabilityAttributesExtension.
     */

    com.singlestore.adapter.singlestore.table.runtime.capability.TableWriteCapabilityAttributesExtension createTableWriteCapabilityAttributesExtension();
}