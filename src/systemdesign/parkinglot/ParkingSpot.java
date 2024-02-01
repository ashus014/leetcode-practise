package src.systemdesign.parkinglot;

public class ParkingSpot {

    private ParkingSpotType type;
    private Vehicle vehicle;
    private Boolean isParkingFree;

    public ParkingSpotType getType() {
        return type;
    }

    public void setType(ParkingSpotType type) {
        this.type = type;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Boolean getParkingFree() {
        return isParkingFree;
    }

    public void setParkingFree(Boolean parkingFree) {
        isParkingFree = parkingFree;
    }

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }
}
