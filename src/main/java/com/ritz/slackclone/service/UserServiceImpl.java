package com.ritz.slackclone.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ritz.slackclone.entity.User;
import com.ritz.slackclone.exception.ResourceAlreadyExistsException;
import com.ritz.slackclone.exception.ResourceNotFoundException;
import com.ritz.slackclone.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> listAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {

        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found User with id '" + id + "'"));
    }

    @Override
    public User saveUser(User user) {
        userRepository.findByEmail(user.getEmail())
                .ifPresent(_user -> {
                    throw new ResourceAlreadyExistsException(
                            "User with email '" + _user.getEmail() + "' already exists");
                });
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub

    }

}
