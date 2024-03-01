package com.project.vaxGuard.controller.hospitalAuthority;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hospitalController {


    @GetMapping("DoctorSignUp")
    public String docSignUp(){
        return "hospitalAuthority/DoctorSignUp";
    }


}
