package Controller;

import DTOs.TicketRequestDTO;
import Services.TicketService;
import model.Ticket;

public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketRequestDTO createTicket(TicketRequestDTO ticketRequestDTO) {
        ticketService.createTicket(ticketRequestDTO.getOwnerName(),
                ticketRequestDTO.getContactNumber(),
                ticketRequestDTO.getLicenseNumber(),
                ticketRequestDTO.getVehicleType(),
                ticketRequestDTO.getGateId());
        return null;
    }
}
