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
 * The package interface for IPackage.
 * 'com.singlestore.adapter.singlestore.table.metadata'
 *
 * <p><br>
 * <b>Thread-Safety</b>
 * <br>This interface is thread-safe. An instance of the class implementing
 * this interface can be accessed by multiple threads concurrently. Note that
 * the package initialization of this package and all its dependent package
 * is also thread-safe.</br>
 * </br></p>
 */
public interface MetadataIPackage
extends com.informatica.imf.icore.IPackage {
    // Package attributes derived from package namespace and name
    /**
     * Constant for the name of the package.
     */
    java.lang.String I_NAME = "metadata";

    /**
     * Constant for the comment associated with the package.
     */
    java.lang.String I_COMMENT = "";

    /**
     * Constant for the namespace prefix.
     */
    java.lang.String I_NS_PREFIX = "com.singlestore.adapter.singlestore.table";

    /**
     * Constant for the fully qualified name.
     */
    java.lang.String I_QUALIFIED_NAME = I_NS_PREFIX + "." + I_NAME;


    // Create and initialize metamodel for this package (reflective API)
    /**
     * Constant for the package instance.
     */
    com.singlestore.adapter.singlestore.table.metadata.MetadataIPackage I_INSTANCE = com.singlestore.adapter.singlestore.table.metadata.impl.MetadataIPackageImpl.init();


    /**
     * Retrieves the 'TableFieldExtensions' IClass
     * defined in this IPackage.
     * @return the 'TableFieldExtensions' IClass
     * defined in this IPackage
     */
    com.informatica.imf.icore.IClass getTableFieldExtensionsIClass();


    /**
     * Retrieves the 'TableRecordExtensions' IClass
     * defined in this IPackage.
     * @return the 'TableRecordExtensions' IClass
     * defined in this IPackage
     */
    com.informatica.imf.icore.IClass getTableRecordExtensionsIClass();
}