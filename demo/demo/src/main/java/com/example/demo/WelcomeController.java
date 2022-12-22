package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    String welcome;
    @GetMapping("/welcome")
    public String welcome(){
        return "Hello world!!!, this my first app in Spring Boot";
    }
}

