package com.example.parkinglot.lotdesign.model;

import javax.persistence.Id;

public class VehicleDTO {
    @Id
    private Long id;
    private String vehicleNumber;
    private String ownerNumber;
}
