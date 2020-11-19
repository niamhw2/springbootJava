package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

    public String validation(int i){
        if(i%15==0){
            return "Fizzbuzz";
        }

        if(i% 5==0){
            return "Buzz";
        }

        if(i%3==0) {
            return "Fizz";
        }

        return "" + i + "";
    }
}
