package com.mavrick.exception;

import java.io.Serializable;

public class ErrorResponse implements Serializable {
    
    private String message;

    public ErrorResponse(String message) {
        this.message = message;
    }
}
