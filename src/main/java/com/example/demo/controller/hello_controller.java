package com.example.demo.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class hello_controller {

    @GetMapping("/")
    public String hello() {
        return "Hello, Docker from Spring Boot!";
    }

}
