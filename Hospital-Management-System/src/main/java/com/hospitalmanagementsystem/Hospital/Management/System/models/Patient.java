package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.UUID;

public class Patient {
    UUID patientId;
    String name;
    String address;
    String disease;
    Long contactNumber;
    UUID docId;
    UUID hospitalId;
    int age;
    String emailId;
    boolean isAdmit;
    UUID bedId;

    public Patient(UUID patientId, String name, String address, String disease, Long contactNumber, UUID docId, int age, String emailId,UUID hospitalId, UUID bedId) {
        this.patientId = patientId;
        this.name = name;
        this.address = address;
        this.disease = disease;
        this.contactNumber = contactNumber;
        this.docId = docId;
        this.age = age;
        this.emailId = emailId;
        this.hospitalId=hospitalId;
        this.isAdmit=true;
        this.bedId=bedId;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public UUID getDocId() {
        return docId;
    }

    public void setDocId(UUID docId) {
        this.docId = docId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public UUID getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(UUID hospitalId) {
        this.hospitalId = hospitalId;
    }

    public boolean isAdmit() {
        return isAdmit;
    }

    public void setAdmit(boolean admit) {
        isAdmit = admit;
    }

    public UUID getBedId() {
        return bedId;
    }

    public void setBedId(UUID bedId) {
        this.bedId = bedId;
    }
}
