package com.fc.chatservice.global.font.controller;

import com.fc.chatservice.global.font.page.TestPageType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String index(){
        return TestPageType.INDEX.getPath();
    }

}
