package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Bed;
import com.hospitalmanagementsystem.Hospital.Management.System.repository.BedRepository;
import com.hospitalmanagementsystem.Hospital.Management.System.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BedService {
    @Autowired
    BedRepository bedRepository;
    @Autowired
    HospitalRepository hospitalRepository;
    public Bed getOccupiedBedInHospital(UUID hospitalId){
        List<Bed> beds= bedRepository.getAllBeds();
        for(Bed obj : beds){
            if(obj.isBooked()==false && obj.getHospital().toString().equals(hospitalId.toString())){
                return obj;
            }
        }
        return null;
    }

    public void addBed(UUID hospitalId){
        Bed obj=new Bed();
        obj.setHospital(hospitalId);
        obj.setBedId(UUID.randomUUID());
        //hospitalRepository.getHospitalById(hospitalId).getBeds().add(obj);
        hospitalRepository.getHospitalById(hospitalId).getBeds().add(obj);
        bedRepository.addBed(obj);
    }
    public Bed getBedById(UUID bedId){
        return bedRepository.getBed(bedId);
    }
}
