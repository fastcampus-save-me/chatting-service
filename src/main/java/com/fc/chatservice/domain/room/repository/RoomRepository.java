package com.fc.chatservice.domain.room.repository;

import com.fc.chatservice.domain.room.model.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

}