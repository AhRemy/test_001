#!/bin/sh

var1=$(ps -ef |grep java |grep test-0.0.1)
echo process info:${var1}

get_pid=$(echo ${var1} | cut -d " " -f2)

if [ -n ${get_pid} ]

then
        result1=$(sudo kill -9 ${get_pid})
        echo process is killed.
else
        echo running process not found.
fi