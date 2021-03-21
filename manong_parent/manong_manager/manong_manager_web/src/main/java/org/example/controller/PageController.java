package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    @RequestMapping("/{page}")
    public String requestPage(@PathVariable String page) {
        System.out.println("进入" + page);
        return page;
    }

    @RequestMapping("/")
    public String requestIndex() {
        return "index";
    }
}
