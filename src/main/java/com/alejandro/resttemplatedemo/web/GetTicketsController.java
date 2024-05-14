package com.alejandro.resttemplatedemo.web;

import com.alejandro.resttemplatedemo.web.response.TicketResponse;
import com.alejandro.resttemplatedemo.service.GetTicketsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tickets")
public class GetTicketsController {

    private final GetTicketsService getTicketsService;

    public GetTicketsController(GetTicketsService getTicketsService) {
        this.getTicketsService = getTicketsService;
    }

    @GetMapping
    public ResponseEntity<TicketResponse> getTickets() {
        return ResponseEntity.ok(getTicketsService.getTickets());
    }
}
