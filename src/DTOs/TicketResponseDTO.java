package DTOs;

import model.ResponseStatus;

public class TicketResponseDTO {
    Long ticketId;
    String responseMessage;
    ResponseStatus responseStatus;

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getresponseMessage() {
        return responseMessage;
    }

    public void setMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setStatus(ResponseStatus responseStatus) {
        responseStatus = responseStatus;
    }
}
