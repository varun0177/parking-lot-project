package services;

import com.project.parkinglotproject.dtos.TicketRequest;
import lombok.AllArgsConstructor;
import models.Ticket;
import org.springframework.stereotype.Service;
import repository.TicketReposotiry;
@Service
@AllArgsConstructor
public class TicketService {
private TicketReposotiry ticketReposotiry;
private ParkingSpotService parkingSpotService;
private VehicleService vehicleService;
public void addTicket(Ticket ticket){
    if(parkingSpotService.getParkingSpotRepository().checkAvailability(ticket.getVehicleType())) {
        ticketReposotiry.addTicket(ticket);
    }
}

}
