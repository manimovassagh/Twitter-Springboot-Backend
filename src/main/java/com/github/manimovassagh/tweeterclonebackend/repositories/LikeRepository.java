package com.github.manimovassagh.tweeterclonebackend.repositories;

import com.github.manimovassagh.tweeterclonebackend.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    // Add custom query methods or repository operations here if needed
}
