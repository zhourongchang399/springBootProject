package com.project.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Target;

/**
 * Created by 49744 on 2021/7/17 14:58
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "测试接口")
    @GetMapping("/test")
    public String testGet(){
        return "succeed!";
    }

    @ApiOperation(value = "测试接口")
    @PostMapping("/test")
    public String testPost(@RequestBody String msg){
        return msg;
    }


}
