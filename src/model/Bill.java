package model;

import java.util.Date;
import java.util.List;

public class Bill {
    Integer billNumber;
    Ticket ticket;
    Date exitTime;
    Integer amount;
    Operator operator;
    Gate gate;
//    BillStatus status;
    List<Payment> payments;
}
