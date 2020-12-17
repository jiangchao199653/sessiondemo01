package com.offcn.sessiondemo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {
    @RequestMapping("/set")
    public  String setSession(HttpSession session){
        session.setAttribute("msg","hellosession");

        return "success";
    }
    @RequestMapping("/get")
    public String getSession(HttpSession session){
        Object msg = session.getAttribute("msg");
        return (String)msg ;
    }

}
