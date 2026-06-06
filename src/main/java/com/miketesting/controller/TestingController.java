package com.miketesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Springboot - Devops Automation using Jenkins-Docker-K8";
    }
}
