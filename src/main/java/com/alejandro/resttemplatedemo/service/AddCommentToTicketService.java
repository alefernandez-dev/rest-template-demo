package com.alejandro.resttemplatedemo.service;

import com.alejandro.resttemplatedemo.web.request.AddTicketCommentRequest;

public interface AddCommentToTicketService {
    void addComment(AddTicketCommentRequest addTicketComment, Integer ticketId);
}
