package com.irsan.javaexercise.controller;

import com.irsan.javaexercise.model.TimeRequest;
import com.irsan.javaexercise.service.ConvertTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ConvertTimeController {

    @Autowired
    public ConvertTimeService convertTimeService;

    @GetMapping("/getTime")
    public ResponseEntity<?> getAllTime() {
        return convertTimeService.getAllTime();
    }

    @PostMapping("/setTime")
    public ResponseEntity<?> setTime(@RequestBody TimeRequest timeRequest) {
        return convertTimeService.setTime(timeRequest);
    }

}
