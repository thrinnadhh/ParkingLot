package Repository;

import model.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    Long KeyValue = 0L;
    Map<Long, Ticket> ticketStore = new TreeMap<>();
    public Ticket save(Ticket ticket){
        ticketStore.put(++KeyValue,ticket);
        return ticketStore.get(KeyValue);
    }
}
