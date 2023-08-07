package org.entando.timestamp.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HealthCheckController {

    @GetMapping("/health")
    public @ResponseBody Map<String, String> healthCheck() {
        return Map.of("status", "UP");
    }
}
