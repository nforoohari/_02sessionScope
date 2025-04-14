package com.anisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "addToCart";
    }

//    @GetMapping("/cart")
//    public String cart() {
//        return "cart";
//    }
}
