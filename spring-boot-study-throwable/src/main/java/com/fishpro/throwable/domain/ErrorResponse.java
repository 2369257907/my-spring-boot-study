package com.fishpro.throwable.domain;

import java.util.List;


/**
 * @author 86171
 */
public class ErrorResponse {
    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }

    private String message;

    private List<String> details;

}
