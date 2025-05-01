package model;

public class ParkingSlot extends BaseClass{
    Integer parkingSlotNumber;
    ParkingSlotStatus parkingSlotStatus;
    SupportedVehicle supportedVehicle;

    public Integer getParkingSlotNumber() {
        return parkingSlotNumber;
    }

    public void setParkingSlotNumber(Integer parkingSlotNumber) {
        this.parkingSlotNumber = parkingSlotNumber;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingLotStatus) {
        this.parkingSlotStatus = parkingLotStatus;
    }

    public SupportedVehicle getSupportedVehicle() {
        return supportedVehicle;
    }

    public void setSupportedVehicle(SupportedVehicle supportedVehicle) {
        this.supportedVehicle = supportedVehicle;
    }
}
