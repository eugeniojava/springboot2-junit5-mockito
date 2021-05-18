package com.eugeniojava.springboot2junit5mockito.controller;

import com.eugeniojava.springboot2junit5mockito.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String greeting() {
        return helloService.getWelcomeMessage();
    }
}
