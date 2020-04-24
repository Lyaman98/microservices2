package com.example.serviceconsumer;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("microservice-provider")
@RibbonClient("microservice-provider")
public interface ProviderServiceProxy {

    @GetMapping("/random-number")
    List<Integer> getNumbers();

}
