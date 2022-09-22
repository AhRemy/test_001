#!/bin/sh
. ./env.sh

if [ ! -d "$LOG_HOME/ndump" ]; then
    mkdir -p $LOG_HOME/nohup
fi

if [ -f $LOG_HOME/nohup/$INST_NAME.out ]; then
    mv $LOG_HOME/nohup/$INST_NAME.out $LOG_HOME/nohup/$INST_NAME.$DATE
fi

export CATALINA_OUT=$LOG_HOME/nohup/$INST_NAME.out

cd /home/ec2-user/codedeploy-test
sudo java -jar *.jar >> /dev/null 2>&1 &


PID=`ps -ef | grep java | grep test-0.0.1 | awk '{print $2}'`
echo " +$PID"
