package com.example.springpostgreclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Data {

    @GetMapping(value = "/data")
    public String data(){
        return "hallo";
    }
}
