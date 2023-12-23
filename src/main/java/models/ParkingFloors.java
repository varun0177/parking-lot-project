package models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class ParkingFloors {
    private int floorNumber;
    private List<ParkingSpot> parkingSpots=new ArrayList<>();

}
