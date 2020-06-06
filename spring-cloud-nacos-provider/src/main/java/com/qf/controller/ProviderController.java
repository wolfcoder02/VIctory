package com.qf.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @RequestMapping("/providerDemo")
    public String ProviderDemo() {
        return "Hello Nacos";
    }
}
