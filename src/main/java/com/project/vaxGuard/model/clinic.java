package com.project.vaxGuard.model;

import javax.persistence.*;

import java.util.List;

@Entity
public class clinic extends User{

    private String name;
    @Id
    private String registrationNumber;
    @OneToMany
    private List<clinicVaccines> vaccinesList;
    @OneToMany
    private List<vaccineCandidate> records;
    @OneToMany
    private List<vaccineCandidate> requests;


    public clinic(){
        //Default Constructor
    }

    public clinic(String role, String id, String password, String name, String registrationNumber, List<clinicVaccines> vaccinesList, List<vaccineCandidate> records, List<vaccineCandidate> requests) {
        super.setRole(role);
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.vaccinesList = vaccinesList;
        this.records = records;
        this.requests = requests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return super.getId();
//        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        super.setId(registrationNumber);
//        this.registrationNumber = registrationNumber;
    }

    public List<clinicVaccines> getVaccinesList() {
        return vaccinesList;
    }

    public void setVaccinesList(List<clinicVaccines> vaccinesList) {
        this.vaccinesList = vaccinesList;
    }

    public List<vaccineCandidate> getRecords() {
        return records;
    }

    public void setRecords(List<vaccineCandidate> records) {
        this.records = records;
    }

    public List<vaccineCandidate> getRequests() {
        return requests;
    }

    public void setRequests(List<vaccineCandidate> requests) {
        this.requests = requests;
    }
}
