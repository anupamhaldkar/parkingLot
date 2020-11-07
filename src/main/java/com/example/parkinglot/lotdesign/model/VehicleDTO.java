package com.example.parkinglot.lotdesign.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
@Data
public class VehicleDTO {

    @Id
    private Long id;
    private String vehicleNumber;
    private String ownerNumber;

}
