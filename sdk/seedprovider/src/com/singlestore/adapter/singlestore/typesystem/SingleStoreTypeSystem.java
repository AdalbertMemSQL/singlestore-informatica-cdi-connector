package com.singlestore.adapter.singlestore.typesystem;

import com.informatica.imf.icore.IMFRuntime;
import com.informatica.imf.icore.exception.SeedException;
import com.informatica.metadata.common.typesystem.DataType;
import com.informatica.metadata.common.typesystem.TypeSystem;
import com.informatica.metadata.common.typesystem.directmaps.DirectTypeSystemMap;
import com.informatica.metadata.common.typesystem.directmaps.util.DirectMapUtils;
import com.informatica.metadata.common.typesystem.storagesemantics.LengthUnitKind;
import com.informatica.metadata.common.typesystem.storagesemantics.RadixKind;
import com.informatica.metadata.common.typesystem.storagesemantics.util.StorageSemanticsUtils;
import com.informatica.metadata.common.typesystem.util.TypeSystemUtils;
import com.informatica.metadata.seed.platform.Platform;

@SuppressWarnings("unused")
@com.informatica.imf.annotations.seed.SeedProvider
public class SingleStoreTypeSystem  {

    @com.informatica.imf.annotations.seed.Seed
    public static final TypeSystem typesystem = TypeSystemUtils.INSTANCE.createTypeSystem("com.singlestore.adapter.singlestore.typesystem.SingleStoreTypeSystem", 
                                                                                          "SINGLESTORE", "SingleStore Adapter Type System");

