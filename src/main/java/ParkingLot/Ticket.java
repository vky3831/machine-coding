package ParkingLot;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Ticket {
    private String ticketNumber;
    private long startTime;
    private long endTime;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;

    public static Ticket createTicket(Vehicle vehicle, ParkingSlot parkingSlot){
        return Ticket.builder()
                .parkingSlot(parkingSlot)
                .startTime(System.currentTimeMillis())
                .ticketNumber(vehicle.getVehicleNumber()+System.currentTimeMillis())
                .vehicle(vehicle)
                .build();
    }
}
