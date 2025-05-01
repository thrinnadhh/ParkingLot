package Repository;

import model.Vehicle;
import model.VehicleType;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {
    Map<String, Vehicle>vehicleStore = new TreeMap<>();
    public Vehicle save(Vehicle vehicle){
        vehicleStore.put(vehicle.getLicenseNumber(),vehicle);
        return vehicle;
    }
    public Optional<Vehicle> findVehicleByLicenseNumber(String licenseNumber,
                                                         String ownerPhoneNumber,
                                                         String ownerName,
                                                         VehicleType vehicleType){
        if(vehicleStore.containsKey(licenseNumber)){
            return Optional.of(vehicleStore.get(licenseNumber));
        }
        return Optional.empty();
    }
}
