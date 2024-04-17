package com.fc.chatservice.domain.auth.model.entity;

import com.fc.chatservice.domain.auth.model.entity.type.Authority;
import com.fc.chatservice.domain.chat.model.entity.Chat;
import com.fc.chatservice.domain.room.model.entity.Room;
import com.fc.chatservice.global.model.entity.CustomBaseTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
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
public class User extends CustomBaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String email;

    private String profileImg;

    @Enumerated
    private Authority authority;

    @Column(nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Room> roomList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Chat> chat;
}
