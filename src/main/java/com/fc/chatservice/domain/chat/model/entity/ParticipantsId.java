package com.fc.chatservice.domain.chat.model.entity;

import com.fc.chatservice.domain.room.model.entity.Room;
import com.fc.chatservice.domain.user.model.entity.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ParticipantsId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

}
