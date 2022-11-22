package com.spring.training;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class Runner implements CommandLineRunner {

    final Sender sender;

    @Override
    public void run(String... args) {
        log.info("sending message");
        Message message = new Message("laminba2003@gmail.com", "moussa@gmail.com", "this is a test");
        sender.send("consumer-in-0", message);
    }

}
