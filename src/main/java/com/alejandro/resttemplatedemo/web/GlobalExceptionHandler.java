package com.alejandro.resttemplatedemo.web;

import com.alejandro.resttemplatedemo.web.response.MessageResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<MessageResponse> handleException(Exception e) {

        return ResponseEntity.internalServerError().body(MessageResponse.create("Error. " + e.getMessage()));

    }

}
