package com.ritz.slackclone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ritz.slackclone.entity.Privilege;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {
    public Privilege findByName(String name);
}
