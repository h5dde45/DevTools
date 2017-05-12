package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondaryController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
