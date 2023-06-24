package com.github.manimovassagh.tweeterclonebackend.repositories;

import com.github.manimovassagh.tweeterclonebackend.entities.RetweetLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetweetLikeRepository extends JpaRepository<RetweetLike,Long> {
}
