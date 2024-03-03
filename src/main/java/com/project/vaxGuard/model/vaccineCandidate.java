package com.project.vaxGuard.model;

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
    @Id
    private String birthID;
    private String birthHospitalName;
    private String email;
    @OneToMany
    private List<userTakenVaccines> takenVaccinesList;

    public vaccineCandidate(){
        //Default Constructor
    }

    public vaccineCandidate(String role, String id, String password, String babyName, Date birthDate, Time birthTime, String birthID, String birthHospitalName, String email, List<userTakenVaccines> takenVaccinesList) {
        super.setRole(role);
        BabyName = babyName;
        this.birthDate = birthDate;
        this.birthTime = birthTime;
        this.birthID = birthID;
        this.birthHospitalName = birthHospitalName;
        this.email = email;
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

    public String getBirthID() {
        return birthID;
    }

    public void setBirthID(String birthID) {
        this.birthID = birthID;
    }

    public String getBirthHospitalName() {
        return birthHospitalName;
    }

    public void setBirthHospitalName(String birthHospitalName) {
        this.birthHospitalName = birthHospitalName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<userTakenVaccines> getTakenVaccinesList() {
        return takenVaccinesList;
    }

    public void setTakenVaccinesList(List<userTakenVaccines> takenVaccinesList) {
        this.takenVaccinesList = takenVaccinesList;
    }
}