    public static final DataType boolDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, "BOOL", 
                                                                                                         "", 1, 1, false);

    public static final DataType booleanDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, 
                                                                                                            "BOOLEAN", "", 
                                                                                                            1, 1, false);

    public static final DataType bitDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "BIT", 
                                                                                                      "", 8, 8, LengthUnitKind.characters, 
                                                                                                      true, true);

    public static final DataType tinyintDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, 
                                                                                                            "TINYINT", "", 
                                                                                                            3, 3, false);

    public static final DataType mediumintDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, 
                                                                                                              "MEDIUMINT", 
                                                                                                              "", 7, 7, 
                                                                                                              false);

    public static final DataType smallintDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, 
                                                                                                             "SMALLINT", 
                                                                                                             "", 5, 5, false);

    public static final DataType intDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, "INT", 
                                                                                                        "", 10, 10, false);

    public static final DataType integerDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, 
                                                                                                            "INTEGER", "", 
                                                                                                            10, 10, false);

    public static final DataType bigintDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, "BIGINT", 
                                                                                                           "", 19, 19, false);

    public static final DataType floatDT = StorageSemanticsUtils.INSTANCE.createFloatSemanticsDataType(typesystem, "FLOAT", 
                                                                                                       "", 8, 8, false, 
                                                                                                       RadixKind.decimal, 
                                                                                                       8, 0, RadixKind.binary);

    public static final DataType doubleDT = StorageSemanticsUtils.INSTANCE.createFloatSemanticsDataType(typesystem, "DOUBLE", 
                                                                                                        "", 15, 15, false, 
                                                                                                        RadixKind.decimal, 
                                                                                                        11, 0, RadixKind.binary);

    public static final DataType realDT = StorageSemanticsUtils.INSTANCE.createFloatSemanticsDataType(typesystem, "REAL", 
                                                                                                      "", 15, 15, false, 
                                                                                                      RadixKind.decimal, 
                                                                                                      11, 0, RadixKind.binary);

    public static final DataType dateDT = StorageSemanticsUtils.INSTANCE.createGDateSemanticsDataType(typesystem, "DATE", 
                                                                                                      "", true, true, true, 
                                                                                                      false, false, false, 
                                                                                                      false, 0, 0, false);

    public static final DataType timeDT = StorageSemanticsUtils.INSTANCE.createGDateSemanticsDataType(typesystem, "TIME", 
                                                                                                      "", false, false, 
                                                                                                      false, true, true, 
                                                                                                      true, false, 6, 0, 
                                                                                                      true);

    public static final DataType datetimeDT = StorageSemanticsUtils.INSTANCE.createGDateSemanticsDataType(typesystem, "DATETIME", 
                                                                                                          "", true, true, 
                                                                                                          true, true, true, 
                                                                                                          true, false, 6, 
                                                                                                          0, true);

    public static final DataType timestampDT = StorageSemanticsUtils.INSTANCE.createGDateSemanticsDataType(typesystem, "TIMESTAMP", 
                                                                                                           "", true, true, 
                                                                                                           true, true, true, 
                                                                                                           true, false, 
                                                                                                           6, 0, true);

    public static final DataType yearDT = StorageSemanticsUtils.INSTANCE.createGDateSemanticsDataType(typesystem, "YEAR", 
                                                                                                      "", true, false, false, 
                                                                                                      false, false, false, 
                                                                                                      false, 0, 0, false);

    public static final DataType decimalDT = StorageSemanticsUtils.INSTANCE.createSciDecimalSemanticsDataType(typesystem, 
                                                                                                              "DECIMAL", 
                                                                                                              "", 38, 10, 
                                                                                                              true, 28, 
                                                                                                              0, 0, true);

    public static final DataType decDT = StorageSemanticsUtils.INSTANCE.createSciDecimalSemanticsDataType(typesystem, "DEC", 
                                                                                                          "", 38, 10, true, 
                                                                                                          28, 0, 0, true);

    public static final DataType fixedDT = StorageSemanticsUtils.INSTANCE.createSciDecimalSemanticsDataType(typesystem, 
                                                                                                            "FIXED", "", 
                                                                                                            38, 10, true, 
                                                                                                            28, 0, 0, true);

    public static final DataType numericDT = StorageSemanticsUtils.INSTANCE.createSciDecimalSemanticsDataType(typesystem, 
                                                                                                              "NUMERIC", 
                                                                                                              "", 38, 10, 
                                                                                                              true, 28, 
                                                                                                              0, 0, true);

    public static final DataType charDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "CHAR", 
                                                                                                       "", 255, 1, LengthUnitKind.characters, 
                                                                                                       true, true);

    public static final DataType mediumtextDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, 
                                                                                                             "MEDIUMTEXT", 
                                                                                                             "", 16777216, 
                                                                                                             16777216, LengthUnitKind.bytes, 
                                                                                                             false, true);

    public static final DataType binaryDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "BINARY", 
                                                                                                         "", 255, 1, LengthUnitKind.bytes, 
                                                                                                         true, true);

    public static final DataType varcharDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "VARCHAR", 
                                                                                                          "", 21845, 255, 
                                                                                                          LengthUnitKind.characters, 
                                                                                                          true, true);

    public static final DataType varbinaryDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, 
                                                                                                            "VARBINARY", 
                                                                                                            "", 104857600, 
                                                                                                            255, LengthUnitKind.characters, 
                                                                                                            true, true);

    public static final DataType longtextDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "LONGTEXT", 
                                                                                                           "", 104857600, 
                                                                                                           104857600, LengthUnitKind.bytes, 
                                                                                                           false, true);

    public static final DataType textDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "TEXT", 
                                                                                                       "", 65535, 65535, 
                                                                                                       LengthUnitKind.bytes, 
                                                                                                       false, true);

    public static final DataType tinytextDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "TINYTEXT", 
                                                                                                           "", 255, 255, 
                                                                                                           LengthUnitKind.characters, 
                                                                                                           false, true);

    public static final DataType longblobDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "LONGBLOB", 
                                                                                                           "", 104857600, 
                                                                                                           104857600, LengthUnitKind.bytes, 
                                                                                                           false, true);

    public static final DataType mediumblobDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, 
                                                                                                             "MEDIUMBLOB", 
                                                                                                             "", 16777216, 
                                                                                                             16777216, LengthUnitKind.bytes, 
                                                                                                             false, true);

    public static final DataType blobDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "BLOB", 
                                                                                                       "", 65535, 65535, 
                                                                                                       LengthUnitKind.bytes, 
                                                                                                       false, true);

    public static final DataType tinyblobDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "TINYBLOB", 
                                                                                                           "", 255, 255, 
                                                                                                           LengthUnitKind.bytes, 
                                                                                                           false, true);

    public static final DataType jsonDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "JSON", 
                                                                                                       "", 104857600, 104857600, 
                                                                                                       LengthUnitKind.characters, 
                                                                                                       false, true);

    public static final DataType geographyDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, 
                                                                                                            "GEOGRAPHY", 
                                                                                                            "", 104857600, 
                                                                                                            104857600, LengthUnitKind.characters, 
                                                                                                            false, true);

    public static final DataType geographypointDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, 
                                                                                                                 "GEOGRAPHYPOINT", 
                                                                                                                 "", 104857600, 
                                                                                                                 104857600, 
                                                                                                                 LengthUnitKind.characters, 
                                                                                                                 false, 
                                                                                                                 true);

    private static final DirectTypeSystemMap singlestorePlatformMap = DirectMapUtils.INSTANCE.createDirectTypeSystemMap(
                                                                                                                        typesystem, 
                                                                                                                        Platform.typesystem);
    static {
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, bitDT, Platform.binaryDT, false, false, true, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, numericDT, Platform.integerDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, blobDT, Platform.stringDT, false, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, booleanDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, doubleDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, tinyintDT, Platform.integerDT, true, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, mediumblobDT, Platform.binaryDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, blobDT, Platform.binaryDT, false, false, true, 
                                                      true);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, tinyintDT, Platform.doubleDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, integerDT, Platform.doubleDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, textDT, Platform.stringDT, false, false, true, 
                                                      true);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, boolDT, Platform.stringDT, false, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, booleanDT, Platform.integerDT, true, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, bitDT, Platform.stringDT, false, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, boolDT, Platform.decimalDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, bigintDT, Platform.decimalDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, floatDT, Platform.doubleDT, true, false, true, 
                                                      true);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, geographyDT, Platform.stringDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, decimalDT, Platform.decimalDT, false, false, 
                                                      true, true);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, numericDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, decimalDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, mediumtextDT, Platform.stringDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, timeDT, Platform.stringDT, false, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, yearDT, Platform.dateDT, false, false, true, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, timestampDT, Platform.dateDT, false, false, 
                                                      true, true);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, decDT, Platform.stringDT, false, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, realDT, Platform.doubleDT, true, false, true, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, intDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, booleanDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, intDT, Platform.stringDT, false, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, tinyintDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, timestampDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, varbinaryDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, tinyintDT, Platform.decimalDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, jsonDT, Platform.stringDT, false, false, true, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, datetimeDT, Platform.dateDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, varbinaryDT, Platform.binaryDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, datetimeDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, decimalDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, bigintDT, Platform.bigIntegerDT, false, true, 
                                                      true, true);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, integerDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, timeDT, Platform.dateDT, false, false, true, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, doubleDT, Platform.decimalDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, realDT, Platform.integerDT, true, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, doubleDT, Platform.doubleDT, true, false, 
                                                      true, true);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, varcharDT, Platform.stringDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, mediumintDT, Platform.bigIntegerDT, false, 
                                                      true, false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, geographypointDT, Platform.stringDT, false, 
                                                      false, true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, booleanDT, Platform.decimalDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, boolDT, Platform.doubleDT, true, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, binaryDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, yearDT, Platform.stringDT, false, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, varcharDT, Platform.binaryDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, realDT, Platform.decimalDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, tinytextDT, Platform.binaryDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, fixedDT, Platform.doubleDT, true, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, tinyblobDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, booleanDT, Platform.doubleDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, mediumintDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, floatDT, Platform.integerDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, decDT, Platform.doubleDT, true, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, smallintDT, Platform.bigIntegerDT, false, 
                                                      true, false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, realDT, Platform.stringDT, false, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, mediumintDT, Platform.integerDT, true, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, floatDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, longtextDT, Platform.stringDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, longtextDT, Platform.binaryDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, bigintDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, doubleDT, Platform.integerDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, decDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, longblobDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, intDT, Platform.integerDT, true, false, true, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, floatDT, Platform.decimalDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, decimalDT, Platform.doubleDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, integerDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, tinyblobDT, Platform.binaryDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, tinytextDT, Platform.stringDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, yearDT, Platform.doubleDT, true, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, yearDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, binaryDT, Platform.binaryDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, integerDT, Platform.integerDT, true, false, 
                                                      true, true);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, fixedDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, floatDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, mediumintDT, Platform.doubleDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, numericDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, integerDT, Platform.decimalDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, smallintDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, doubleDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, fixedDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, longblobDT, Platform.binaryDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, tinyintDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, dateDT, Platform.stringDT, false, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, decDT, Platform.integerDT, true, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, numericDT, Platform.decimalDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, mediumintDT, Platform.decimalDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, decimalDT, Platform.integerDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, bigintDT, Platform.integerDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, yearDT, Platform.integerDT, true, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, smallintDT, Platform.decimalDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, boolDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, intDT, Platform.decimalDT, false, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, numericDT, Platform.doubleDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, intDT, Platform.doubleDT, true, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, fixedDT, Platform.decimalDT, false, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, charDT, Platform.binaryDT, false, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, dateDT, Platform.dateDT, false, false, true, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, charDT, Platform.stringDT, false, false, true, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, fixedDT, Platform.integerDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, boolDT, Platform.integerDT, true, false, true, 
                                                      true);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, bigintDT, Platform.doubleDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, smallintDT, Platform.integerDT, true, false, 
                                                      true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, realDT, Platform.bigIntegerDT, false, true, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, mediumblobDT, Platform.stringDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, yearDT, Platform.decimalDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, mediumtextDT, Platform.binaryDT, false, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, smallintDT, Platform.doubleDT, true, false, 
                                                      false, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, textDT, Platform.binaryDT, false, false, false, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(singlestorePlatformMap, decDT, Platform.decimalDT, false, false, true, 
                                                      false);
    }

    static {
            try {
             	 IMFRuntime.getInstance().getSeedRegistry().register(SingleStoreTypeSystem.class);
            } catch (SeedException e) {
            	e.printStackTrace();
            }
    }


    private SingleStoreTypeSystem(){}


}