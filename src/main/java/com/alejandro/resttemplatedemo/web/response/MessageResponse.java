package com.alejandro.resttemplatedemo.web.response;

import lombok.Value;
import java.io.Serializable;

@Value
public class MessageResponse implements Serializable {

    String message;

    public static MessageResponse create(String message) {
        return new MessageResponse(message);
    }

}
