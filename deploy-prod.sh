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
docker run -m 256M -p 8443:8443 -p 8080:8080 --name handsup -d handsup:latest