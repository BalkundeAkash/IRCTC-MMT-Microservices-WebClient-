package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Train;

public interface MMTService {

    List<Train> fetchFromIRCTC(String src, String dest, String date);

}
