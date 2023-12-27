package repository;

import models.ParkingSpot;
import models.SpotStatus;
import models.VehicleType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository

public class ParkingSpotRepository {
List<ParkingSpot> parkingSpots=new ArrayList<>();
public boolean checkAvailability(VehicleType vehicleType){
    for(int i=0;i<parkingSpots.size();i++){
        if(parkingSpots.get(i).getType()==vehicleType && parkingSpots.get(i).getStatus()== SpotStatus.Available){
            return true;
        }
    }
    return false;
}




}
