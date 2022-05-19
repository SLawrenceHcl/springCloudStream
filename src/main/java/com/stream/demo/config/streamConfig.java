package com.stream.demo.config;

import com.google.protobuf.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class streamConfig {
    @Bean
    public Function<String, String> middleMan(){
        return value -> value.toUpperCase();
    }

    @Bean
    public Function<String, String> publisher(){
        return message -> message;
    }

    @Bean
    public Consumer<String> subscriber(){
        return message -> System.out.println("message is : " + message);
    }

//    @Bean
//    public Supplier<String> pub2(String message){
//        return () -> message;
//    }

//    @Bean
//    public MessageChannel pubSubChannel(){
//        return new PublishSubscribeChannel();
//    }
}
