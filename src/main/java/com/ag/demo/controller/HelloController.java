package com.ag.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path = "/greeting")
    public String getGrreting() {
        return "Hello Welcome to Spring Boot Demo Application";
    }
}
