package com.eugeniojava.springboot2junit5mockito.controller;

import com.eugeniojava.springboot2junit5mockito.service.HelloService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HelloControllerMockitoTest {

    @Mock
    private HelloService helloService;

    @InjectMocks
    private HelloController helloController;

    @BeforeEach
    void setMockOutput() {
        when(helloService.getWelcomeMessage()).thenReturn("Hello, Mockito test");
    }

    @Test
    public void shouldReturnDefaultMessage() {
        String response = helloController.greeting();
        Assertions.assertThat(response).isEqualTo("Hello, Mockito test");
    }
}
