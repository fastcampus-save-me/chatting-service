package com.fc.chatservice.domain.chat.model.entity;

import com.fc.chatservice.domain.chat.model.entity.type.MessageType;
import com.fc.chatservice.domain.room.model.entity.Room;
import com.fc.chatservice.domain.auth.model.entity.User;
import com.fc.chatservice.global.model.entity.CustomBaseTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Builder
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Chat extends CustomBaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Room room;

    @Enumerated
    private MessageType messageType;

    @Column(nullable = false)
    private String message;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
