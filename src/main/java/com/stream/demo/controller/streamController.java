package com.stream.demo.controller;

import com.stream.demo.service.sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class streamController {

    @Autowired
    sender sender;
    @PostMapping("/pub")
    public void pub(@RequestParam String message){
        sender.send(message);
    }

}
