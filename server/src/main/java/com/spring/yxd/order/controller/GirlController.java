package com.spring.yxd.order.controller;

import com.spring.yxd.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨贤达
 * @date 2018/6/30 11:17
 */
@RestController
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/girl/print")
    public String print() {
        return "name: " + girlConfig.getAge() + " age: " + girlConfig.getAge();
    }
}
