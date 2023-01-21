package com.example.ss_2022_c5_e1.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String demo() {
        var name = SecurityContextHolder.getContext().getAuthentication().getName();
        return "Hello " + name;
    }
}
