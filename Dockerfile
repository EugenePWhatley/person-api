FROM alpine:latest

RUN apk update \
  && apk upgrade \
  && apk add --no-cache --update openjdk8-jre-base

COPY ./build/libs/person-api-0.1.0.jar /opt/


CMD java -jar /opt/person-api-0.1.0.jar
