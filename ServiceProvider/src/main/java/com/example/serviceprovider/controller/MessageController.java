package com.example.serviceprovider.controller;

import com.example.serviceprovider.config.ApplicationContextConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final static Logger logger = LoggerFactory.getLogger(MessageController.class);
    @Autowired
    ApplicationContextConfig applicationContextConfig;

    @GetMapping("/message")
    public String getMessage(){
        logger.info("here");
        return applicationContextConfig.getMessage();
    }
}
