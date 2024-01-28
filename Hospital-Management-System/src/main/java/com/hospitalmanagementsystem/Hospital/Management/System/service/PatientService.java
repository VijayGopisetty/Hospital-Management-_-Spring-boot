package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Bed;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Doctor;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;
import com.hospitalmanagementsystem.Hospital.Management.System.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class PatientService {
    @Autowired
    HospitalService hospitalService;
    @Autowired
    BedService bedService;
    @Autowired
    PatientRepository patientRepository;
    public void register(Patient obj){
        //1. generate unique id for patient
        UUID id=UUID.randomUUID();
        obj.setPatientId(id);

        //2. Get the doctor who is handling min no f patient in that particular hospital
        Doctor doctor= hospitalService.getMinimumPatientDoctorInHospital(obj.getHospitalId());
        obj.setDocId(doctor.getDocId());
        doctor.getPatients().add(obj);

        //3. get the unoccupied bed
        Bed bed=bedService.getOccupiedBedInHospital(obj.getHospitalId());
        obj.setBedId(bed.getBedId());

        //4. set the status for the bed with docId and bed id
        bed.setBooked(true);
        bed.setPatient(obj.getBedId());
        bed.setDoctor(doctor.getDocId());

        //5. Save the patient to database
        patientRepository.registerPatient(obj);

    }

    public Patient getPatient(UUID pId){
        return patientRepository.getPatientById(pId);
    }
}
