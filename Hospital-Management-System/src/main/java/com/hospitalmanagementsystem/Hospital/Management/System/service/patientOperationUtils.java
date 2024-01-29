package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;

import java.util.List;
import java.util.UUID;

public abstract class patientOperationUtils {
    public void removePatient(UUID id, List<Patient> patients){
        for(int i=0;i<patients.size();i++){
            UUID patientId_curr=patients.get(i).getPatientId();
            if(patientId_curr.equals(id)){
                patients.remove(i);
                break;
            }
        }
    }
}
