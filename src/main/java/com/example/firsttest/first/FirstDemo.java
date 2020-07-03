package com.example.firsttest.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxianfeng
 * @Description
 * @date 2020-06-17 18:20
 * @Version V1.0
 */
@RestController
public class FirstDemo {
    @GetMapping("hello")
    public String hello(){
        return "hello springboot";
    }
}
