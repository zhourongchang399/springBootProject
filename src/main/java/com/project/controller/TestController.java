package com.project.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Target;

/**
 * Created by 49744 on 2021/7/17 14:58
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "测试接口")
    @GetMapping("/test")
    public String test(){
        return "succeed!";
    }

}
