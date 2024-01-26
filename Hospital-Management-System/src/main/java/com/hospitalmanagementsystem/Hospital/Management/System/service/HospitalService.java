package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.repository.HospitalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HospitalService {
    HospitalRepository hospitalRepository;
    public HospitalService() {
        this.hospitalRepository = new HospitalRepository();
    }

    public List<Hospital> getAllHospital(){
        return hospitalRepository.getAllHospital();
    }
    public void registerHospital(Hospital h){
        h.setHospitalId(UUID.randomUUID());
        hospitalRepository.registerHospital(h);

    }
}
