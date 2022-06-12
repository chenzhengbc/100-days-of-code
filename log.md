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

### Day 1: June 8, 2022
***Today's Progress***: Completed https://developer.confluent.io/learn-kafka/apache-kafka/events/
Able to run demo project no problem

### Day 2: June 9, 2022
***Today's Progress***: Completed https://developer.confluent.io/learn-kafka/apache-kafka/topics/
Learn about the concept of topics.
Created topic, created message


### Day 3: June 9, 2022
***Today's Progress***: Completed spring boot example
https://docs.confluent.io/platform/current/tutorials/examples/clients/docs/java-springboot.html?ajs_aid=22b33cfc-40b3-42fb-a59f-a3906d2f23a0&ajs_uid=676219
Checked the code and understood how it works
Created topic, created message


### Day 4: June 10, 2022
***Today's Progress***: Completed Topics video https://developer.confluent.io/learn-kafka/apache-kafka/topics/ 


### Day 5: June 11, 2022
***Today's Progress***: Completed Partition Video https://developer.confluent.io/learn-kafka/apache-kafka/partitions/
Also read about stream and how stream works - Kafka the definite guide, Chapter 11 - Stream Processing. 
Details note and questions will be documented tomorrow.

