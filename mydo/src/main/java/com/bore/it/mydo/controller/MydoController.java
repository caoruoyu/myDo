package com.bore.it.mydo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RestController
public class MydoController {

    @RequestMapping(path = "/hello", method = {RequestMethod.POST})
    public String hello() {
        log.info("/hello test is successed!!!!!");
        return "Hello Spring Boot!";
    }
}