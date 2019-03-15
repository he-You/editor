package com.example.editor.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by heyou on 2019/3/15 0015
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "editor";
    }
}
