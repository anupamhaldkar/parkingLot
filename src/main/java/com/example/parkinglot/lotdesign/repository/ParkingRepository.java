package com.example.parkinglot.lotdesign.repository;

import com.example.parkinglot.lotdesign.model.VehicleDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<VehicleDTO, Long> {
}
