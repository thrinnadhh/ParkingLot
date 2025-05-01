package Controller;

import DTOs.TicketRequestDTO;
import DTOs.TicketResponseDTO;
import Services.TicketService;
import model.Ticket;

public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketResponseDTO createTicket(TicketRequestDTO ticketRequestDTO) {
        ticketService.createTicket(ticketRequestDTO.getOwnerName(),
                ticketRequestDTO.getContactNumber(),
                ticketRequestDTO.getLicenseNumber(),
                ticketRequestDTO.getVehicleType(),
                ticketRequestDTO.getGateId());
        return null;
    }
}
