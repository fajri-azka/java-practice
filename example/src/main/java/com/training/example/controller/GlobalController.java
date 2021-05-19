package com.training.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/global")
public class GlobalController {

    @GetMapping("/access")
    public String testAccess()
    {
        return "THIS IS TESTING API";
    }
}
