package com.fc.chatservice.domain.chat.repository;

import com.fc.chatservice.domain.chat.model.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {

}