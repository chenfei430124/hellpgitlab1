
package com.bzl.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@EnableAutoConfiguration
@Controller
public class HelloRobotController {
@RequestMapping(value = "/index", method = RequestMethod.GET)
public String index() {
        System.out.println("index is running...");
       return "welcome";
    }
}
