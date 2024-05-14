package com.alejandro.resttemplatedemo.service;

import com.alejandro.resttemplatedemo.web.response.CommentResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetCommentByTicketServiceImpl implements GetCommentByTicketService {

    private final RestTemplate restTemplate;

    @Value("${base.tickets.url}")
    private String BASE_URL;

    public GetCommentByTicketServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public CommentResponse getComment(Integer ticketId) {
        return restTemplate.getForObject(BASE_URL + ticketId + "/comments", CommentResponse.class);
    }
}
