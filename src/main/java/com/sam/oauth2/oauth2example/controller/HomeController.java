package com.sam.oauth2.oauth2example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Hello, Sam!";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hello, Sam - Secured!";
    }
}
