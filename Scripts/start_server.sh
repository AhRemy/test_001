#!/bin/sh
cd /home/ec2-user/codedeploy-test
java -jar *.war >> /dev/null 2>&1 &
