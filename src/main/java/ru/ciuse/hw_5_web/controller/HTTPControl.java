package ru.ciuse.hw_5_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/site")
public class HTTPControl {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}
