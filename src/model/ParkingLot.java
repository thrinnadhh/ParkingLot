package model;

import Strategy.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseClass{
    String parkingName;
    List<ParkingFloor> parkingFloors;
    SlotAllocationStrategyType slotAllocationStrategyType;
    List<Gate> entryGates;
    List<Gate> exitGates;
    ParkingLotStatus parkingLotStatus;

    public ParkingLot(String parkingName){
        this.parkingName = parkingName;
    }

    public String getParkingNumber() {
        return parkingName;
    }

    public void setParkingNumber(Integer parkingNumber) {
        this.parkingName = parkingName;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public SlotAllocationStrategyType getSlotAllocationStrategyType() {
        return slotAllocationStrategyType;
    }

    public void setSlotAllocationStrategy(SlotAllocationStrategyType slotAllocationStrategyType) {
        this.slotAllocationStrategyType = slotAllocationStrategyType;
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
