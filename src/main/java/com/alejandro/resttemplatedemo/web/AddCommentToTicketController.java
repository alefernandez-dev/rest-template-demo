package com.alejandro.resttemplatedemo.web;

import com.alejandro.resttemplatedemo.service.AddCommentToTicketService;
import com.alejandro.resttemplatedemo.web.request.AddTicketCommentRequest;
import com.alejandro.resttemplatedemo.web.response.MessageResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class AddCommentToTicketController {

    private final AddCommentToTicketService addCommentToTicketService;

    public AddCommentToTicketController(AddCommentToTicketService addCommentToTicketService) {
        this.addCommentToTicketService = addCommentToTicketService;
    }

    @PostMapping("/{id}/comment")
    public ResponseEntity<MessageResponse> addComment(@RequestBody AddTicketCommentRequest addTicketComment, @PathVariable(name = "id") Integer ticketId) {
        addCommentToTicketService.addComment(addTicketComment, ticketId);
        return ResponseEntity.ok(MessageResponse.create("Comment added successfully"));
    }

}
