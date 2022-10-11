package com.irsan.javaexercise.service;

import com.irsan.javaexercise.model.TimeRequest;
import org.springframework.http.ResponseEntity;

public interface ConvertTimeService {
    ResponseEntity<?> getAllTime();

    ResponseEntity<?> setTime(TimeRequest timeRequest);
}
