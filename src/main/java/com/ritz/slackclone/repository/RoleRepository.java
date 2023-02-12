package com.ritz.slackclone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ritz.slackclone.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    public Role findByName(String name);
}
