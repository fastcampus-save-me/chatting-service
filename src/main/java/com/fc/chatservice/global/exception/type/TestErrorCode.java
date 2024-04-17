package com.fc.chatservice.global.exception.type;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum TestErrorCode implements ErrorCode{
    TEST_ERROR_CODE(HttpStatus.valueOf("400"), "테스트 목적입니다.")
    ;

    private final HttpStatus status;
    private final String errorMsg;

}
