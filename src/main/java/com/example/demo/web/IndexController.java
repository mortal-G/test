package com.example.demo.web;

import com.example.demo.web.form.HelloForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("hi")
    @ResponseBody
    public String hello(){
        return "Hello mortal";
    }

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Hello world!";
    }

    @RequestMapping("form")
    @ResponseBody
    public String helloform(HelloForm helloForm){

        return "Hello world "+helloForm;
    }


    // 响应重定向，地址改变
    @RequestMapping("redirect")
    public String redirect(){
        return "redirect:hi";
    }

    // 请求转发，地址不变
    @RequestMapping("forward")
    public String forward(){
        return "forward:hi";
    }
}
