package com.alejandro.resttemplatedemo.model;

import lombok.Value;
import java.io.Serializable;
import java.time.LocalDateTime;

@Value
public class Ticket implements Serializable {
    Long id;
    String external_id;
    LocalDateTime created_at;
    LocalDateTime updated_at;
    String type;
    String subject;
    String raw_subject;
    String description;
    String priority;
    String status;
    String recipient;
    Long requester_id;
    Long submitter_id;
    Long assignee_id;
    Long organization_id;
    Long group_id;
    Boolean has_accident;
    Boolean is_public;
    Long[] collaborator_ids;
    Long[] follower_ids;
    Long[] email_cc_ids;
    Long[] sharing_agreement_ids;
    String[] tags;
    Long[] followup_ids;
    Long ticket_form_id;
    Long brand_id;
    Boolean allow_channelback;
    Boolean allow_attachments;
}
