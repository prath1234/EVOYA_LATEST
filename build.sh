#!/bin/bash
 read -p "please enter the tagname you wish to create: " TAG
 ROOT_DIR="/root/Project_Genom/EVOYA" #Project Root directory
 DOCKER_REPO="mavericsystems" #DOCKER REPO NAME ${DOCKER_REPO}
echo "############################################################################################"
echo "##########################    Building analysisservice    ##################################"
echo "############################################################################################"

cd ${ROOT_DIR}/analysisservice/analysisservice
mvn clean install
cp Dockerfile target/
docker build --build-arg JAR_FILE="analysisservice.jar" -t ${DOCKER_REPO}/analysisservice:v-${TAG} .
docker tag ${DOCKER_REPO}/analysisservice:v-${TAG} ${DOCKER_REPO}/analysisservice:latest
docker push ${DOCKER_REPO}/analysisservice:v-${TAG}
docker push ${DOCKER_REPO}/analysisservice:latest


echo "############################################################################################"
echo "##########################    Building configserver   ######################################"
echo "############################################################################################"
cd ${ROOT_DIR}/configserver/config-server
mvn clean install
cp Dockerfile target/
docker build --build-arg JAR_FILE="config-server-0.0.1-SNAPSHOT.jar" -t ${DOCKER_REPO}/configserver:v-${TAG}  .
docker tag ${DOCKER_REPO}/configserver:v-${TAG} ${DOCKER_REPO}/configserver:latest
docker push ${DOCKER_REPO}/configserver:v-${TAG}
docker push ${DOCKER_REPO}/configserver:latest


echo "############################################################################################"
echo "##########################    Building Searchservice   #####################################"
echo "############################################################################################"

cd ${ROOT_DIR}/searchservice/searchservice
mvn clean install
cp Dockerfile target/
docker build --build-arg JAR_FILE="searchservice-0.0.1-SNAPSHOT.jar" -t ${DOCKER_REPO}/searchservice:v-${TAG} .
docker tag ${DOCKER_REPO}/searchservice:v-${TAG} ${DOCKER_REPO}/searchservice:latest
docker push ${DOCKER_REPO}/searchservice:v-${TAG}
docker push ${DOCKER_REPO}/searchservice:latest

