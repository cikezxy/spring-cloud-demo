package com.james.spring.cloud.clienta.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${config.name}")
    private String name;

    @GetMapping("/name")
    public String getName() {
        return name;
    }

}
