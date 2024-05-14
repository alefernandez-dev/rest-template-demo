package com.alejandro.resttemplatedemo.service;

import com.alejandro.resttemplatedemo.web.response.CommentResponse;


public interface GetCommentByTicketService {
    CommentResponse getComment(Integer ticketId);
}
