// Copyright (c) 2010 Informatica Corporation. All rights reserved.

// *** This file is generated. Do not modify. ***

package com.singlestore.adapter.singlestore.table.metadata.factory;

import java.io.PrintStream;
import com.informatica.sdk.adapter.metadata.patternblocks.field.semantic.iface.Field;
import com.informatica.adapter.sdkadapter.patternblocks.field.semantic.auto.SAP_Field;
import java.util.Iterator;
import java.util.Date;
import com.informatica.messages.InfaMessage;
import com.singlestore.adapter.singlestore.table.metadata.semantic.auto.SATableRecordExtensions;
import com.informatica.adapter.sdkadapter.patternblocks.flatrecord.semantic.auto.SAP_FlatRecord;
import java.util.Collection;
import com.singlestore.adapter.singlestore.table.metadata.semantic.iface.SEMTableRecordExtensions;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import com.singlestore.adapter.singlestore.table.metadata.factory.semantic.iface.SEMFactory;
import com.informatica.imf.icore.IProperty;
import com.informatica.sdk.adapter.metadata.patternblocks.catalog.semantic.iface.Catalog;
import com.informatica.adapter.sdkadapter.logical.semantic.manual.*;
import com.singlestore.adapter.singlestore.table.metadata.semantic.iface.SEMTableFieldExtensions;
import com.informatica.adapter.sdkadapter.patternblocks.semantic.manual.SP_Factory;
import java.util.Collections;
import com.singlestore.adapter.singlestore.table.metadata.semantic.auto.SATableFieldExtensions;
import java.util.LinkedHashSet;
import com.informatica.sdk.adapter.metadata.patternblocks.flatrecord.semantic.iface.FlatRecord;

@SuppressWarnings("unused") //$NON-NLS-1$
public class AdapterFactory extends SP_Factory implements SEMFactory
{



    /** Map contains assoications between IMF interfaces and semantic/validator classes */
    private static java.util.concurrent.ConcurrentHashMap<String, MapEntry> _AdapterFactory_map = new java.util.concurrent.ConcurrentHashMap<String, MapEntry>();

    /** Get mapping for this IMF class. Delegate upwards if not found */
    public MapEntry getMapping(String imfInterfaceClass) throws SL_Exception
    {
        MapEntry rc = _AdapterFactory_map.get(imfInterfaceClass);
        if(rc==null)
            return super.getMapping(imfInterfaceClass);
        else {
            if(rc.semanticClass == null)
            {
                MapEntry rc1 = super.getMapping(imfInterfaceClass);
                rc.semanticClass = rc1.semanticClass;
            }
            return rc;
        }

    }




    // Associate IMF classes with semantic/validator classes.
    // Strings are used for delayed class loading in DxT
    static {
        MapEntry entry;
        entry = new MapEntry("com.singlestore.adapter.singlestore.table.metadata.semantic.auto.SATableFieldExtensions", "com.singlestore.adapter.singlestore.table.metadata.objectmanager.auto.MATableFieldExtensions");
        addMapping(_AdapterFactory_map, "com.singlestore.adapter.singlestore.table.metadata.TableFieldExtensions", entry);
        entry = new MapEntry("com.singlestore.adapter.singlestore.table.metadata.semantic.auto.SATableRecordExtensions", "com.singlestore.adapter.singlestore.table.metadata.objectmanager.auto.MATableRecordExtensions");
        addMapping(_AdapterFactory_map, "com.singlestore.adapter.singlestore.table.metadata.TableRecordExtensions", entry);
    }
    /** Create a new instance of SEMTableFieldExtensions */
    public SEMTableFieldExtensions newSEMTableFieldExtensions(Catalog catalog)
    {
        return (SEMTableFieldExtensions)SATableFieldExtensions.newObj((com.informatica.adapter.sdkadapter.patternblocks.catalog.semantic.auto.SAP_Catalog)catalog);
    }

    /** Create a new instance of Field */
    public Field newField(Catalog catalog)
    {
        Field newObj = (Field)SAP_Field.newObj((com.informatica.adapter.sdkadapter.patternblocks.catalog.semantic.auto.SAP_Catalog)catalog);
        SEMTableFieldExtensions newExtnObj = newSEMTableFieldExtensions(catalog);
        newObj.setExtensions(newExtnObj);
        return newObj;
    }

    /** Create a new instance of SEMTableRecordExtensions */
    public SEMTableRecordExtensions newSEMTableRecordExtensions(Catalog catalog)
    {
        return (SEMTableRecordExtensions)SATableRecordExtensions.newObj((com.informatica.adapter.sdkadapter.patternblocks.catalog.semantic.auto.SAP_Catalog)catalog);
    }

    /** Create a new instance of FlatRecord */
    public FlatRecord newFlatRecord(Catalog catalog)
    {
        FlatRecord newObj = (FlatRecord)SAP_FlatRecord.newObj((com.informatica.adapter.sdkadapter.patternblocks.catalog.semantic.auto.SAP_Catalog)catalog);
        SEMTableRecordExtensions newExtnObj = newSEMTableRecordExtensions(catalog);
        newObj.setExtensions(newExtnObj);
        return newObj;
    }

}
