package com.standard.jwtexemple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home/")
public class TestController {

    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("text")
    public String text(@RequestBody String text) {
        return text;
    }
}
