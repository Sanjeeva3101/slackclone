package com.ritz.slackclone.exception.base;

import lombok.Data;

@Data
public class ApiSubError {
    String field;
    String message;

    public ApiSubError(String field, String message){
        this.field = field;
        this.message = message;
    }



}
