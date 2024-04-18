package com.fc.chatservice.domain.auth.repository;

import com.fc.chatservice.domain.auth.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}