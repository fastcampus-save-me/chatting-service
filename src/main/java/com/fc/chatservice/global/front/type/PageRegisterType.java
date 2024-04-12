package com.fc.chatservice.global.front.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PageRegisterType {

    REGISTER("/page/register/register")

    ;

    private final String url;
}
