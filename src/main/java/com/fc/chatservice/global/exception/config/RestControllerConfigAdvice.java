package com.fc.chatservice.global.exception.config;

import com.fc.chatservice.global.exception.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class RestControllerConfigAdvice {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity handleCustomException(CustomException e) {
        log.warn(e.getErrorMsg());
        return ResponseEntity.status(e.getStatusCode()).body(e.getErrorMsg());
    }

}
