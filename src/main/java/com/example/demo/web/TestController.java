package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/a")
    @ResponseBody
    public String index(){
        return "Hello woasnacrld!";
    }
    @RequestMapping("a/b")
    @ResponseBody
    public String index1(){
        return "Hello world!";
    }
    @RequestMapping("b")
    @ResponseBody
    public String index2(){
        return "Hello b!";
    }
}
