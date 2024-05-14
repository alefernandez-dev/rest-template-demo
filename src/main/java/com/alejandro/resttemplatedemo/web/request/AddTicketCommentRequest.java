package com.alejandro.resttemplatedemo.web.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Getter
@NoArgsConstructor
public class AddTicketCommentRequest implements Serializable {

    private NewTicketComment ticket;

}
