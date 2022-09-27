#!/bin/sh

cd /home/ec2-user/codedeploy-test
sudo java -jar *.war >> /dev/null 2>&1 &


PID=`ps -ef | grep java | grep test-0.0.1 | awk '{print $2}'`
echo " +$PID"
