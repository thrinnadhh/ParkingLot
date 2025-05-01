package Repository;

import model.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    Map<Long, Gate> gateStore = new TreeMap<>();
    private Long KeyVal = 0L;
    public Gate save(Gate gate){
        gateStore.put(++KeyVal,gate);
        return gate;
    }
    public Optional<Gate> findGateByGateId(Long gateId){
        if(gateStore.containsKey(gateId)){
            return Optional.of(gateStore.get(gateId));
        }
        return Optional.empty();
    }
}
