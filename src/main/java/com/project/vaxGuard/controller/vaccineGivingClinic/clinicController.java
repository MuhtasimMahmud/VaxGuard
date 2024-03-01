package com.project.vaxGuard.controller.vaccineGivingClinic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class clinicController {


    @GetMapping("clinicSignUp")
    public String clinicSignUp(){
        return "vaccineGivingClinic/clinicSignUp";
    }

    @GetMapping("clinicBase")
    public String clinicBase(){
        return "vaccineGivingClinic/clinicBase";
    }

    @GetMapping("pushVaccine")
    public String pushVaccine(){
        return "vaccineGivingClinic/Push";
    }


}
