# 100 Days Of Code - Log

### Day 0: June 7, 2022

**Today's Progress**: Started 100 Days of Code chanllenge. Would like to use follow confluent site to explore and master Kafka over 90 days. 
The project scope is not known yet. 
https://developer.confluent.io/100-days-of-code/

- Finished #1 Cloud Setup
- Finished #1 local confluent application
- Finished #1 Docker Setup, topic creation, produce message and consumer message
```
docker exec broker \
kafka-topics --bootstrap-server broker:9092 \
             --create \
             --topic quickstart

docker exec --interactive --tty broker \
kafka-console-producer --bootstrap-server broker:9092 \
                       --topic quickstart

docker exec --interactive --tty broker \                                             master  ✭ ✱
kafka-console-consumer --bootstrap-server broker:9092 \
                       --topic quickstart \
                       --from-beginning             
```



**Thoughts:** I have been doing Kafka cources and readings for about two weeks. Really need to get my hands dirty by actually coding it.

**Link to work:** [Docker Compose](https://github.com/chenzhengbc/100-days-of-code/tree/master/docker)