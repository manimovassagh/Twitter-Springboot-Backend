package com.github.manimovassagh.tweeterclonebackend.repositories;

import com.github.manimovassagh.tweeterclonebackend.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    // Add custom query methods or repository operations here if needed
}
