package com.irsan.javaexercise.service;

import com.irsan.javaexercise.entity.ConvertTimeEntity;
import com.irsan.javaexercise.model.TimeRequest;
import com.irsan.javaexercise.repository.ConvertTimeRepository;
import com.irsan.javaexercise.util.Helpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ConvertTimeServiceImpl implements ConvertTimeService {

    @Autowired
    private ConvertTimeRepository convertTimeRepository;

    @Override
    public ResponseEntity<?> getAllTime() {
        List<ConvertTimeEntity> timeEntityList = convertTimeRepository.findAll();
        Map<Long, String> mapTime = new HashMap<>();
        for (ConvertTimeEntity time : timeEntityList) {
            mapTime.put(time.getEpoch(), Helpers.epochToDatetime(time.getEpoch()));
        }
        long epochNow = Helpers.getEpochNow();
        mapTime.put(epochNow, Helpers.getDatetimeNow(epochNow));
        return ResponseEntity.ok().body(mapTime);
    }

    @Override
    public ResponseEntity<?> setTime(TimeRequest timeRequest) {
        String message = "";
        try {
            ConvertTimeEntity convertTime = ConvertTimeEntity.builder()
                    .epoch(Helpers.datetimeToEpoch(timeRequest.getDatetime()))
                    .build();
            convertTimeRepository.save(convertTime);
            message = "Epoch telah ditambahkan";
        } catch (Exception e) {
            message = e.getMessage();
        }

        return ResponseEntity.ok().body(Helpers.response(message));
    }
}
