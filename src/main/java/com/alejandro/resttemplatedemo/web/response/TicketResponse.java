package com.alejandro.resttemplatedemo.web.response;

import com.alejandro.resttemplatedemo.model.Ticket;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

@Value
public class TicketResponse implements Serializable {
    List<Ticket> tickets;
    String nextPage;
    String previousPage;
    Integer count;
}
