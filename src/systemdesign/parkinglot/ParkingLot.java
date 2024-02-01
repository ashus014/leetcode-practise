package src.systemdesign.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    List<CompactSpot> compactSpotsList = new ArrayList<>();
    List<LargeSpot> largeSpotList = new ArrayList<>();
    List<BikeSpot> bikeSpotList = new ArrayList<>();

    int freeCompactSpots;
    int freeLargeSpots;
    int freeBikeSpots;

    public ParkingLot(int freeCompactSpots, int freeLargeSpots, int freeBikeSpots) {
        this.freeCompactSpots = freeCompactSpots;
        this.freeLargeSpots = freeLargeSpots;
        this.freeBikeSpots = freeBikeSpots;
    }

    // Park Vehicle
    public void parkVehicle(Vehicle vehicle) {
        System.out.println("We are about to park your vehicle of type " + vehicle.getVehicleType());

        if(vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
            if(freeLargeSpots > 0) {
                parkYourLargeVehicle(vehicle);
            } else {
                System.out.println("Sorry all Large spots are full");
            }
        } else if(vehicle.getVehicleType().equals(VehicleType.CAR)) {
            if(freeCompactSpots > 0) {
                parkYourCompactVehicle(vehicle);
            } else if(freeLargeSpots > 0) {
                parkYourLargeVehicle(vehicle);
            } else {
                System.out.println("Sorry neither Large nor Compact spots are available");
            }
        } else if(vehicle.getVehicleType().equals(VehicleType.BIKE)) {
            if(freeBikeSpots > 0) {
                parkYourBikeVehicle(vehicle);
            } else if(freeCompactSpots > 0) {
                parkYourCompactVehicle(vehicle);
            } else if(freeLargeSpots > 0) {
                parkYourLargeVehicle(vehicle);
            } else {
                System.out.println("Sorry no space available");
            }
        }
    }

    private void parkYourLargeVehicle(Vehicle vehicle) {
        LargeSpot largeSpot = new LargeSpot(ParkingSpotType.LARGE);
        largeSpot.setParkingFree(false);
        largeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(largeSpot);

        largeSpotList.add(largeSpot);
        System.out.println("We have successfully parked your " + vehicle.getVehicleType() + " Vehicle.");
        freeLargeSpots -= 1;
    }

    private void parkYourCompactVehicle(Vehicle vehicle) {
        CompactSpot compactSpot = new CompactSpot(ParkingSpotType.COMPACT);
        compactSpot.setParkingFree(false);
        compactSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(compactSpot);

        compactSpotsList.add(compactSpot);
        System.out.println("We have successfully parked your " + vehicle.getVehicleType() + " Vehicle.");
        freeCompactSpots -= 1;
    }

    private void parkYourBikeVehicle(Vehicle vehicle) {
        BikeSpot bikeSpot = new BikeSpot(ParkingSpotType.BIKE);
        bikeSpot.setParkingFree(false);
        bikeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(bikeSpot);

        bikeSpotList.add(bikeSpot);
        System.out.println("We have successfully parked your " + vehicle.getVehicleType() + " Vehicle.");
        freeBikeSpots -= 1;
    }

    // Unpark Vehicle
    public void unParkVehicle(Vehicle vehicle) {
        System.out.println("We are about to Unpark or remove your Vehicle of type " + vehicle.getVehicleType());
        ParkingSpot parkingSpot = vehicle.getParkingSpot();
        parkingSpot.setParkingFree(true);

        if(vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
            if(largeSpotList.remove(vehicle)) {
                System.out.println("We have successfully removed your Vehicle");
                freeLargeSpots += 1;
            } else {
                System.out.println("You don't have your vehicle parked at this parking lot");
            }
        } else if(vehicle.getVehicleType().equals(VehicleType.CAR)) {
            if(compactSpotsList.remove(vehicle)) {
                System.out.println("We have successfully removed your Vehicle");
                freeCompactSpots += 1;
            } else {
                System.out.println("You don't have your vehicle parked at this parking lot");
            }
        } else if(vehicle.getVehicleType().equals(VehicleType.BIKE)) {
            if(bikeSpotList.remove(vehicle)) {
                System.out.println("We have successfully removed your Vehicle");
                freeBikeSpots += 1;
            } else {
                System.out.println("You don't have your vehicle parked at this parking lot");
            }
        }
    }
}
