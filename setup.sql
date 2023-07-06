CREATE DATABASE db;
use db;
CREATE ROWSTORE TABLE `allTypesTable` (
  `boolColumn` BOOL,
  `booleanColumn` BOOLEAN,
  `bitColumn` BIT(64),
  `tinyintColumn` TINYINT,
  `mediumintColumn` MEDIUMINT,
  `smallintColumn` SMALLINT,
  `intColumn` INT,
  `integerColumn` INTEGER,
  `bigintColumn` BIGINT,
  `floatColumn` FLOAT,
  `doubleColumn` DOUBLE,
  `realColumn` REAL,
  `dateColumn` DATE,
  `timeColumn` TIME,
  `time6Column` TIME(6),
  `datetimeColumn` DATETIME,
  `datetime6Column` DATETIME(6),
  `timestampColumn` TIMESTAMP,
  `timestamp6Column` TIMESTAMP(6),
  `yearColumn` YEAR,
  `decimalColumn` DECIMAL(65, 30),
  `decColumn` DEC,
  `fixedColumn` FIXED,
  `numericColumn` NUMERIC,
  `charColumn` CHAR,
  `mediumtextColumn` MEDIUMTEXT,
  `binaryColumn` BINARY,
  `varcharColumn` VARCHAR(100),
  `varbinaryColumn` VARBINARY(100),
  `longtextColumn` LONGTEXT,
  `textColumn` TEXT,\
  `tinytextColumn` TINYTEXT,
  `longblobColumn` LONGBLOB,
  `mediumblobColumn` MEDIUMBLOB,
  `blobColumn` BLOB,
  `tinyblobColumn` TINYBLOB,
  `jsonColumn` JSON,
  `geographyColumn` GEOGRAPHY,
  `geographypointColumn` GEOGRAPHYPOINT
);
INSERT INTO `allTypesTable` VALUES (
true,
true,
'01234567',
127,
8388607,
32767,
2147483647,
2147483647,
9223372036854775807,
10.1,
100.1,
100.1,
'2000-10-10',
'10:10:10',
'10:10:10.555555',
'2000-10-10 10:10:10',
'2000-10-10 10:10:10.555555',
'2000-10-10 10:10:10',
'2000-10-10 10:10:10.555555',
2010,
10000.100001,
10000.100001,
10000.100001,
10000.100001,
'a',
'abc',
'a',
'abc',
'abc',
'abc',
'abc',
'abc',
'abc',
'abc',
'abc',
'abc',
'{}',
'POLYGON((1 1,2 1,2 2, 1 2, 1 1))',
'POINT(1.5 1.5)');
CREATE TABLE t(a INT, b TEXT);
INSERT INTO t VALUES(0, 'qwe');
INSERT INTO t VALUES(1, 'rty');
INSERT INTO t VALUES(2, 'uio');
INSERT INTO t VALUES(3, 'o');
INSERT INTO t VALUES(4, null);
INSERT INTO t VALUES(5, '');
INSERT INTO t VALUES(6, 'awc');
CREATE TABLE t1(a INT, b TEXT);
INSERT INTO t1 VALUES(0, 'qwe');
INSERT INTO t1 VALUES(1, 'rty');
INSERT INTO t1 VALUES(2, 'uio');
INSERT INTO t1 VALUES(3, 'o');
INSERT INTO t1 VALUES(4, null);
INSERT INTO t1 VALUES(5, '');
INSERT INTO t1 VALUES(6, 'awc');
CREATE TABLE t2(a INT, b TEXT);
INSERT INTO t2 VALUES(0, 'a');
INSERT INTO t2 VALUES(1, 'o');
INSERT INTO t2 VALUES(2, null);
INSERT INTO t2 VALUES(3, '');
CREATE ROWSTORE TABLE `allTypesTable2` (
  `boolColumn` BOOL,
  `booleanColumn` BOOLEAN,
  `bitColumn` BIT(64),
  `tinyintColumn` TINYINT,
  `mediumintColumn` MEDIUMINT,
  `smallintColumn` SMALLINT,
  `intColumn` INT,
  `integerColumn` INTEGER,
  `bigintColumn` BIGINT,
  `floatColumn` FLOAT,
  `doubleColumn` DOUBLE,
  `realColumn` REAL,
  `dateColumn` DATE,
  `timeColumn` TIME,
  `time6Column` TIME(6),
  `datetimeColumn` DATETIME,
  `datetime6Column` DATETIME(6),
  `timestampColumn` TIMESTAMP,
  `timestamp6Column` TIMESTAMP(6),
  `yearColumn` YEAR,
  `decimalColumn` DECIMAL(65, 30),
  `decColumn` DEC,
  `fixedColumn` FIXED,
  `numericColumn` NUMERIC,
  `charColumn` CHAR,
  `mediumtextColumn` MEDIUMTEXT,
  `binaryColumn` BINARY,
  `varcharColumn` VARCHAR(100),
  `varbinaryColumn` VARBINARY(100),
  `longtextColumn` LONGTEXT,
  `textColumn` TEXT,
  `tinytextColumn` TINYTEXT,
  `longblobColumn` LONGBLOB,
  `mediumblobColumn` MEDIUMBLOB,
  `blobColumn` BLOB,
  `tinyblobColumn` TINYBLOB,
  `jsonColumn` JSON,
  `geographyColumn` GEOGRAPHY,
  `geographypointColumn` GEOGRAPHYPOINT
) ;
CREATE TABLE `deleteIntegerSource` (a INT, b TEXT, PRIMARY KEY(a));
INSERT INTO `deleteIntegerSource` VALUES (1, 'abc');
INSERT INTO `deleteIntegerSource` VALUES (2, 'cde');
INSERT INTO `deleteIntegerSource` VALUES (5, 'abc');
CREATE TABLE `deleteIntegerTarget` (a INT, b TEXT, PRIMARY KEY(a));
INSERT INTO `deleteIntegerTarget` VALUES (1, 'abc');
INSERT INTO `deleteIntegerTarget` VALUES (2, 'cde');
INSERT INTO `deleteIntegerTarget` VALUES (3, 'cde');
INSERT INTO `deleteIntegerTarget` VALUES (4, 'abc');
INSERT INTO `deleteIntegerTarget` VALUES (5, 'abc');
CREATE TABLE `deleteStringSource` (a TEXT, b TEXT, PRIMARY KEY(a));
INSERT INTO `deleteStringSource` VALUES ('1', 'abc');
INSERT INTO `deleteStringSource` VALUES ('2', 'cde');
INSERT INTO `deleteStringSource` VALUES ('5', 'abc');
CREATE TABLE `deleteStringTarget` (a TEXT, b TEXT, PRIMARY KEY(a));
INSERT INTO `deleteStringTarget` VALUES ('1', 'abc');
INSERT INTO `deleteStringTarget` VALUES ('2', 'cde');
INSERT INTO `deleteStringTarget` VALUES ('3', 'cde');
INSERT INTO `deleteStringTarget` VALUES ('4', 'abc');
INSERT INTO `deleteStringTarget` VALUES ('5', 'abc');
CREATE TABLE `deleteFractionalSource` (a DECIMAL(20, 10), b TEXT, PRIMARY KEY(a));
INSERT INTO `deleteFractionalSource` VALUES ('1.1', 'abc');
INSERT INTO `deleteFractionalSource` VALUES ('2.2', 'cde');
INSERT INTO `deleteFractionalSource` VALUES ('5.5', 'abc');
CREATE TABLE `deleteFractionalTarget` (a DECIMAL(20, 10), b TEXT, PRIMARY KEY(a));
INSERT INTO `deleteFractionalTarget` VALUES ('1.1', 'abc');
INSERT INTO `deleteFractionalTarget` VALUES ('2.2', 'cde');
INSERT INTO `deleteFractionalTarget` VALUES ('3.3', 'cde');
INSERT INTO `deleteFractionalTarget` VALUES ('4.4', 'abc');
INSERT INTO `deleteFractionalTarget` VALUES ('5.6', 'abc');
CREATE TABLE `deleteTimeSource` (a DATETIME(6), b TEXT, PRIMARY KEY(a));
INSERT INTO `deleteTimeSource` VALUES ('2000-01-01 00:00:00.1', 'abc');
INSERT INTO `deleteTimeSource` VALUES ('2000-01-01 00:00:00.2', 'cde');
INSERT INTO `deleteTimeSource` VALUES ('2000-01-01 00:00:00.5', 'abc');
CREATE TABLE `deleteTimeTarget` (a DATETIME(6), b TEXT, PRIMARY KEY(a));
INSERT INTO `deleteTimeTarget` VALUES ('2000-01-01 00:00:00.1', 'abc');
INSERT INTO `deleteTimeTarget` VALUES ('2000-01-01 00:00:00.2', 'cde');
INSERT INTO `deleteTimeTarget` VALUES ('2000-01-01 00:00:00.3', 'cde');
INSERT INTO `deleteTimeTarget` VALUES ('2000-01-01 00:00:00.4', 'abc');
INSERT INTO `deleteTimeTarget` VALUES ('2000-01-01 00:00:00.5', 'abc');
CREATE TABLE `deleteBinarySource` (a BLOB, b TEXT, PRIMARY KEY(a));
INSERT INTO `deleteBinarySource` VALUES ('1', 'abc');
INSERT INTO `deleteBinarySource` VALUES ('2', 'cde');
INSERT INTO `deleteBinarySource` VALUES ('5', 'abc');
CREATE TABLE `deleteBinaryTarget` (a BLOB, b TEXT, PRIMARY KEY(a));
INSERT INTO `deleteBinaryTarget` VALUES ('1', 'abc');
INSERT INTO `deleteBinaryTarget` VALUES ('2', 'cde');
INSERT INTO `deleteBinaryTarget` VALUES ('3', 'cde');
INSERT INTO `deleteBinaryTarget` VALUES ('4', 'abc');
INSERT INTO `deleteBinaryTarget` VALUES ('5', 'abc');
CREATE TABLE `deleteMultiSource` (a INT, b TEXT, PRIMARY KEY(a, b));
INSERT INTO `deleteMultiSource` VALUES (1, 'abc');
INSERT INTO `deleteMultiSource` VALUES (2, 'cde');
INSERT INTO `deleteMultiSource` VALUES (5, 'abc');
CREATE TABLE `deleteMultiTarget` (a INT, b TEXT, PRIMARY KEY(a, b));
INSERT INTO `deleteMultiTarget` VALUES (1, 'abc');
INSERT INTO `deleteMultiTarget` VALUES (2, 'cde');
INSERT INTO `deleteMultiTarget` VALUES (3, 'cde');
INSERT INTO `deleteMultiTarget` VALUES (4, 'abc');
INSERT INTO `deleteMultiTarget` VALUES (5, 'abc');
INSERT INTO `deleteMultiTarget` VALUES (5, 'rty');
CREATE ROWSTORE TABLE `updateAllTypesSource` (
  `a` INT, 
  `boolColumn` BOOL,
  `booleanColumn` BOOLEAN,
  `bitColumn` BIT(64),
  `tinyintColumn` TINYINT,
  `mediumintColumn` MEDIUMINT,
  `smallintColumn` SMALLINT,
  `intColumn` INT,
  `integerColumn` INTEGER,
  `bigintColumn` BIGINT,
  `floatColumn` FLOAT,
  `doubleColumn` DOUBLE,
  `realColumn` REAL,
  `dateColumn` DATE,
  `timeColumn` TIME,
  `time6Column` TIME(6),
  `datetimeColumn` DATETIME,
  `datetime6Column` DATETIME(6),
  `timestampColumn` TIMESTAMP,
  `timestamp6Column` TIMESTAMP(6),
  `yearColumn` YEAR,
  `decimalColumn` DECIMAL(65, 30),
  `decColumn` DEC,
  `fixedColumn` FIXED,
  `numericColumn` NUMERIC,
  `charColumn` CHAR,
  `mediumtextColumn` MEDIUMTEXT,
  `binaryColumn` BINARY,
  `varcharColumn` VARCHAR(100),
  `varbinaryColumn` VARBINARY(100),
  `longtextColumn` LONGTEXT,
  `textColumn` TEXT,
  `tinytextColumn` TINYTEXT,
  `longblobColumn` LONGBLOB,
  `mediumblobColumn` MEDIUMBLOB,
  `blobColumn` BLOB,
  `tinyblobColumn` TINYBLOB,
  `jsonColumn` JSON,
  `geographyColumn` GEOGRAPHY,
  `geographypointColumn` GEOGRAPHYPOINT,
  PRIMARY KEY (`a`)
);
INSERT INTO `updateAllTypesSource` VALUES (
1,
true,
true,
'01234567',
127,
8388607,
32767,
2147483647,
2147483647,
9223372036854775807,
10.1,
100.1,
100.1,
'2000-10-10',
'10:10:10',
'10:10:10.555555',
'2000-10-10 10:10:10',
'2000-10-10 10:10:10.555555',
'2000-10-10 10:10:10',
'2000-10-10 10:10:10.555555',
2010,
10000.100001,
10000.100001,
10000.100001,
10000.100001,
'a',
'abc',
'a',
'abc',
'abc',
'abc',
'abc',
'abc',
'abc',
'abc',
'abc',
'abc',
'{}',
'POLYGON((1 1,2 1,2 2, 1 2, 1 1))',
'POINT(1.5 1.5)');
CREATE ROWSTORE TABLE `updateAllTypesTarget` (
  `a` INT, 
  `boolColumn` BOOL,
  `booleanColumn` BOOLEAN,
  `bitColumn` BIT(64),
  `tinyintColumn` TINYINT,
  `mediumintColumn` MEDIUMINT,
  `smallintColumn` SMALLINT,
  `intColumn` INT,
  `integerColumn` INTEGER,
  `bigintColumn` BIGINT,
  `floatColumn` FLOAT,
  `doubleColumn` DOUBLE,
  `realColumn` REAL,
  `dateColumn` DATE,
  `timeColumn` TIME,
  `time6Column` TIME(6),
  `datetimeColumn` DATETIME,
  `datetime6Column` DATETIME(6),
  `timestampColumn` TIMESTAMP,
  `timestamp6Column` TIMESTAMP(6),
  `yearColumn` YEAR,
  `decimalColumn` DECIMAL(65, 30),
  `decColumn` DEC,
  `fixedColumn` FIXED,
  `numericColumn` NUMERIC,
  `charColumn` CHAR,
  `mediumtextColumn` MEDIUMTEXT,
  `binaryColumn` BINARY,
  `varcharColumn` VARCHAR(100),
  `varbinaryColumn` VARBINARY(100),
  `longtextColumn` LONGTEXT,
  `textColumn` TEXT,\
  `tinytextColumn` TINYTEXT,
  `longblobColumn` LONGBLOB,
  `mediumblobColumn` MEDIUMBLOB,
  `blobColumn` BLOB,
  `tinyblobColumn` TINYBLOB,
  `jsonColumn` JSON,
  `geographyColumn` GEOGRAPHY,
  `geographypointColumn` GEOGRAPHYPOINT,
  PRIMARY KEY (`a`)
);

