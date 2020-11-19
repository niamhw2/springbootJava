package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FizzBuzzServiceTest {

    @Test
    public void fizzTest(){
        FizzBuzzService fizzBuzzService = new FizzBuzzService();

        assertEquals("Fizzbuzz", fizzBuzzService.validation(15));
        assertEquals("Fizzbuzz", fizzBuzzService.validation(30));
        assertEquals("Fizzbuzz", fizzBuzzService.validation(90000000));
    }

    @Test
    public void  fizzBuzzTest(){
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("Buzz", fizzBuzzService.validation(5));
        assertEquals("Buzz", fizzBuzzService.validation(30));
        assertEquals("Buzz", fizzBuzzService.validation(90000));
    }

    //TDD - red-green-blue
}
