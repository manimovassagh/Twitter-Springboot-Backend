package com.github.manimovassagh.tweeterclonebackend.repositories;

import com.github.manimovassagh.tweeterclonebackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom query methods or repository operations here if needed
}
