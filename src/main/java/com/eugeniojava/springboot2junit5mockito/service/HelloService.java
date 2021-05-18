package com.eugeniojava.springboot2junit5mockito.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getWelcomeMessage() {
        return "Hello, world!";
    }
}
