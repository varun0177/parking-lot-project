package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot {
    private int spot_Number;
    private VehicleType type;
    private SpotStatus status;

}
