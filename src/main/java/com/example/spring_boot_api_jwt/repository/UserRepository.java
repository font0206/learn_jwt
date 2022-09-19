package com.example.spring_boot_api_jwt.repository;

import com.example.spring_boot_api_jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
