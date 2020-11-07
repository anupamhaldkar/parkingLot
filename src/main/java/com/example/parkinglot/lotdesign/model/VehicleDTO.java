package com.example.parkinglot.lotdesign.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class VehicleDTO {
    @Id
    private Long id;
    private String vehicleNumber;
    private String ownerNumber;

}
