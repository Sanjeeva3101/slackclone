package com.ritz.slackclone.model;

import com.ritz.slackclone.entity.User;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginCredentials {

    private String email;
    private String password;

    public User toUser() {
        return new User(this.email, this.password);
    }

}