import Controller.TicketController;
import DTOs.TicketRequestDTO;
import DTOs.TicketResponseDTO;
import Repository.GateRepository;
import Repository.ParkingLotRepository;
import Repository.TicketRepository;
import Repository.VehicleRepository;
import Services.TicketService;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository(gateRepository);

        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        // Generate some pre data
        // Some gates, a parking lot, a parking, some parking slots
        Operator operator = new Operator("Akash", "NT155");
        Gate gateEntry1 =  new Gate("12A", GateType.ENTRY, GateStatus.OPEN, operator);
        Gate gateEntry2 =  new Gate("12B", GateType.ENTRY, GateStatus.OPEN, operator);
        Gate gateExit1 =  new Gate("13A", GateType.ENTRY, GateStatus.OPEN, operator);
        Gate gateExit2 =  new Gate("13B", GateType.ENTRY, GateStatus.OPEN, operator);

        ParkingLot parkingLot = new ParkingLot("Lodha Amara A");
        //Entry gates
        List<Gate> entrygates = new ArrayList<>();
        entrygates.add(gateEntry1);
        entrygates.add(gateEntry2);
        parkingLot.setEntryGates(entrygates);

        //Exit gates
        List<Gate> exitGates = new ArrayList<>();
        exitGates.add(gateExit1);
        exitGates.add(gateExit2);
        parkingLot.setExitGates(exitGates);

        //Allocation strategy type
        parkingLot.setSlotAllocationStrategy(SlotAllocationStrategyType.RANDOM);

//        parkingLot.setSupportedVehicleTypes(null);
        parkingLot.setId(1234123L);


        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setParkingFloorNumber(1);
        parkingFloor.setParkingFloorStatus(ParkingFloorStatus.Open);

        List<ParkingSlot> parkingSlots = new ArrayList<>();
        parkingSlots.add(new ParkingSlot(1, ParkingSlotStatus.FREE, new SupportedVehicle(VehicleType.SMALL_FOUR_WHEELER, 1)));
        parkingSlots.add(new ParkingSlot(2, ParkingSlotStatus.FREE, new SupportedVehicle(VehicleType.SMALL_FOUR_WHEELER, 1)));
        parkingSlots.add(new ParkingSlot(3, ParkingSlotStatus.FREE, new SupportedVehicle(VehicleType.LARGE_FOUR_WHEELER, 1)));
        parkingSlots.add(new ParkingSlot(4, ParkingSlotStatus.FREE, new SupportedVehicle(VehicleType.TWO_WHEELER, 1)));
        parkingFloor.setParkingSlots(parkingSlots);

        List<ParkingFloor> parkingFloorList = new ArrayList<>();
        parkingFloorList.add(parkingFloor);

        parkingLot.setParkingFloors(parkingFloorList);
        gateEntry1.setParkingLot(parkingLot);
        gateEntry2.setParkingLot(parkingLot);
        gateExit1.setParkingLot(parkingLot);
        gateExit2.setParkingLot(parkingLot);

        gateRepository.save(gateEntry1);
        gateRepository.save(gateEntry2);
        gateRepository.save(gateExit1);
        gateRepository.save(gateExit2);

        parkingLotRepository.save(parkingLot);

        TicketRequestDTO createTicketRequestDTO = new TicketRequestDTO();
        createTicketRequestDTO.setGateId(1L);
        createTicketRequestDTO.setLicenseNumber("1234");
        createTicketRequestDTO.setContactNumber("9884237700");
        createTicketRequestDTO.setOwnerName("Rahul");
        createTicketRequestDTO.setVehicleType(VehicleType.LARGE_FOUR_WHEELER);

        TicketResponseDTO createTicketResponseDTO = ticketController.createTicket(createTicketRequestDTO);
        TicketResponseDTO createTicketResponseDTO2 = ticketController.createTicket(createTicketRequestDTO);

        if(createTicketResponseDTO.equals(ResponseStatus.SUCCESS)){
            System.out.println("Ticket was successfully generated!");
            System.out.println("Ticket ID : " + createTicketResponseDTO.getTicketId());
        }else{
            System.out.println("Something went wrong : " + createTicketResponseDTO.getresponseMessage());
        }

        if(createTicketResponseDTO2.getResponseStatus().equals(ResponseStatus.SUCCESS)){
            System.out.println("Ticket was successfully generated!");
            System.out.println("Ticket ID : " + createTicketResponseDTO2.getTicketId());
        }else{
            System.out.println("Something went wrong : " + createTicketResponseDTO2.getresponseMessage());
        }



    }
}