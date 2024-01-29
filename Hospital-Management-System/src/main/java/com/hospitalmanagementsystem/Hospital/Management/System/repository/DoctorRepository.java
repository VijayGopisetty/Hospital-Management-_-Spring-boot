package com.hospitalmanagementsystem.Hospital.Management.System.repository;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Repository
public class DoctorRepository {

    public DoctorRepository(){
        this.doctorDB=new HashMap<>();
    }
    HashMap<UUID, Doctor> doctorDB;
    public void registerDoctor(Doctor obj){
        UUID id=obj.getDocId();
        doctorDB.put(id,obj);
    }
    public List<Doctor> getAllDoctors(){
        List<Doctor> doctors=new ArrayList<>();
        for(UUID id:doctorDB.keySet()){
            Doctor obj=doctorDB.get(id);
            doctors.add(obj);
        }
        return doctors;
    }
    public Doctor getDocById(UUID docId){
        return doctorDB.get(docId);
    }
}
