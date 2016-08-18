package com.krosengren.forsale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    @ResponseBody
    public String displayWelcomePage() {
        return "Welcome!";
    }
}
