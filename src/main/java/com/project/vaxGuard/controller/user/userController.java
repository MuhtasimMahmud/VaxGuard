package com.project.vaxGuard.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {

    @GetMapping("userHome")
    public String userHome(){
        return "user/userDashboard";
    }

    @GetMapping("patientSignUp")
    public String signUp(){
        return "user/patientSignUp";
    }


    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("/userProfileOVerView")
    public String profileOverViewTab(){
        return "user/profileOverview";
    }

    @GetMapping("/userProfile")
    public String userProfileTab(){
        return "user/profile";
    }

    @GetMapping("/userEmail")
    public String emailTab(){
        return "user/email";
    }

    @GetMapping("/userPassword")
    public String passwordTab(){
        return "user/password";
    }

    @GetMapping("/userVaccineList")
    public String vaccineList(){
        return "user/Vaccine List";
    }

    @GetMapping("/userFAQ")
    public String userFAQ(){
        return "user/FAQ";
    }



}
