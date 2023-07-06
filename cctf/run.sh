#!/bin/bash
#set Java Home, JACOCO home & Source home
export JAVA_HOME=/home/amakarovych-ua/Tools/azule-openjdk/zulu8.50.0.51-ca-jdk8.0.275-linux_x64
export CCI_HOME=/home/amakarovych-ua/Informatica/IDP10.4.0_new/ict//..//cci//
export ADAPTER_HOME=/home/amakarovych-ua/eclipse-workspace4/SingleStore//cctf//connectors
export CAT_HOME=/home/amakarovych-ua/eclipse-workspace4/SingleStore//cctf//cat
export CCI_API_JARS=/home/amakarovych-ua/eclipse-workspace4/SingleStore//cctf
export ADAPTER_THIRDPARTY_LIBS=/home/amakarovych-ua/eclipse-workspace4/SingleStore//cctf

#export JACOCO_HOME=
#export SOURCE_HOME=
#export JAVA_HOME=
#export INFA_HADOOP_DIST_DIR=
#export HADOOP_HOME=
End()
{
	echo Ended
}

if [ -z "$JAVA_HOME" ]; 
then 
	noJavaHome
fi

if [ -z "$CCI_HOME" ];
then 
	noCCIHome
fi

if [ -z "$ADAPTER_HOME" ];
then 
	noAdapterHome
fi

if [ -z "$CAT_HOME" ];
then 
	noCATHome
fi

if [ -z "$ADAPTER_THIRDPARTY_LIBS" ];
then 
	noADAPTER_THIRDPARTY_LIBS
fi
generateTestCases()
{
	java -cp ${CCI_HOME}/jars/*:${CCI_HOME}/plugins/infa/*:${CCI_HOME}/plugins/osgi/*:${ADAPTER_HOME}/cci/plugins/*:./*:${CCI_API_JARS}/* com.informatica.ctf.testng.CTFTestRunner $1
	End
}
runSuite()
{	
	cutoutPart="runSuite "
	oldArgs=$*
	newArgs=${oldArgs#${cutoutPart}}
	java -cp ${CCI_HOME}/jars/*:${CCI_HOME}/plugins/infa/*:${CCI_HOME}/plugins/osgi/*:${ADAPTER_HOME}/cci/plugins/*:./*:${CCI_API_JARS}/* com.informatica.ctf.testng.CTFTestRunner ${newArgs}
	echo "View Results at ".$PWD/test-output/emailable-report.html
	End
}
runSuiteWithCoverage()
{
	if [ -z "$JACOCO_HOME" ];
	then 
		noJACOCO_HOME
	else
		if [ -z "$SOURCE_HOME" ];
		then 
			noSOURCE_HOME
		else
			rm -rf coverage
			rm -rf coveragebin
			set var = $1
			set var=${var:0:4}

			java -javaagent:${JACOCO_HOME}/lib/jacocoagent.jar=includes=*.runtime.adapter.*:*.connection.adapter.*:*.metadata.adapter.*,classdumpdir=coveragebin,append=false -cp ${CCI_HOME}/jars/*:${CCI_HOME}/plugins/infa/*:${CCI_HOME}/plugins/osgi/*:${ADAPTER_HOME}/cci/plugins/*:./*:${CCI_API_JARS}/* com.informatica.ctf.testng.CTFTestRunner ${CAT_HOME}/$1
			java -jar ${JACOCO_HOME}/lib/jacococli.jar report jacoco.exec --classfiles coveragebin --html coverage --sourcefiles=${SOURCE_HOME}/runtime.adapter/src --sourcefiles=${SOURCE_HOME}/connection.adapter/src --sourcefiles=${SOURCE_HOME}/metadata.adapter/src
			echo "View Results at ".$PWD/coverage/index.html
			echo "View Results at ".$PWD/test-output/emailable-report.html
		fi
	fi
	End
}
noJACOCO_HOME()
{
	echo JACOCO_HOME is not set. Set JACOCO_HOME to directory where JACOCO is present. Download JACOCO from "https://oss.sonatype.org/service/local/artifact/maven/redirect?r=snapshots&g=org.jacoco&a=jacoco&e=zip&v=LATEST"
}
noSOURCE_HOME()
{
	echo Please set your SOURCE_HOME till component source location in env.bat. "For e.g the source location for Netsuite V2 is like this: set SOURCE_HOME=C:\Users\svasu\Perforce\UTF_ICS\Mercury\cloud.r27\ML\components\adapters\app\NetsuiteSuitescript\source\usr"
}
noADAPTER_THIRDPARTY_LIBS()
{
	echo ADAPTER_THIRDPARTY_LIBS is not set. Set ADAPTER_THIRDPARTY_LIBS to directory where adapter thirdparty jars are present.
	End
}
noCATHome()
{
	echo CAT_HOME is not set. Set CAT_HOME to base directory CAT test.
	End
}
noCCIHome()
{
	echo CCI_HOME is not set. Set CCI_HOME to cci extracted folder.
	End
}
noJavaHome()
{
	echo JAVA_HOME is not set. Set JAVA_HOME to java installation folder.
	End
} 
noCCIApiJars()
{
	echo CCI_API_JARS is not set. Set CCI_API_JARS to folder where iface jars and other adapter related thirdaprty jars are present. Iface jar should not be placed under CCI_HOME or ADAPTER_HOME
}
noAdapterHome()
{
	echo ADAPTER_HOME is not set. Set ADAPTER_HOME to cci adapter home folder.
	End
}
CMDHelp()
{
	echo 
	echo "############################################################################"
	echo Command options: 
	echo 1. generateTestCases "Adapter ID"      
	echo    Usage:Fetches adapter attributes and generate configuration and suite file.
	echo 2. runSuite  "Suite File Name"                          
	echo    Usage:Runs testNG suite.
	echo 3. runSuiteWithCoverage  "Suite File Name"                          
	echo    Usage:Runs testNG suite and generates code coverage report
	echo Parameter Options - runSuite only :
	echo 1. [-tags="Unit name(s)"] {Separated by commas}
	echo	"Usage:Only runs the tests tagged with the same name \<dev, qa, build, p1\>" 
	echo 2. [-products="product name(s)"] {Separated by commas}
	echo 	Usage:Runs the tests in the context of the given product
	echo 3. [-runFailed]
	echo	Only the tests that failed previously will be run again
	echo "############################################################################"
	echo

	End
}
if [ "$1" == "generateTestCases" ];
then
	if [ "$2" == "" ];
	then
		echo Invalid Command, please provide a valid command argument
		echo "Adapter ID" is missing
		CMDHelp
	else
		generateTestCases $2
	fi

elif [ "$1" = "runSuite" ];
then 		
	if [ "$2" == "" ];
	then
		echo Invalid Command, please provide a valid command argument
		echo "Suite file Name" is missing
		CMDHelp
	else
		runSuite "$@"
	fi

elif [ "$1" == "runSuiteWithCoverage" ];
then 
	if [ "$2" == "" ];
	then
		echo Invalid Command, please provide a valid command argument
		echo "Suite file Name" is missing
		CMDHelp
	else
		runSuiteWithCoverage $2
	fi
else
	echo Invalid Command, please provide a valid command option
	CMDHelp
fi
