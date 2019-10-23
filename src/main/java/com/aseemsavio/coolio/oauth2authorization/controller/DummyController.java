package com.aseemsavio.coolio.oauth2authorization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
