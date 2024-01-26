package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Doctor;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    HospitalService hospitalService;
    public void register(Doctor obj){
        obj.setDocId(UUID.randomUUID());
        Hospital h=hospitalService.getHospital(obj.getHospitalId());
        h.getDoctors().add(obj);
        doctorRepository.registerDoctor(obj);
    }
    public List<Doctor> getAllDoctors(){
        return doctorRepository.getAllDoctors();
    }
}
