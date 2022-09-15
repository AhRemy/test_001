#!/bin/sh

###백업 등의 작업이 필요한 경우 shell script 작성

##find /opt/codedeploy-agent/deployment-root/e1ade26c-b23a-45e7-ac5f-62da2681bd31/*-maxdepth 0 -type 'd' |grep -v $(stat -c '%Y:%n' /opt/codedeploy-agent/deployment-root/e1ade26c-b23a-45e7-ac5f-62da2681bd31/* | sort -t: -n | tail-1 | cut -d: -f2- | cut -c 3-) | xargs rm -rf
##sudo rm -rf /home/ec2-user/codedeploy/*