#!/bin/sh
#export VERSION;
#./mvnw clean
docker build -t e-school-service-user-mem:v0.0.1 -f ./Dockerfile .