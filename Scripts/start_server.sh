#!/bin/sh

cd /home/ec2-user/codedeploy-test
#sudo java -jar *.war >> /dev/null 2>&1 &
sudo java -jar *.jar >> /dev/null 2>&1 &
