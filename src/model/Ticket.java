package model;

import java.util.Date;

public class Ticket {
    private static Long TicketNumber = 0L;
    private Vehicle vehicle;
    private Date EntryTime;
    private Gate gate;
    private Operator operator;
    private ParkingSlot parkingSlot;

    public Ticket(Date EntryTime){
        this.EntryTime = EntryTime;
    }

    public Long getTicketNumber() {
        return TicketNumber++;
    }

    public void setTicketNumber(Long ticketNumber) {
        TicketNumber = ticketNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        vehicle = vehicle;
    }

    public Date getEntryTime() {
        return EntryTime;
    }

    public void setEntryTime(Date entryTime) {
        EntryTime = entryTime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
}
