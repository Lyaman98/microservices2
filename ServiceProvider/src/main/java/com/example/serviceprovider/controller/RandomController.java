package com.example.serviceprovider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RandomController {

    private static Logger logger = LoggerFactory.getLogger(RandomController.class);
    @GetMapping("/random-number")
    public List<Integer> getRandomNumbers(){

        List<Integer> randomNumb = new ArrayList<>();

        for (int i = 0; i <= 5; i++){
            randomNumb.add(generateRandomNumber());
        }
        logger.warn("Returning values " , randomNumb);
        return randomNumb;
    }

    private int generateRandomNumber(){
        return (int)(Math.random()*1000);
    }
}
