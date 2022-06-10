package io.confluent.examples.clients.cloud.springboot.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HelloBean {
    HelloBean(@Value("${helloMessage}") String helloMessage) {
        log.info(helloMessage);
    }

}
