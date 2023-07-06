package com.singlestore.adapter.singlestore.runtime.semantic.manual;

import com.informatica.sdk.adapter.metadata.aso.objectmanager.manual.MD_ASOOperation;
import com.informatica.sdk.adapter.metadata.aso.semantic.iface.ASOOperation;

public class SingleStoreASOOperationObjMgr extends MD_ASOOperation  {
	
    @Override
    public boolean prepareRuntimeOperation(ASOOperation semanticObject){
    	return true;
    }
}