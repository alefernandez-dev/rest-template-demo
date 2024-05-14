package com.alejandro.resttemplatedemo.web.response;

import com.alejandro.resttemplatedemo.model.Comment;
import lombok.Value;
import java.io.Serializable;
import java.util.List;

@Value
public class CommentResponse implements Serializable {
    List<Comment> comments;
    String nextPage;
    String previousPage;
    Integer count;
}
