package com.example.adapter.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserProducerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private UserProducer controller;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void registry_user_test(){
        assertThat(this.controller).isNotNull();
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/registryUser",
                String.class)).contains("registry user");
    }
}
