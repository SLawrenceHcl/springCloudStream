package com.stream.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.config.EnablePublisher;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.function.Supplier;

@Service
public class sender{


//    @Autowired
//    MessageChannel pubSubChannel;

    @Autowired
    StreamBridge streamBridge;

    public void send(String message){
        streamBridge.send("publisher-in-0", message);
        //pubSubChannel.send(MessageBuilder.withPayload(message).build());
    }

}
