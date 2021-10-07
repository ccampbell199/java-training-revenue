package com.accenture.tagtrainingspring.patient;

import java.time.LocalDate;

public class Patient {
    private String name;
    private int id;
    private LocalDate dateOfBirth;
    private Gender gender;

    public Patient(String name, int id, LocalDate dateOfBirth, Gender gender) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