INSERT INTO `updateAllTypesTarget` VALUES (
1,
false,
false,
'76543210',
0,
0,
0,
0,
0,
0,
0,
0,
0,
'2000-01-01',
'01:01:01',
'01:01:01.000000',
'2000-01-01 01:01:01',
'2000-01-01 01:01:01.000000',
'2000-01-01 01:01:01',
'2000-01-01 01:01:01.000000',
2000,
0,
0,
0,
0,
'',
'',
'',
'',
'',
'',
'',
'',
'',
'',
'',
'',
'{}',
'POLYGON((0 0,2 1,2 2, 1 2, 0 0))',
'POINT(1 1)');
CREATE TABLE `updateIntegerSource` (a INT, b TEXT, PRIMARY KEY(a));
INSERT INTO `updateIntegerSource` VALUES (1, 'abcd');
INSERT INTO `updateIntegerSource` VALUES (2, 'cded');
INSERT INTO `updateIntegerSource` VALUES (5, 'abcd');
CREATE TABLE `updateIntegerTarget` (a INT, b TEXT, PRIMARY KEY(a));
INSERT INTO `updateIntegerTarget` VALUES (1, 'abc');
INSERT INTO `updateIntegerTarget` VALUES (2, 'cde');
INSERT INTO `updateIntegerTarget` VALUES (3, 'cde');
INSERT INTO `updateIntegerTarget` VALUES (4, 'abc');
INSERT INTO `updateIntegerTarget` VALUES (5, 'abc');
CREATE TABLE `updateStringSource` (a TEXT, b TEXT, PRIMARY KEY(a));
INSERT INTO `updateStringSource` VALUES ('1', 'abcd');
INSERT INTO `updateStringSource` VALUES ('2', 'cded');
INSERT INTO `updateStringSource` VALUES ('5', 'abcd');

