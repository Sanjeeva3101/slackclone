package com.ritz.slackclone.repository;

import org.springframework.data.repository.CrudRepository;

import com.ritz.slackclone.entity.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    public Optional<User> findByEmail(String email);
}
