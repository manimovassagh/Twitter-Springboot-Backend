package com.github.manimovassagh.tweeterclonebackend.Response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCustom <T>{

    public String status;
    public T entity;

}
