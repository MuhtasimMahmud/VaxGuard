package com.project.vaxGuard.controller.GovtHospitalORhealthCareAuthority;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hospitalController {


    @GetMapping("hospitalLogin")
    public String hospitalLogin(){
        return "hospitalLogin";
    }

    @GetMapping("childBirthRegistration")
    public String childRegistration(){
        return "GovtHospitalORhealthCareAuthority/childBirthRegistration";
    }


    @GetMapping("submitForm")
    public String submitForm(){
        return "";
    }





}
