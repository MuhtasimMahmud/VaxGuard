package com.project.vaxGuard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class clinic {

    private String name;
    @Id
    private String registrationNumber;
    @OneToMany
    private List<clinicVaccines> vaccinesList;
    @OneToMany
    private List<user> records;
    @OneToMany
    private List<user> requests;

    public clinic(){

    }

    public clinic(String name, String registrationNumber, List<clinicVaccines> vaccinesList, List<user> records, List<user> requests) {
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
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public List<clinicVaccines> getVaccinesList() {
        return vaccinesList;
    }

    public void setVaccinesList(List<clinicVaccines> vaccinesList) {
        this.vaccinesList = vaccinesList;
    }

    public List<user> getRecords() {
        return records;
    }

    public void setRecords(List<user> records) {
        this.records = records;
    }

    public List<user> getRequests() {
        return requests;
    }

    public void setRequests(List<user> requests) {
        this.requests = requests;
    }
}
