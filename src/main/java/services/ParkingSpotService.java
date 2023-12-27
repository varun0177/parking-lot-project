package services;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;
import repository.ParkingSpotRepository;
@Service
@Getter
@AllArgsConstructor
public class ParkingSpotService {
    private ParkingSpotRepository parkingSpotRepository;
}
