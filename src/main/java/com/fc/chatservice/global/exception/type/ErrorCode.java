package com.fc.chatservice.global.exception.type;

import org.springframework.http.HttpStatus;

public interface ErrorCode {

    HttpStatus getStatus();
    String getErrorMsg();

}
