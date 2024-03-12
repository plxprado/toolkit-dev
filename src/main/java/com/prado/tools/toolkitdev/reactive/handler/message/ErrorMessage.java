package com.prado.tools.toolkitdev.reactive.handler.message;

import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class ErrorMessage {
    private final String message;
    private final String details;
}
