package Strategy;

import model.SlotAllocationStrategyType;

public class SlotAllocationFactory {
    public static SlotAllocationStrategy getSlotAllocationStrategy(SlotAllocationStrategyType slotAllocationStrategyType){
        if(slotAllocationStrategyType.equals(SlotAllocationStrategyType.RANDOM)){
            return new RandomAllocationSlotStrategy();
        }
        else{
            throw new RuntimeException("No Slot Allocation Strategy Found");
        }
    }
}
