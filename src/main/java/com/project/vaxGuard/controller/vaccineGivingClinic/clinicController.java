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

    @GetMapping("clinicRecords")
    public String records(){
        return "vaccineGivingClinic/records";
    }

    @GetMapping("vaccineQuantity")
    public String vaccines(){
        return "vaccineGivingClinic/vaccines";
    }

    @GetMapping("requests")
    public String requests(){
        return "vaccineGivingClinic/requests";
    }

    @GetMapping("clinicProfile")
    public String profile(){
        return "vaccineGivingClinic/profile";
    }

}
