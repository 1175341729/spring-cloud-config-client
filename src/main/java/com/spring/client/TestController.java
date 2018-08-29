package com.spring.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *  @Author dengwei
 *  @Description: TODO
 *  @Date 2018/8/29 18:17
 */
@RestController
public class TestController {

    @Value("${name}")
    private String name;

    @RequestMapping("/test")
    public String test(){
        return name;
    }
}
