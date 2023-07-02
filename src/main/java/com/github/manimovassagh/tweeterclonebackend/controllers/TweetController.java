package com.github.manimovassagh.tweeterclonebackend.controllers;

import com.github.manimovassagh.tweeterclonebackend.Response.ResponseCustom;
import com.github.manimovassagh.tweeterclonebackend.Response.Status;
import com.github.manimovassagh.tweeterclonebackend.entities.Test;
import com.github.manimovassagh.tweeterclonebackend.entities.Tweet;
import com.github.manimovassagh.tweeterclonebackend.entities.User;
import com.github.manimovassagh.tweeterclonebackend.repositories.TweetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
//@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class TweetController {

    @Autowired
    TweetRepository tweetRepository;
    Tweet tweet = new Tweet();

    User user = new User();


    @GetMapping("/hi")
    public ResponseCustom<Tweet> testController() {
        ResponseCustom<Tweet> responseCustom = new ResponseCustom<>();


        tweet.setContent("This is my first tweet test");
        tweet.setTimestamp(LocalDateTime.now());
        responseCustom.setEntity(tweet);
        responseCustom.setStatus("SUCCESS");
        tweetRepository.save(tweet);
        return responseCustom;

    }

    @PostMapping("/tweet")
    public ResponseCustom<Tweet> createTweet(@RequestBody Tweet tweet){
        ResponseCustom<Tweet> responseCustom=new ResponseCustom<>();
        tweet.setTimestamp(LocalDateTime.now());
        responseCustom.setStatus(String.valueOf(Status.SUCCESS));
        responseCustom.setEntity(tweetRepository.save(tweet));
        return responseCustom;

    }

}
