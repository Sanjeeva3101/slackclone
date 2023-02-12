package com.ritz.slackclone.model;

import javax.validation.constraints.NotEmpty;

import com.ritz.slackclone.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterCredentials {

    @NotEmpty
    private String email;
    @NotEmpty(message = "username should not be blank or null")
    private String username;
    @NotEmpty
    private String password;

    public User toUser() {
        User user = new User();
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }

}
