/* 
 * Copyright (c) 2023 Informatica Corporation. All rights reserved. 
 */
 
/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0 
 * Generation time: 2023-07-19 12:14:34
 */ 
package com.singlestore.adapter.singlestore.runtime.aso;

/**
 * The factory interface for IPackage.
 * 'com.singlestore.adapter.singlestore.runtime.aso'
 *
 * <p><br>
 * <b>Thread-Safety</b>
 * <br>This interface is thread-safe. An instance of the class implementing
 * this interface can be accessed by multiple threads concurrently.</br>
 * </br></p>
 */

public interface AsoIFactory
extends com.informatica.imf.icore.IFactory {

    /**
     * The Factory instance for package
     * 'com.singlestore.adapter.singlestore.runtime.aso'.
     */
    com.singlestore.adapter.singlestore.runtime.aso.AsoIFactory I_INSTANCE = new
        com.singlestore.adapter.singlestore.runtime.aso.impl.AsoIFactoryImpl();
    /**
     * Creates an instance of ComplexASO IClass.
     * @return an object of type ComplexASO.
     */

    com.singlestore.adapter.singlestore.runtime.aso.ComplexASO createComplexASO();
}