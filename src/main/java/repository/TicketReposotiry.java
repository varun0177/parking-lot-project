package repository;

import models.Ticket;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketReposotiry {
  List<Ticket> tickets=new ArrayList<>();
  public void addTicket(Ticket ticket){
      tickets.add(ticket);
  }
  public void deleteTicket(String ticketId){
      for(int i=0;i<tickets.size();i++){
          if(tickets.get(i).getTicketId()==ticketId){
              tickets.remove(tickets.get(i));
          }
      }
  }

}
