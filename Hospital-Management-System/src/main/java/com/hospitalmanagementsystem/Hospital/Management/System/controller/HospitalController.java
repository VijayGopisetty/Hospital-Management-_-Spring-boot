package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    //http://localhost:8080/hospital/getAllHospital
//Spring will create obj for controller
    //at that time of controller, obj for service got created
    //at the time of service, obj for repository got createdf
    @Autowired
    HospitalService hospitalService;

    @GetMapping("/getAllHospital")
    public List<Hospital> getAllHospital(){
        return hospitalService.getAllHospital();
    }
    @PostMapping("/register")
    public String registerHospital(@RequestBody Hospital obj){
        hospitalService.registerHospital(obj);
        return "Hospital added successfully";
    }
    @GetMapping("")
    public Hospital getHospitalById(@RequestParam UUID hospitalId){
        return hospitalService.getHospital(hospitalId);
    }
}
