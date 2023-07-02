package com.github.manimovassagh.tweeterclonebackend.controllers;


import com.github.manimovassagh.tweeterclonebackend.Response.ResponseCustom;
import com.github.manimovassagh.tweeterclonebackend.Response.Status;
import com.github.manimovassagh.tweeterclonebackend.entities.Test;
import com.github.manimovassagh.tweeterclonebackend.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @Autowired
    TestRepository testRepository;


    @PostMapping("/test")
    public ResponseCustom<Test> createTest(@RequestBody Test test){
        ResponseCustom<Test> responseCustom=new ResponseCustom<>();
        responseCustom.setStatus(String.valueOf(Status.SUCCESS));
        responseCustom.setEntity(testRepository.save(test));
        //this is just for learning
      //  testRepository.findById(3L).orElseThrow(()->new RuntimeException("This is my custom runtime"));

        return responseCustom;

    }
}
