package ParkingLot;

import java.util.List;
import java.util.Map;

public class ParkingLot {
    private String nameOfParkingLot;
    private Address address;
    private List<ParkingFloor> parkingFloors;
    private static ParkingLot parkingLot=null;

    private ParkingLot(String nameOfParkingLot, Address address, List<ParkingFloor> parkingFloors) {
        this.nameOfParkingLot = nameOfParkingLot;
        this.address = address;
        this.parkingFloors = parkingFloors;
    }

    public static ParkingLot getInstance(String nameOfParkingLot, Address address, List<ParkingFloor> parkingFloors){
        if(parkingLot == null){
            parkingLot = new ParkingLot(nameOfParkingLot, address, parkingFloors);
        }

        return parkingLot;
    }

    public void addFloor(String name, Map<ParkingSlotType, Map<String, ParkingSlot>> parkSlots){
        ParkingFloor parkingFloor = new ParkingFloor(name, parkSlots);
        parkingFloors.add(parkingFloor);
    }

    public void removeFloor(ParkingFloor parkingFloor){
        parkingFloors.remove(parkingFloor);
    }

    public Ticket assignTicket(Vehicle vehicle){
        ParkingSlot parkingSlot = getParkingSlotFoeVehicleAndPark(vehicle);
        if(parkingSlot == null) return null;
        Ticket parkingTicket = createTicketForSlot(parkingSlot, vehicle);

        return parkingTicket;
    }

    private Ticket createTicketForSlot(ParkingSlot parkingSlot, Vehicle vehicle){
        return Ticket.createTicket(vehicle, parkingSlot);
    }

    public double scanAndPay(Ticket ticket){
        long endTime = System.currentTimeMillis();
        ticket.getParkingSlot().removeVehicle(ticket.getVehicle());
        int duration = (int) (endTime - ticket.getStartTime())/1000;
        double price = ticket.getParkingSlot().getParkingSlotType().getPriceForParking(duration);

        return price;
    }


    private ParkingSlot getParkingSlotFoeVehicleAndPark(Vehicle vehicle){
        ParkingSlot slot = null;
        for(ParkingFloor floor: parkingFloors){
            slot = floor.getRelevantSlotForVehicleAndPark(vehicle);
            if(slot != null) break;
        }
        return slot;
    }



}
