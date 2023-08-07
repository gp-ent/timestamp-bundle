package org.entando.timestamp.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TimeStampController {

    @GetMapping("/timestamp")
    public @ResponseBody Map<String, String> timestamp() {
        return Map.of("timestamp", new Date().toString());
    }
}