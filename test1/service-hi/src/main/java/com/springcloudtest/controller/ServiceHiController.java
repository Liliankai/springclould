package com.springcloudtest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liliankai on 2019/10/31.
 */
@RestController
public class ServiceHiController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String home(@RequestParam(value = "name", defaultValue = "llk") String name) {
        return name + "，您好！我的端口是:" + port;
    }
}
