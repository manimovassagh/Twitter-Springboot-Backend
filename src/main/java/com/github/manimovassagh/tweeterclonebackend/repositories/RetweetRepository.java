package com.github.manimovassagh.tweeterclonebackend.repositories;



import com.github.manimovassagh.tweeterclonebackend.entities.Retweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetweetRepository extends JpaRepository<Retweet, Long> {
    // Add custom query methods or repository operations here if needed
}
