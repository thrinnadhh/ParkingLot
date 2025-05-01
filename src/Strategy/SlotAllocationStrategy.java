package Strategy;

import model.ParkingLot;
import model.ParkingSlot;
import model.VehicleType;

public interface SlotAllocationStrategy {
    public ParkingSlot AllocationOfSlot(VehicleType vehicleType, ParkingLot parkingLot);

}
