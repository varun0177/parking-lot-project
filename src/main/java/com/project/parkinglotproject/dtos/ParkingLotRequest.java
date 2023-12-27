package com.project.parkinglotproject.dtos;

import lombok.Builder;
import lombok.Getter;
import models.EntryGate;
import models.ExitGate;
import models.Model;
import models.ParkingFloors;

import java.util.ArrayList;
import java.util.List;
@Builder
@Getter
public class ParkingLotRequest extends Model {
    private String name;
    private String address;
    private List<ParkingFloors> floors=new ArrayList<>();
    private List<EntryGate> entryGates=new ArrayList<>();
    private List<ExitGate> exitGates=new ArrayList<>();
}
