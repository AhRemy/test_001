#!/bin/sh


# Current Date
DATE=`date +%Y%m%d_%H%M%S`

export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.312.b07-1.amzn2.0.2.x86_64
export JVM_ROUTE=codedeploy
export INST_NAME=$JVM_ROUTE
export LOG_HOME=/cp_log/$INST_NAME





