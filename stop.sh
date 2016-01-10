#!/usr/bin/env bash

docker-compose -f compose/app/docker-compose.yml kill
docker-compose -f compose/fluentd/docker-compose.yml kill
