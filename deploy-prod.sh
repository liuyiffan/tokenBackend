#!/bin/bash

# Git pull the latest source code
git checkout master
git pull origin master:master

# Maven build the source code to JAR
mvn clean install -Dmaven.test.skip=true

# Build and run image to Container locally
docker build --tag handsup:latest .
docker stop handsup
docker rm handsup
docker run -m 256M -p 8001:8001 --expose=8001 --name handsup -d handsup:latest