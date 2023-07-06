package com.singlestore.adapter.singlestore.connection.model;

import com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.model.SDKConnectInfoModelExtension;
import com.informatica.imf.annotations.Class;
import com.informatica.imf.annotations.Property;
import com.informatica.imf.annotations.constraints.model.Length;
import com.informatica.imf.annotations.constraints.model.Persistence;
import com.informatica.imf.annotations.constraints.model.Range;
import com.informatica.metadata.common.annotation.model.Parameterizable;
import com.informatica.imf.annotations.ClassKind;
import com.informatica.metadata.common.annotation.model.CppSerializeAsGeneric;

@CppSerializeAsGeneric( extensionPoint = "com.informatica.metadata.infasdk.connectinfo.sdkadapter.SDKConnectInfo" ,  serializedExtensionClass = "com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.GenericSDKConnectInfoModelExtension" ,  containerProperty = "genericContainer" )
@com.informatica.imf.annotations.Class( classKind = com.informatica.imf.annotations.ClassKind.SECOND_CLASS_INTERNAL )
public class SingleStoreConnectInfoExtension extends SDKConnectInfoModelExtension  {

    @Property( minOccurs = 1 ,  maxOccurs = 1 )
    @Length( min = 0 ,  max = 511 )
    @Persistence( size = 511 )
    String hostname;

    @Property( minOccurs = 1 ,  maxOccurs = 1 )
    @Range( minValue = "0" ,  maxValue = "65353" )
    int port = 3306;

    @Property( minOccurs = 0 ,  maxOccurs = 1 )
    @Length( min = 0 ,  max = 255 )
    @Persistence( size = 255 )
    String database;

    @Property( minOccurs = 1 ,  maxOccurs = 1 )
    @Length( min = 0 ,  max = 255 )
    @Persistence( size = 255 )
    String user = "root";

    @Property( isSensitive = true ,  minOccurs = 0 ,  maxOccurs = 1 )
    @Length( min = 0 ,  max = 255 )
    @Persistence( size = 255 )
    String password;

    @Property( minOccurs = 0 ,  maxOccurs = 1 )
    boolean useSsl = false;

    @Property( minOccurs = 0 ,  maxOccurs = 1 )
    @Length( min = 0 ,  max = 24576 )
    @Persistence( size = 24576 )
    String serverSslCert;

    @Property( minOccurs = 0 ,  maxOccurs = 1 )
    @Length( min = 0 ,  max = 1023 )
    @Persistence( size = 1023 )
    String keyStore;

    @Property( isSensitive = true ,  minOccurs = 0 ,  maxOccurs = 1 )
    @Length( min = 0 ,  max = 255 )
    @Persistence( size = 255 )
    String keyStorePassword;

    @Property( isSensitive = true ,  minOccurs = 0 ,  maxOccurs = 1 )
    @Length( min = 0 ,  max = 255 )
    @Persistence( size = 255 )
    String keyPassword;

    @Property( minOccurs = 0 ,  maxOccurs = 1 )
    @Length( min = 0 ,  max = 1023 )
    @Persistence( size = 1023 )
    String trustStore;

    @Property( isSensitive = true ,  minOccurs = 0 ,  maxOccurs = 1 )
    @Length( min = 0 ,  max = 255 )
    @Persistence( size = 255 )
    String trustStorePassword;

    @Property( minOccurs = 0 ,  maxOccurs = 1 )
    boolean trustServerCertificate = false;

    @Property( minOccurs = 0 ,  maxOccurs = 1 )
    boolean disableSslHostnameVerification = false;

}