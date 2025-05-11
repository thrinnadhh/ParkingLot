package Strategy;

import model.*;

public class RandomAllocationSlotStrategy implements SlotAllocationStrategy {

    public ParkingSlot AllocationOfSlot(VehicleType vehicleType, ParkingLot parkingLot) {
        // Implementation of random allocation of slot strategy
        // This method should contain the logic to randomly allocate a parking slot
        // based on the vehicle type and the available slots in the parking lot.
        for(ParkingFloor parkingFloor:parkingLot.getParkingFloors()){
            if(parkingFloor.getParkingFloorStatus().equals(ParkingFloorStatus.Filled)) {
                throw new RuntimeException("Parking Floor is filled try another floor");
            }
            for(ParkingSlot parkingSlot: parkingFloor.getParkingSlots()){
                if(parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.FREE) && (parkingSlot.getSupportedVehicle().equals(vehicleType))){
                    parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FILLED);
                    return parkingSlot;
                }
            }

        }
        throw new RuntimeException("No Slot left ,parking slots are filled");
    }

}
