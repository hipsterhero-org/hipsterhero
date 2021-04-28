package com.example.histerhero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "<span style='font-size:100px;'>&#129305;</span>";
    }
}
