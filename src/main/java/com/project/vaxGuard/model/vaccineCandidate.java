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

    public String getBabyName() {
        return BabyName;
    }

    public void setBabyName(String babyName) {
        BabyName = babyName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Time getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(Time birthTime) {
        this.birthTime = birthTime;
    }

    public String getBirthHospitalName() {
        return birthHospitalName;
    }

    public void setBirthHospitalName(String birthHospitalName) {
        this.birthHospitalName = birthHospitalName;
    }

    public String getBirthID() {
        return birthID;
    }

    public void setBirthID(String birthID) {
        this.birthID = birthID;
    }

    public List<userTakenVaccines> getTakenVaccinesList() {
        return takenVaccinesList;
    }

    public void setTakenVaccinesList(List<userTakenVaccines> takenVaccinesList) {
        this.takenVaccinesList = takenVaccinesList;
    }
}
