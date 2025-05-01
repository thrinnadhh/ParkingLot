package model;

public class Gate extends BaseClass{
    String GateNumber;
    GateType gateType;
    GateStatus gateStatus;
    Operator operator;
    ParkingLot parkingLot;

    public Gate(String gateNumber, GateType gateType, GateStatus gateStatus, Operator operator) {
        GateNumber = gateNumber;
        this.gateType = gateType;
        this.gateStatus = gateStatus;
        this.operator = operator;
    }

    public String getGateNumber() {
        return GateNumber;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void setGateNumber(String gateNumber) {
        GateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
