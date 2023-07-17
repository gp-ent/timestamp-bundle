package org.entando.codemotion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public @ResponseBody Map<String, String> healthCheck() {
        return Map.of("status", "UP");
    }
}
