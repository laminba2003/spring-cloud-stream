package com.spring.training.messaging;

import com.spring.training.model.Message;
import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Sender {

    final StreamBridge bridge;

    public void send(String destination, Message message) {
        bridge.send(destination, message);
    }

}
