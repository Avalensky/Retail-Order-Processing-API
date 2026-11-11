package com.retail.orderprocessingapi.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(
            IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleException(
            IllegalArgumentException ex) {

        Map<String, String> error =
                new HashMap<>();

        error.put("message",
                ex.getMessage());

        return error;
    }
}
