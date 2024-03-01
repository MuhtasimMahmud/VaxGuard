package com.project.vaxGuard.controller.vaccineGivingClinic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class clinicController {


    @GetMapping("clinicSignUp")
    public String docSignUp(){
        return "vaccineGivingClinic/clinicSignUp";
    }


}
