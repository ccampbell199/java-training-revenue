package com.accenture.tagtrainingspring.screening;

import java.time.LocalDate;

public class Screening {

    private int screeningId;
    private int patientId;
    private LocalDate dateOfScreening;
    private boolean malignantResult;

    public Screening(int screeningId, int patientId, LocalDate dateOfScreening, boolean malignantResult) {
        this.screeningId = screeningId;
        this.patientId = patientId;
        this.dateOfScreening = dateOfScreening;
        this.malignantResult = malignantResult;
    }

    public int getScreeningId(){
        return screeningId;
    }

    public void setScreeningId(int screeningId){
        this.screeningId = screeningId;
    }

    public int getPatientId(){
        return patientId;
    }

    public void setPatientId(int patientId){
        this.patientId = patientId;
    }

    public LocalDate getDateOfScreening() {
        return dateOfScreening;
    }

    public void setDateOfScreening(LocalDate dateOfScreening){
        this.dateOfScreening = dateOfScreening;
    }

    public boolean getMalignantResult(){
        return malignantResult;
    }

    public void setMalignantResult(boolean malignantResult){
        this.malignantResult = malignantResult;
    }
}
