package com.project.vaxGuard.controller.GovtHospitalORhealthCareAuthority;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hospitalController {

    @GetMapping("childBirthRegistration")
    public String childRegistration(){
        return "GovtHospitalORhealthCareAuthority/childBirthRegistration";
    }

}
