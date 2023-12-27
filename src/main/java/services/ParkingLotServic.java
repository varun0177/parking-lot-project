package services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.ParkingLotRepository;

@Service
@AllArgsConstructor
public class ParkingLotServic {
    private ParkingLotRepository parkingLotRepository;


}
