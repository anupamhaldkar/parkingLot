package com.example.parkinglot.lotdesign;

import com.example.parkinglot.lotdesign.model.VehicleDTO;
import com.example.parkinglot.lotdesign.repository.ParkingRepository;
import com.example.parkinglot.lotdesign.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceImpl implements ParkingService {

    @Autowired
    ParkingRepository parkingRepository;

    @Override
    public List<VehicleDTO> getAllVehicles() {
        return parkingRepository.findAll();
    }
}
