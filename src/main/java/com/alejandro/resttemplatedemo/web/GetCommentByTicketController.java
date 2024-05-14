package com.alejandro.resttemplatedemo.web;

import com.alejandro.resttemplatedemo.web.response.CommentResponse;
import com.alejandro.resttemplatedemo.service.GetCommentByTicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class GetCommentByTicketController {

    private final GetCommentByTicketService getCommentOfTicketService;

    public GetCommentByTicketController(GetCommentByTicketService getCommentOfTicketService) {
        this.getCommentOfTicketService = getCommentOfTicketService;
    }

    @GetMapping("{id}/comments")
    public ResponseEntity<CommentResponse> getComments(@PathVariable(name = "id") Integer ticketId) {
        return ResponseEntity.ok(getCommentOfTicketService.getComment(ticketId));
    }

}
