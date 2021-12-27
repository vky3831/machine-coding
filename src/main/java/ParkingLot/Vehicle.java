package ParkingLot;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public class Vehicle {

    String vehicleNumber;
    VehicleCategory vehicleCategory;
}
