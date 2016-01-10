#!/usr/bin/env bash

docker-compose -f compose/fluentd/docker-compose.yml up -d
sleep 1
docker-compose -f compose/app/docker-compose.yml up -d
