package com.xebialabs.springboot.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/help")
    @ResponseBody
    String home() {
        String input = "Hello Spring Boot!!!!!";
        return input;
    }
}
