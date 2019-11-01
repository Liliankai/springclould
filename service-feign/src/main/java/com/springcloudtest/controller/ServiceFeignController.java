package com.springcloudtest.controller;

import com.springcloudtest.service.ServiceFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liliankai on 2019/10/31.
 */
@RestController
public class ServiceFeignController {

    @Autowired
    ServiceFeignService serviceFeignService;


    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return serviceFeignService.sayHiFromClientOne( name );
    }





}
