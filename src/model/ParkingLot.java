package model;

import Strategy.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseClass{
    Integer parkingNumber;
    List<ParkingFloor> parkingFloors;
    SlotAllocationStrategy slotAllocationStrategy;
    List<Gate> entryGates;
    List<Gate> exitGates;
    ParkingLotStatus parkingLotStatus;

    public ParkingLot(Integer parkingNumber, List<ParkingFloor> parkingFloors, SlotAllocationStrategy slotAllocationStrategy, List<Gate> entryGates, List<Gate> exitGates, ParkingLotStatus parkingLotStatus) {
        this.parkingNumber = parkingNumber;
        this.parkingFloors = parkingFloors;
        this.slotAllocationStrategy = slotAllocationStrategy;
        this.entryGates = entryGates;
        this.exitGates = exitGates;
        this.parkingLotStatus = parkingLotStatus;
    }

    public Integer getParkingNumber() {
        return parkingNumber;
    }

    public void setParkingNumber(Integer parkingNumber) {
        this.parkingNumber = parkingNumber;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public SlotAllocationStrategy getSlotAllocationStrategy() {
        return slotAllocationStrategy;
    }

    public void setSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}
