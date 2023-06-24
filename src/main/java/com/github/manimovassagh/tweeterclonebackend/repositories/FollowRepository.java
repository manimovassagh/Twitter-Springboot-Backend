package com.github.manimovassagh.tweeterclonebackend.repositories;

import com.github.manimovassagh.tweeterclonebackend.entities.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FollowRepository extends JpaRepository<Follow, Long> {
    // Add custom query methods or repository operations here if needed
}
