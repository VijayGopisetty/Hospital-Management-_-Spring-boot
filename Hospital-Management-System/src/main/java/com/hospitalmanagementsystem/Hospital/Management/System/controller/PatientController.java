package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;
import com.hospitalmanagementsystem.Hospital.Management.System.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;
    @PostMapping("/register")
    public String registerPatient(@RequestBody Patient obj){
        patientService.register(obj);
        return "Patient got added successfully";
    }
    @GetMapping("/{pId}/details")
    public Patient getPatientById(@PathVariable UUID pId){
        return patientService.getPatient(pId);
    }
    @DeleteMapping("/{pId}/remove")
    public String deletePatient(@PathVariable UUID pId){
        patientService.deletePatient(pId);
        return "Patient got deleted";
    }
}