CREATE TABLE `updateStringTarget` (a TEXT, b TEXT, PRIMARY KEY(a));
INSERT INTO `updateStringTarget` VALUES ('1', 'abc');
INSERT INTO `updateStringTarget` VALUES ('2', 'cde');
INSERT INTO `updateStringTarget` VALUES ('3', 'cde');
INSERT INTO `updateStringTarget` VALUES ('4', 'abc');
INSERT INTO `updateStringTarget` VALUES ('5', 'abc');
CREATE TABLE `updateFractionalSource` (a DECIMAL(20, 10), b TEXT, PRIMARY KEY(a));
INSERT INTO `updateFractionalSource` VALUES ('1.1', 'abcd');
INSERT INTO `updateFractionalSource` VALUES ('2.2', 'cded');
INSERT INTO `updateFractionalSource` VALUES ('5.5', 'abcd');

CREATE TABLE `updateFractionalTarget` (a DECIMAL(20, 10), b TEXT, PRIMARY KEY(a));
INSERT INTO `updateFractionalTarget` VALUES ('1.1', 'abc');
INSERT INTO `updateFractionalTarget` VALUES ('2.2', 'cde');
INSERT INTO `updateFractionalTarget` VALUES ('3.3', 'cde');
INSERT INTO `updateFractionalTarget` VALUES ('4.4', 'abc');
INSERT INTO `updateFractionalTarget` VALUES ('5.6', 'abc');
CREATE TABLE `updateTimeSource` (a DATETIME(6), b TEXT, PRIMARY KEY(a));
INSERT INTO `updateTimeSource` VALUES ('2000-01-01 00:00:00.1', 'abcd');
INSERT INTO `updateTimeSource` VALUES ('2000-01-01 00:00:00.2', 'cded');
INSERT INTO `updateTimeSource` VALUES ('2000-01-01 00:00:00.5', 'abcd');

