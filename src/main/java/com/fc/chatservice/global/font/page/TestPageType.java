package com.fc.chatservice.global.font.page;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum TestPageType {

    INDEX("/test/index")
    ;
    private final String path;
}
