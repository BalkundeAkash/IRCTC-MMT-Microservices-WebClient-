package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Train;
import com.example.demo.service.MMTService;

@RestController
@RequestMapping("/mmt")
@CrossOrigin(origins = "*")   // allow UI to call API
public class MMTController {

    @Autowired
    private MMTService mmtService;

    // UI will call this API
    @GetMapping("/trains")
    public List<Train> searchTrains(@RequestParam String src,
                                    @RequestParam String dest,
                                    @RequestParam String date) {

        return mmtService.fetchFromIRCTC(src, dest, date);
    }
}