CREATE TABLE `updateTimeTarget` (a DATETIME(6), b TEXT, PRIMARY KEY(a));
INSERT INTO `updateTimeTarget` VALUES ('2000-01-01 00:00:00.1', 'abc');
INSERT INTO `updateTimeTarget` VALUES ('2000-01-01 00:00:00.2', 'cde');
INSERT INTO `updateTimeTarget` VALUES ('2000-01-01 00:00:00.3', 'cde');
INSERT INTO `updateTimeTarget` VALUES ('2000-01-01 00:00:00.4', 'abc');
INSERT INTO `updateTimeTarget` VALUES ('2000-01-01 00:00:00.5', 'abc');
CREATE TABLE `updateBinarySource` (a BLOB, b TEXT, PRIMARY KEY(a));
INSERT INTO `updateBinarySource` VALUES ('1', 'abcd');
INSERT INTO `updateBinarySource` VALUES ('2', 'cded');
INSERT INTO `updateBinarySource` VALUES ('5', 'abcd');

CREATE TABLE `updateBinaryTarget` (a BLOB, b TEXT, PRIMARY KEY(a));
INSERT INTO `updateBinaryTarget` VALUES ('1', 'abc');
INSERT INTO `updateBinaryTarget` VALUES ('2', 'cde');
INSERT INTO `updateBinaryTarget` VALUES ('3', 'cde');
INSERT INTO `updateBinaryTarget` VALUES ('4', 'abc');
INSERT INTO `updateBinaryTarget` VALUES ('5', 'abc');
CREATE TABLE `updateMultiSource` (a INT, b TEXT, c TEXT, PRIMARY KEY(a, b));
INSERT INTO `updateMultiSource` VALUES (1, 'abc', 'abcd');
INSERT INTO `updateMultiSource` VALUES (2, 'cde', 'cded');
INSERT INTO `updateMultiSource` VALUES (5, 'abc', 'abcd');

