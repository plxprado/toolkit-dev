package com.prado.tools.toolkitdev.reactive.handler;

import com.prado.tools.toolkitdev.reactive.handler.message.ErrorMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ErrorMessage handleException(IllegalArgumentException illegalArgumentException) {
        return new ErrorMessage("Invalid request " ,  illegalArgumentException.getMessage());
    }
}
