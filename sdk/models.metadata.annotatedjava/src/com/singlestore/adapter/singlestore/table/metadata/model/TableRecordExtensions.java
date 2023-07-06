package com.singlestore.adapter.singlestore.table.metadata.model;

import com.informatica.adapter.sdkadapter.logical.model.L_ModelExtensionNode;
import com.informatica.imf.annotations.Class;
import com.informatica.imf.annotations.Property;
import com.informatica.imf.annotations.constraints.model.Length;
import com.informatica.imf.annotations.constraints.model.Persistence;
import com.informatica.imf.annotations.constraints.model.Range;
import com.informatica.metadata.common.annotation.model.Parameterizable;
import com.informatica.imf.annotations.ClassKind;
import com.informatica.metadata.common.annotation.model.CppSerializeAsGeneric;

@CppSerializeAsGeneric( extensionPoint = "com.informatica.adapter.sdkadapter.patternblocks.flatrecord.P_FlatRecord" ,  serializedExtensionClass = "com.informatica.adapter.sdkadapter.logical.L_GenericModelExtensionNode" ,  containerProperty = "genericContainer" )
@com.informatica.imf.annotations.Class( classKind = com.informatica.imf.annotations.ClassKind.SECOND_CLASS_INTERNAL )
public class TableRecordExtensions extends L_ModelExtensionNode  {
}