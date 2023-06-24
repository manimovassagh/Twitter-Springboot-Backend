package com.github.manimovassagh.tweeterclonebackend.controllers;


import com.github.manimovassagh.tweeterclonebackend.Response.ResponseCustom;
import com.github.manimovassagh.tweeterclonebackend.entities.Tweet;
import com.github.manimovassagh.tweeterclonebackend.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1")
public class TweetController {

Tweet tweet=new Tweet();

User user = new User();



    @GetMapping("/hi")
    public ResponseCustom<Tweet> testController(){
        ResponseCustom<Tweet> responseCustom=new ResponseCustom<>();

        tweet.setTweetId(4L);
        user.setEmail("mani.mgh@gmail.com");
        user.setUserId(5L);
        user.setPassword("$2y$10$LJ7ocP5/L78l9mBgOaAqv.sywmda4inDE/95HYuCLMDZBdgUW7.uu");
       user.setUsername("mani.mgh");
        tweet.setContent("This is my first tweet test");
        tweet.setTimestamp(LocalDateTime.now());
        tweet.setUser(user);
        responseCustom.setEntity(tweet);
        responseCustom.setStatus("SUCCESS");
        return responseCustom;
    }
}
