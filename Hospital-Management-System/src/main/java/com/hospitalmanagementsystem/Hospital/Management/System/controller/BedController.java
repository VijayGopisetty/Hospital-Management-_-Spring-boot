package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/bed")
public class BedController {
    @Autowired
    BedService bedService;

    @PostMapping("/add")
    public String add(@RequestParam UUID hospitalId){
        bedService.addBed(hospitalId);
        return "Bed got added successfully";
    }
}
