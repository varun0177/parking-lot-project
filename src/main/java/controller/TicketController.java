package controller;

import com.project.parkinglotproject.dtos.TicketRequest;
import lombok.AllArgsConstructor;
import models.Ticket;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/parking-lot")
public class TicketController {
    private TicketRequest ticketRequest;
    @PostMapping("/api/v1/parking-lot/ticket")
    public Ticket createTicket(@RequestBody TicketRequest ticket){
        return null;
    }
    @GetMapping("/api/v1/parking-lot/number")
    public Ticket getTicket (@RequestBody String number){
        return null;
    }
}
