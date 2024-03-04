package com.project.vaxGuard.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class vaccineCandidate extends User{

    private String BabyName;
    private Date birthDate;
    private Time birthTime;
    private String birthHospitalName;
    @Column(unique = true)
    private String birthID;
    @OneToMany
    private List<userTakenVaccines> takenVaccinesList;

    public vaccineCandidate(){
        //Default Constructor
    }

    public vaccineCandidate(String role, String emailId, String password, String babyName, Date birthDate, Time birthTime, String birthHospitalName, String birthID, List<userTakenVaccines> takenVaccinesList) {
        super.setRole(role);
        super.setEmailId(emailId);
        super.setPassword(password);
        BabyName = babyName;
        this.birthDate = birthDate;
        this.birthTime = birthTime;
        this.birthHospitalName = birthHospitalName;
        this.birthID = birthID;
        this.takenVaccinesList = takenVaccinesList;
    }




}
