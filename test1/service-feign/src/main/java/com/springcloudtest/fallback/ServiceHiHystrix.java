package com.springcloudtest.fallback;

import com.springcloudtest.service.ServiceFeignService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liliankai on 2019/11/1.
 */
@Component
public class ServiceHiHystrix implements ServiceFeignService{
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry" + name + "接口错误！";
    }
}
