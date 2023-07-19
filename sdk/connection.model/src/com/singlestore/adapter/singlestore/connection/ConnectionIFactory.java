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
 * The factory interface for IPackage.
 * 'com.singlestore.adapter.singlestore.connection'
 *
 * <p><br>
 * <b>Thread-Safety</b>
 * <br>This interface is thread-safe. An instance of the class implementing
 * this interface can be accessed by multiple threads concurrently.</br>
 * </br></p>
 */

public interface ConnectionIFactory
extends com.informatica.imf.icore.IFactory {

    /**
     * The Factory instance for package
     * 'com.singlestore.adapter.singlestore.connection'.
     */
    com.singlestore.adapter.singlestore.connection.ConnectionIFactory I_INSTANCE = new
        com.singlestore.adapter.singlestore.connection.impl.ConnectionIFactoryImpl();
    /**
     * Creates an instance of SingleStoreConnectInfoExtension IClass.
     * @return an object of type SingleStoreConnectInfoExtension.
     */

    com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfoExtension createSingleStoreConnectInfoExtension();
    /**
     * Creates an instance of SingleStoreConnectInfo IClass.
     * @return an object of type SingleStoreConnectInfo.
     */

    com.singlestore.adapter.singlestore.connection.SingleStoreConnectInfo createSingleStoreConnectInfo();
}