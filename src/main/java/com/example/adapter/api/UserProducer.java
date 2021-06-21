package com.example.adapter.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProducer {

    @RequestMapping("/registryUser")
    public String registryUser(){
        return "registry user";
    }
}
