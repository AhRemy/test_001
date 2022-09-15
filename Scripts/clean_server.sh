#!/bin/sh

###백업 등의 작업이 필요한 경우 shell script 작성
##find /opt/codedeploy-agent/deployment-root/0819cead-1ac3-401c-be0c-7a57a5f92ae4/*-maxdepth 0 -type 'd' |grep -v $(stat -c '%Y:%n' /opt/codedeploy-agent/deployment-root/0819cead-1ac3-401c-be0c-7a57a5f92ae4/* | sort -t: -n | tail-1 | cut -d: -f2- | cut -c 3-) | xargs rm -rf
##sudo rm -rf /home/ec2-user/codedeploy/*