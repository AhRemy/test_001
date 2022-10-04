#!/bin/sh
cd /home/ec2-user/codedeploy-test
java -jar *.war --spring.profiles.active=local >> /dev/null 2>&1 &
