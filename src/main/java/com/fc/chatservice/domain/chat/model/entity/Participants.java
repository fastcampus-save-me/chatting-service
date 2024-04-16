package com.fc.chatservice.domain.chat.model.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Participants {
    @EmbeddedId
    private ParticipantsId id;
}
