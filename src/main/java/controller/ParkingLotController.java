package controller;

import com.project.parkinglotproject.dtos.ParkingLotRequest;
import com.project.parkinglotproject.dtos.TicketRequest;
import lombok.AllArgsConstructor;
import models.ParkingLot;
import models.Ticket;
import org.springframework.web.bind.annotation.*;
import repository.ParkingLotRepository;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/parking-lot")
public class ParkingLotController {
    private ParkingLotRequest parkingLotRequest;
    @PostMapping("/api/v1/parking-lot/request")
    public ParkingLot createParkingLot(@RequestBody ParkingLotRequest request){
        return null;
    }
    @GetMapping("/api/v1/parking-lot/id")
    public ParkingLot getParkingLot(@RequestBody long id){
        return null;
    }

}
