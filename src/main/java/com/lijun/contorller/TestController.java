package com.lijun.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: TODO
 * @Author jun.li
 * @Date 2020/1/16
 **/
@Controller
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "呵呵呵";
    }

    /*public static void main(String[] args){
        SpringApplication.run(HelloController.class,args);
    }*/
}