CREATE TABLE `updateMultiTarget` (a INT, b TEXT, c TEXT, PRIMARY KEY(a, b));
INSERT INTO `updateMultiTarget` VALUES (1, 'abc', 'abc');
INSERT INTO `updateMultiTarget` VALUES (2, 'cde', 'cde');
INSERT INTO `updateMultiTarget` VALUES (3, 'cde', 'cde');
INSERT INTO `updateMultiTarget` VALUES (4, 'abc', 'abc');
INSERT INTO `updateMultiTarget` VALUES (5, 'abc', 'abc');
INSERT INTO `updateMultiTarget` VALUES (5, 'rty', 'rty');
CREATE TABLE `upsertSource` (a INT, b TEXT, PRIMARY KEY(a));
INSERT INTO `upsertSource` VALUES (1, 'abcd');
INSERT INTO `upsertSource` VALUES (2, 'cded');
INSERT INTO `upsertSource` VALUES (5, 'abcd');
INSERT INTO `upsertSource` VALUES (6, 'abcd');

CREATE TABLE `upsertTarget` (a INT, b TEXT, PRIMARY KEY(a));
INSERT INTO `upsertTarget` VALUES (1, 'abc');
INSERT INTO `upsertTarget` VALUES (2, 'cde');
INSERT INTO `upsertTarget` VALUES (3, 'cde');
INSERT INTO `upsertTarget` VALUES (4, 'abc');

CREATE DATABASE dbSearch;
CREATE TABLE `word`(a INT);
CREATE TABLE `wo%rd`(a INT);
CREATE TABLE `wo%%rd`(a INT);
CREATE TABLE `prefixwo%rd`(a INT);
CREATE TABLE `wo%rdsuffix`(a INT);
CREATE TABLE `prefixwo%rdsuffix`(a INT);
CREATE TABLE `randomName`(a INT);
