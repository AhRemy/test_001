#!/bin/sh


# Current Date
DATE=`date +%Y%m%d_%H%M%S`

export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.312.b07-1.amzn2.0.2.x86_64
export JVM_ROUTE=codedeploy
export INST_NAME=$JVM_ROUTE
export LOG_HOME=/cp_log/$INST_NAME


if [ ! -d "$LOG_HOME/ndump" ]; then
    mkdir -p $LOG_HOME/nohup
fi

if [ -f $LOG_HOME/nohup/$INST_NAME.out ]; then
    mv $LOG_HOME/nohup/$INST_NAME.out $LOG_HOME/nohup/$INST_NAME.$DATE
fi

export CATALINA_OUT=$LOG_HOME/nohup/$INST_NAME.out

cd /home/ec2-user/codedeploy-test
sudo java -jar *.jar >> /dev/null 2>&1 &
sudo java -jar *.war >> /dev/null 2>&1 &


PID=`ps -ef | grep java | grep test-0.0.1 | awk '{print $2}'`
echo " +$PID"
