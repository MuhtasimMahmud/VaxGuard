package com.project.vaxGuard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginSignUpController {


    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("userSignUp")
    public String signUp(){
        return "user/userSignUp";
    }

    @GetMapping("clinicSignUp")
    public String clinicSignUp(){
        return "vaccineGivingClinic/clinicSignUp";
    }


}
