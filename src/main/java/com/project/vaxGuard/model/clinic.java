package com.project.vaxGuard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Stack;

@Entity
public class clinic {

    private String name;
    @Id
    private String registrationNumber;
    @OneToMany
    private List<vaccine> vaccines;
    @OneToMany
    private List<user> records;
    @OneToMany
    private List<user> requests;




}
