package Services;

import Repository.GateRepository;
import Repository.ParkingLotRepository;
import Repository.TicketRepository;
import Repository.VehicleRepository;
import Strategy.SlotAllocationStrategy;
import model.*;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    ParkingLotRepository parkingLotRepository;
    TicketRepository ticketRepository;
    public TicketService(GateRepository gateRepository,VehicleRepository vehicleRepository,ParkingLotRepository parkingLotRepository,TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(String ownerName, String contactNumber, String licenseNumber, VehicleType vehicleType, Long gateId) {
//private static Long TicketNumber = 0L;
//    private Vehicle vehicle;
//    private Date EntryTime;
//    private Gate gate;
//    private Operator operator;
//    private ParkingSlot parkingSlot;
//        Intitializing the ticket
        Gate gate;
        Vehicle vehicle;
        ParkingLot parkingLot;
        Ticket ticket = new Ticket(new Date());

//       Setting the gate
        Optional<Gate> optionalGate = gateRepository.findGateByGateId(gateId);
        if(optionalGate.isPresent()){
            gate = optionalGate.get();
            ticket.setGate(gate);
        }else{
            throw new RuntimeException("Gate not found");
        }
//        Setting the Operator
        ticket.setOperator(gate.getOperator());
//        Setting the Vehicle
        Optional<Vehicle> optionalVehicle = vehicleRepository.findVehicleByLicenseNumber(ownerName,contactNumber,licenseNumber,vehicleType);
        if(optionalVehicle.isPresent()){
            vehicle = optionalVehicle.get();
            ticket.setVehicle(vehicle);
        }else{
            throw new RuntimeException("Vehicle not found");
        }
//        Setting up the parkingslot
        parkingLot = gate.getParkingLot();
        SlotAllocationStrategy slotAllocationStrategy = parkingLot.getSlotAllocationStrategy();
        ticket.setParkingSlot(slotAllocationStrategy.AllocationOfSlot(vehicleType,parkingLot));
        return ticketRepository.save(ticket);
    }
}
