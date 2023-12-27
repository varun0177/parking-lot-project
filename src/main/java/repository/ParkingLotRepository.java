package repository;

import com.project.parkinglotproject.dtos.ParkingLotRequest;
import lombok.Getter;
import models.ParkingLot;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class ParkingLotRepository {
    List<ParkingLot> parkingLot=new ArrayList<>();
    public void addParkingLot(ParkingLot request){
        parkingLot.add(request);
    }
    public void removeParkingLot(int id){
        for(int i=0;i<parkingLot.size();i++){
            if(parkingLot.get(i).getId()==id){
                parkingLot.remove(parkingLot.get(i));
            }
        }
    }

}
