package com.fc.chatservice.domain.room.model.entity;

import com.fc.chatservice.domain.chat.model.entity.Chat;
import com.fc.chatservice.domain.user.model.entity.User;
import com.fc.chatservice.global.model.CustomBaseTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;

@Entity
@Getter
public class Room extends CustomBaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String roomName;

    private String description;

    private String imageImg;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<User> userList;

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    private List<Chat> chatList;

}