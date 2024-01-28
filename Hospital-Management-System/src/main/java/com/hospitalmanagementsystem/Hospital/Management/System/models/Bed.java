package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.UUID;

public class Bed {
    UUID bedId;
    UUID patient;
    UUID doctor;
    UUID hospital;
    boolean isBooked;

    public Bed(){
        //Empty constructor
    }

    public Bed(UUID bedId, UUID patient, UUID doctor, boolean isBooked, UUID hospital) {
        this.bedId = bedId;
        this.patient = patient;
        this.doctor = doctor;
        this.isBooked = isBooked;
        this.hospital=hospital;
    }

    public UUID getBedId() {
        return bedId;
    }

    public void setBedId(UUID bedId) {
        this.bedId = bedId;
    }

    public UUID getPatient() {
        return patient;
    }

    public void setPatient(UUID patient) {
        this.patient = patient;
    }

    public UUID getDoctor() {
        return doctor;
    }

    public void setDoctor(UUID doctor) {
        this.doctor = doctor;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public UUID getHospital() {
        return hospital;
    }

    public void setHospital(UUID hospital) {
        this.hospital = hospital;
    }
}
