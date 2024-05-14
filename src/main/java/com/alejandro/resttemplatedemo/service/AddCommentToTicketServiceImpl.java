package com.alejandro.resttemplatedemo.service;

import com.alejandro.resttemplatedemo.web.request.AddTicketCommentRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AddCommentToTicketServiceImpl implements AddCommentToTicketService{

    private final RestTemplate restTemplate;

    @Value("${base.tickets.url}")
    private String BASE_URL;

    public AddCommentToTicketServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void addComment(AddTicketCommentRequest addTicketComment, Integer ticketId) {
        restTemplate.put(BASE_URL + ticketId, addTicketComment);
    }
}
