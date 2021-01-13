package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainContoller {
    @RequestMapping("/")
    public String main() {
        return "Hello World";
    }
}
