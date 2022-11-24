package com.spring.training.messaging;

import com.spring.training.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
@Slf4j
public class Receiver {

    @Bean
    public Consumer<Message> consumer() {
        return message -> log.info("message received  : {} ", message);
    }

}