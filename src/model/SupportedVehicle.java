package model;

public class SupportedVehicle {
    VehicleType vehicleType;
    Integer Capacity;
    SupportedVehicle supportedVehicle;
    public SupportedVehicle(VehicleType vehicleType, Integer capacity) {
        this.vehicleType = vehicleType;
        Capacity = capacity;
    }
}
