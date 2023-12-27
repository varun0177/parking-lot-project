package com.project.parkinglotproject.dtos;

import lombok.Builder;
import lombok.Getter;
import models.TicketStatus;
import models.VehicleType;

import java.time.LocalDateTime;
@Getter
@Builder
public class TicketRequest {
    private String ticketId;
    private String vehicleId;
    private VehicleType vehicleType;
    private Integer floorNumber;
    private Integer slotNumber;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private TicketStatus status;
}
