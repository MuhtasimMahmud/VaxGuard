package com.project.vaxGuard.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    private String role;
    @Id
    private String emailId;
    private String password;

    public User(){
        //Default Constructor
    }

    public User(String role, String emailId, String password) {
        this.role = role;
        this.emailId = emailId;
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
