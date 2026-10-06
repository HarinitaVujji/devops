package com.mycompany.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "DevSecOps application is running!";
    } 
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from DevSecOps application!";
    }
}
