package com.singlestore.adapter.singlestore.cci.deploy;

import java.util.HashMap;
import java.util.UUID;
import com.informatica.cloud.adapter.cci.boot.CCIBootPlugin;
import com.informatica.cloud.api.adapter.plugin.IPluginExtension;
import com.informatica.cloud.adapter.cci.boot.CCIBootPlugin;
import com.informatica.cloud.api.adapter.plugin.IPluginExtension;

public class SingleStorePlugin extends CCIBootPlugin  implements IPluginExtension {

    static final String uuid = "16ab879f-1d4a-47bc-99d4-bb1f4dcf43af";

    static final String ADAPTER_ID = "com.singlestore.adapter.singlestore";

    static HashMap<String, Object> configurations = new HashMap<String, Object>();
    static {
            configurations.put("schema", "Database");
            configurations.put("HAS_FAULT", false);
            configurations.put("Table.TableWrite.Upsert", "UpdateMode.Update else Insert");
    }


    public SingleStorePlugin(){
    		super(UUID.fromString(uuid), ADAPTER_ID, configurations);
    }


}