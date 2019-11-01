package com.springcloudtest.service;

import com.springcloudtest.fallback.ServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liliankai on 2019/10/31.
 */
@FeignClient(value = "service-hi", fallback = ServiceHiHystrix.class)
public interface ServiceFeignService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
