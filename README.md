## spring-kafka

### Overview
Example Kafka Project using Spring Boot

### Prerequisites
* Setup Kafka

`get the WSL Ipv4 ip of your Windows machine using: "ipconfig"`

`Edit the kafka-config/docker-compose.yml file and configure :9092`

* Run Zookeeper and Kafka in Single Command

`docker compose -f ./kafka-config/docker-compose.yml up -d`

  (OR)

`docker-compose -f ./kafka-config/docker-compose.yml up -d`
* Make HTTP Requests to the endpoints

    `curl --location --request POST 'http://localhost:3500/users' \
  --header 'Content-Type: application/json' \
  --data-raw '{
  "name": "Juna",
  "mobile": "081234567890",
  "address": "Indonesia"
  }'`

### Credits
* [Spring Kafka](https://spring.io/projects/spring-kafka)
* [Docker Compose](https://docs.docker.com/compose/)
* [Kafka](https://kafka.apache.org/)
* [ivandjoh](https://instagram.com/ivandjoh)
* [Delvin](https://instagram.com/delvinrobertsetiawan)