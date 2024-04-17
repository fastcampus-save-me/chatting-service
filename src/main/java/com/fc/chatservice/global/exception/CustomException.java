package com.fc.chatservice.global.exception;

import com.fc.chatservice.global.exception.type.ErrorCode;
import org.springframework.web.client.HttpStatusCodeException;

public class CustomException extends HttpStatusCodeException {

    private final ErrorCode errorCode;

    public CustomException(ErrorCode errorCode) {
        super(errorCode.getStatus());
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorCode.getErrorMsg();
    }

}
