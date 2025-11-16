package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Train;
import com.example.demo.service.IRCTCService;

@RestController
@RequestMapping("/irctc")
public class IRCTCController {

    @Autowired
    private IRCTCService irctcService;

    // ✅ Get all IRCTC trains
    @GetMapping("/trains")
    public List<Train> getAllTrains() {
        return irctcService.getAll();
    }

    // ✅ Add new train to IRCTC DB
    @PostMapping("/train")
    public ResponseEntity<Train> add(@RequestBody Train train) {
        Train saved = irctcService.addTrain(train);
        return ResponseEntity.ok(saved);
    }
}
