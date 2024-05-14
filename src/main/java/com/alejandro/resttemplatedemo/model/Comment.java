package com.alejandro.resttemplatedemo.model;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

@Value
public class Comment implements Serializable {
    Long id;
    Long author_id;
    String body;
    LocalDateTime created_at;
    //Boolean isPublic;
    String type;
}
