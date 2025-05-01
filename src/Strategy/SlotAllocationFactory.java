package Strategy;

import model.SlotAllocationStrategyType;

public class SlotAllocationFactory {
    public static SlotAllocationStrategy getSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy){
        if(slotAllocationStrategy.equals(SlotAllocationStrategyType.RANDOM)){
            return new RandomAllocationSlotStrategy();
        }
        else{
            throw new RuntimeException("No such slot allocation strategy is found");
        }
    }
}
