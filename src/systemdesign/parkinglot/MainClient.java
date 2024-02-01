package src.systemdesign.parkinglot;

public class MainClient {

    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(2, 1, 2);
        Vehicle truck = new Vehicle(VehicleType.TRUCK);

        parkingLot.parkVehicle(truck);
    }
}
