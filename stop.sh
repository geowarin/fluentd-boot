#!/usr/bin/env bash

docker-compose -f fluent-compose.yml kill
docker-compose kill
