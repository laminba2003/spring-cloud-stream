package com.spring.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.function.Consumer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

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
