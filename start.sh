#!/usr/bin/env bash

docker-compose -f fluent-compose.yml up -d
sleep 1
docker-compose up -d
