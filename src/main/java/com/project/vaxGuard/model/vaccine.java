package com.project.vaxGuard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class vaccine {

    private String vaccineName;
    @Id
    private String vaccineId;
    private String quantity;
    private String expiredDate;

    public vaccine() {
    }

    public vaccine(String vaccineName, String quantity, String expiredDate) {
        this.vaccineName = vaccineName;
        this.quantity = quantity;
        this.expiredDate = expiredDate;
    }


    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }
}
