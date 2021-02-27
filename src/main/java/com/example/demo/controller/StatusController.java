package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    public String check()
    {
        return "online";
    }
}
