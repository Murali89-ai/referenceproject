package com.wu.brwallet.customer.profile.model.response.registration;

import lombok.Data;

import java.util.List;

@Data
public class ErrorResponse {
    private String name;
    private String message;
    private String errorCode;
    private String priority;
    private String legacyError;
    private String correlationId;
    private List<Issue> issues;

    // Getters and setters
}
