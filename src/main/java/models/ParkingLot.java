package models;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Builder
public class ParkingLot extends Model{
    private String name;
    private String address;
    private List<ParkingFloors> floors=new ArrayList<>();
    private List<EntryGate> entryGates=new ArrayList<>();
    private List<ExitGate> exitGates=new ArrayList<>();
}
