package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.service.HospitalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    //http://localhost:8080/hospital/getAllHospital
//Spring will create obj for controller
    //at that time of controller, obj for service got created
    //at the time of service, obj for repository got createdf
    HospitalService hospitalService=new HospitalService();

    @GetMapping("/getAllHospital")
    public List<Hospital> getAllHospital(){
        return hospitalService.getAllHospital();
    }
    @PostMapping("/register")
    public String registerHospital(@RequestBody Hospital obj){
        hospitalService.registerHospital(obj);
        return "Hospital added successfully";
    }
}
