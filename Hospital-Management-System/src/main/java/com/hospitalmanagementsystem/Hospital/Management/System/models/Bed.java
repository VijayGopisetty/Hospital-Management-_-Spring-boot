package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.UUID;

public class Bed {
    UUID bedId;
    UUID patient;
    UUID doctor;
    boolean isBooked;

    public Bed(UUID bedId, UUID patient, UUID doctor, boolean isBooked) {
        this.bedId = bedId;
        this.patient = patient;
        this.doctor = doctor;
        this.isBooked = isBooked;
    }
}
