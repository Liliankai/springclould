package com.springclouldtest.controller;

import com.springclouldtest.service.ServiceRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liliankai on 2019/10/31.
 */
@RestController
public class ServiceRibbonController {

    @Autowired
    ServiceRibbonService serviceRibbonService;

    @GetMapping(value = "/hi", produces = "application/json;charset=UTF-8")
    public String hi(@RequestParam(value = "name", required = false, defaultValue = "llk") String name) {
        return serviceRibbonService.hiService( name );
    }

}
