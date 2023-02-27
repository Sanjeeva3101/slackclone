package com.ritz.slackclone.exception.base;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
public class ApiError {

    private HttpStatus status;
    private String message;
    @JsonInclude(value = Include.NON_NULL)
    private List<ApiSubError> errors = null;

    public ApiError(HttpStatus status, String message, List<ApiSubError> errors) {
        super();
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public ApiError(HttpStatus status, String message) {
        super();
        this.status = status;
        this.message = message;
    }

}
