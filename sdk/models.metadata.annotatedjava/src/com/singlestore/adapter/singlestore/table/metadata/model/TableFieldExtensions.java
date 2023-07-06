package com.singlestore.adapter.singlestore.table.metadata.model;

import com.informatica.adapter.sdkadapter.logical.model.L_ModelExtensionFieldBase;
import com.informatica.imf.annotations.Class;
import com.informatica.imf.annotations.Property;
import com.informatica.imf.annotations.constraints.model.Length;
import com.informatica.imf.annotations.constraints.model.Persistence;
import com.informatica.imf.annotations.constraints.model.Range;
import com.informatica.metadata.common.annotation.model.Parameterizable;
import com.informatica.imf.annotations.ClassKind;
import com.informatica.metadata.common.annotation.model.CppSerializeAsGeneric;

@CppSerializeAsGeneric( extensionPoint = "com.informatica.adapter.sdkadapter.patternblocks.field.P_Field" ,  serializedExtensionClass = "com.informatica.adapter.sdkadapter.logical.L_GenericModelExtensionFieldBase" ,  containerProperty = "genericContainer" )
@com.informatica.imf.annotations.Class( classKind = com.informatica.imf.annotations.ClassKind.SECOND_CLASS_INTERNAL )
public class TableFieldExtensions extends L_ModelExtensionFieldBase  {
}