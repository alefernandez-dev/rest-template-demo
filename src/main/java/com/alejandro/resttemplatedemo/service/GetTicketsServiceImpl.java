package com.alejandro.resttemplatedemo.service;

import com.alejandro.resttemplatedemo.web.response.TicketResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetTicketsServiceImpl implements GetTicketsService {

    private final RestTemplate restTemplate;

    @Value("${base.tickets.url}")
    private String BASE_URL;

    public GetTicketsServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public TicketResponse getTickets() {
        return restTemplate.getForObject(BASE_URL, TicketResponse.class);
    }
}
