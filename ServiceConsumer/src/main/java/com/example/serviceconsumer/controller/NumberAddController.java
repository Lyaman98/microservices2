package com.example.serviceconsumer.controller;

import com.example.serviceconsumer.ProviderServiceProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class NumberAddController {

    private static final Logger logger = LoggerFactory.getLogger(NumberAddController.class);
    private String serviceUrl;
    @Autowired
    ProviderServiceProxy providerServiceProxy;


    @GetMapping("/sum")
    public Long getSum(){

//        ResponseEntity<Integer[]> responseEntity =
//                new RestTemplate().getForEntity(serviceUrl,Integer[].class);
//        Integer [] array = responseEntity.getBody();

        //with feign
        List<Integer> array = providerServiceProxy.getNumbers();
        long sum = 0;
        assert array != null;
        for (Integer integer : array) {
            sum += integer;
        }
        logger.warn("Returning : " + sum);
        return sum;

    }

}
