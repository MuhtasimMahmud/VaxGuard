package com.project.vaxGuard.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {

    @GetMapping("userHome")
    public String userHome(){
        return "user/userDashboard";
    }

    @GetMapping("signUp")
    public String signUp(){
        return "signUp";
    }


}
