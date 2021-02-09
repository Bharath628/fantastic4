package com.fantastic4.antimatter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemonController {

    @GetMapping("/1")
    public String getMyName(){
        return "Bharath";
    }
}
