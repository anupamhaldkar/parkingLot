package com.example.parkinglot.lotdesign.controller;

import com.example.parkinglot.lotdesign.model.VehicleDTO;
import com.example.parkinglot.lotdesign.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parkinglot")
public class ParkingLotController {
    @Autowired
    ParkingService parkingService;

    @GetMapping("/parkinginfo")
    public List<VehicleDTO> getAllVehicles(){
        return parkingService.getAllVehicles();
    }
}
