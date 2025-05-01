package Repository;

import model.Gate;
import model.ParkingLot;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {
    Map<Long , ParkingLot> parkingLotStore = new TreeMap<>();
    GateRepository gateRepository;
    public ParkingLotRepository(GateRepository gateRepository){
        this.gateRepository = gateRepository;
    }
    private Long keyVal = 0L;
    public ParkingLot save(ParkingLot parkingLot){
        parkingLot.setId(++keyVal);
        parkingLotStore.put(parkingLot.getId(), parkingLot);
        return parkingLot;
    }
    public Optional<ParkingLot> findParkingLotByGateId(Long gateId){
        for(ParkingLot parkingLot:parkingLotStore.values()){
            for(Gate gate :parkingLot.getEntryGates()){
                if(gate.getId().equals(gateId)){
                    return Optional.of(parkingLot);
                }
            }
        }
        return null;
    }
}
