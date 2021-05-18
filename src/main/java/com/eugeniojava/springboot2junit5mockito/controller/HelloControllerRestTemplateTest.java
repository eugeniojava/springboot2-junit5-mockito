package com.eugeniojava.springboot2junit5mockito.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerRestTemplateTest {

    @LocalServerPort
    private int port;

    private String url;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @BeforeEach
    public void setUp() {
        url = String.format("http://localhost:%d/", port);
    }

    @Test
    public void greetingShouldReturnDefaultMessage() {
        Assertions.assertThat(this.testRestTemplate.getForObject(url, String.class)).contains("Hello, world!");
    }
}
