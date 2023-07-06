/* 
 * Copyright (c) 2023 Informatica Corporation. All rights reserved. 
 */
 
/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0 
 * Generation time: 2023-05-08 17:20:39
 */ 
package com.singlestore.adapter.singlestore.table.metadata;

/**
 * The factory interface for IPackage.
 * 'com.singlestore.adapter.singlestore.table.metadata'
 *
 * <p><br>
 * <b>Thread-Safety</b>
 * <br>This interface is thread-safe. An instance of the class implementing
 * this interface can be accessed by multiple threads concurrently.</br>
 * </br></p>
 */

public interface MetadataIFactory
extends com.informatica.imf.icore.IFactory {

    /**
     * The Factory instance for package
     * 'com.singlestore.adapter.singlestore.table.metadata'.
     */
    com.singlestore.adapter.singlestore.table.metadata.MetadataIFactory I_INSTANCE = new
        com.singlestore.adapter.singlestore.table.metadata.impl.MetadataIFactoryImpl();
    /**
     * Creates an instance of TableFieldExtensions IClass.
     * @return an object of type TableFieldExtensions.
     */

    com.singlestore.adapter.singlestore.table.metadata.TableFieldExtensions createTableFieldExtensions();
    /**
     * Creates an instance of TableRecordExtensions IClass.
     * @return an object of type TableRecordExtensions.
     */

    com.singlestore.adapter.singlestore.table.metadata.TableRecordExtensions createTableRecordExtensions();
}