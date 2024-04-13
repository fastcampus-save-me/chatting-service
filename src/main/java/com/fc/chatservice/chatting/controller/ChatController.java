package com.fc.chatservice.chatting.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ChatController {

    @MessageMapping("/{roomId}")
    public void testChat(@DestinationVariable String roomId) {
      log.info(roomId);
    }

    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }

}
