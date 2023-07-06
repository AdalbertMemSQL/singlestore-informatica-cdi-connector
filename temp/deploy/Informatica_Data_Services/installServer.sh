set +v
# SingleStore connector - server install script

displayUsage()
{
echo 'Usage: installServer ^<infa_server_home^>  [^<upgrade^>] [^<skipregistration^>]';
echo 'infa_server_home  - this is the root directory for the the server installation.'
echo 'upgrade - this should be "true" if you want to re-install an connector else false.'
echo 'skipregistration - this option should be true if you wants to skip validateAndRegister command for connector installation else false.'
exit
}

errorInstall()
{
	echo "The Files were not properly copied"
	exit
}

incorrectDir()
{
	echo $INFA_HOME is not a valid directory
	displayUsage
}

incorrectUpgradeValue()
{
	echo Incorrect Usage. Valid values \for upgrade are "true" and "false"
	displayUsage
}

invalidOption()
{
	echo Incorrect Usage.  Valid values \for skip-register are "true" and "false"
	displayUsage
}

shopt -s nocasematch

if [[ "$1" = "" ]];
then 
	displayUsage
fi

if [[ "$1" = "help" ]];
then
	displayUsage
fi

export INFA_HOME=$1
if [ ! -e $INFA_HOME ];
then
	incorrectDir
fi

export UPGRADE=false
if [[ ! $2 == "" ]];
then
	UPGRADE=$2
fi

if [ ! -z "$UPGRADE" ] && [[ ! "$UPGRADE" == "true" ]] && [[ ! "$UPGRADE" == "false" ]];
then
	incorrectUpgradeValue
fi

rsync -qr --log-file=serverCopy.log "server" ${INFA_HOME} 
if [ ! "$?" -eq "0" ];
then
	errorInstall
fi

rsync -qr --log-file=serverCopy1.log "server/plugins/dynamic" "${INFA_HOME}/isp/bin/plugins/oie/eclipse/plugins"
if [ ! "$?" -eq "0" ];
then
	errorInstall
fi

export JAVA_HOME=${INFA_HOME}/java
export PATH=${INFA_HOME}/isp/bin:${JAVA_HOME}/bin:${PATH}

export SKIPREGISTER=false
if [ ! $3 == "" ];
then
	SKIPREGISTER=$3
	if [[ ! "$SKIPREGISTER" == "true" ]] && [[ ! "$SKIPREGISTER" == "false" ]];
	then
		invalidOption   
	fi
fi
if [[ ! "$SKIPREGISTER" == "true" ]];
then 
	infasetup validateAndRegisterFeature -ff "${INFA_HOME}/plugins/conf/${installParams.featureXml}" -up ${upgrade}
fi

shopt -u nocasematch

rm -rf "${INFA_HOME}/services/work_dir"
rm -rf "${INFA_HOME}/tomcat/bin/workspace/.metadata"
