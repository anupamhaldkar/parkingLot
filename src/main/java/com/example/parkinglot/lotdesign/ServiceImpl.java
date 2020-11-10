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

    @Override
    public String park(VehicleDTO vehicleDTO) {
        if(vehicleDTO.getId() >0 && vehicleDTO.getId() < 11) {
            parkingRepository.save(vehicleDTO);
        }
        else {
            throw new RuntimeException("Kindly provide id between 1 to 10");
        }
        return "Parked";
    }
}
