package com.example.demo.controller.health;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class HealthController {

    @RequestMapping("/health")
    public String checkAPI() {
        return "<h1>The API is working ok!</h1>";
    }
}