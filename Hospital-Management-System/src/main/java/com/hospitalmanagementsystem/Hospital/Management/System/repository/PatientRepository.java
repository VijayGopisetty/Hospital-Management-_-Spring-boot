package com.hospitalmanagementsystem.Hospital.Management.System.repository;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.UUID;
@Repository
public class PatientRepository {
    HashMap<UUID, Patient> patientDB=new HashMap<>();
    public void registerPatient(Patient obj){
        UUID id=obj.getPatientId();
        patientDB.put(id,obj);
    }

    public Patient getPatientById(UUID id){
        return patientDB.get(id);
    }
    public void updatePatientAdmitStatus(UUID pId){
        patientDB.get(pId).setAdmit(false);
    }
}
