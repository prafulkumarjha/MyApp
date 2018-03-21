package com.app.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Praful Jha on 18/03/2018
 */

@Controller

public class HomeController {

    @RequestMapping("/")
    public  String home() {
        return  "home";
    }





}
