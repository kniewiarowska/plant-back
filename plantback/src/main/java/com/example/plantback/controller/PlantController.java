package com.example.plantback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantController {

    private String jwt;

    @GetMapping("/test")
    public String basicCall(){
        return "Hello word";
    }
}
