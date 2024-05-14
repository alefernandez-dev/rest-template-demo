package com.alejandro.resttemplatedemo.web.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Getter
@NoArgsConstructor
public class NewTicketComment implements Serializable{

    private TicketComment comment;

    @Getter
    @NoArgsConstructor
    private static class TicketComment implements Serializable {

        private String body;
        private Long author_id;

    }

}
