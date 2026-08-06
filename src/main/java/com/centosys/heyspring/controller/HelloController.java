package com.centosys.heyspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Be alone, that is the secret of invention. Be alone, that is when ideas are born.";
    }
}
