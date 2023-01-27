package com.ritz.slackclone.service;

import com.ritz.slackclone.entity.User;

public interface UserService {
    
    Iterable<User> listAllUsers();

    User getUserById(Long id);

    User saveUser(User user);

    void deleteUser(Long id);
}
