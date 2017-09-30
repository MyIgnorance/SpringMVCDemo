package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DemoController {

    @RequestMapping(value = "/demo")
    public String demo(HttpServletRequest request, HttpServletResponse response) {
        return "demo";
    }

}
