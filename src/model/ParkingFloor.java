package model;

import java.util.List;

public class ParkingFloor extends BaseClass{
    Integer parkingFloorNumber;
    List<ParkingSlot> parkingSlots;
    List<SupportedVehicle> supportedVehicles;
    ParkingFloorStatus parkingFloorStatus;

    public Integer getParkingFloorNumber() {
        return parkingFloorNumber;
    }

    public void setParkingFloorNumber(Integer parkingFloorNumber) {
        this.parkingFloorNumber = parkingFloorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public List<SupportedVehicle> getSupportedVehicles() {
        return supportedVehicles;
    }

    public void setSupportedVehicles(List<SupportedVehicle> supportedVehicles) {
        this.supportedVehicles = supportedVehicles;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
