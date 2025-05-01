package DTOs;

import model.ParkingLot;
import model.VehicleType;

public class TicketRequestDTO {
    String OwnerName;
    String LicenseNumber;
    String ContactNumber;
    VehicleType vehicleType;
    Long gateId;
    ParkingLot parkingLot;

    public String getOwnerName() {
        return OwnerName;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        LicenseNumber = licenseNumber;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
