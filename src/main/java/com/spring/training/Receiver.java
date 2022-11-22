package com.spring.training;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
@Slf4j
public class Receiver {

    @Bean
    public Consumer<Message> consumer() {
        return message -> {
            System.out.println("message received...");
            System.out.println("message from "+message.getFrom());
            System.out.println("message to "+message.getTo());
            System.out.println("message content "+message.getContent());
        };
    }

}