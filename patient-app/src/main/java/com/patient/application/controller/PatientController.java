package com.patient.application.controller;

import com.patient.application.model.Patient;
import com.patient.application.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private Service s;
    @PostMapping("/forOne-patient")
    public String insert(@RequestBody Patient patient){
        return s.insertPatient(patient);
    }
    @PostMapping("/multiple-patient")
    public boolean insertMultiplePatient(@RequestBody List<Patient> p){
        s.insertMultiplePatient(p);
        return true;
    }
    @GetMapping("all-patient")
    public List<Patient> getPatient(){
       return s.patient();
    }
    // 2.2 Get patient Details by Coupon Id using PathVariable
    @GetMapping("/patient-srNo/{srNo}")
    public Patient getByIdPatient(@PathVariable("srNo")int srNo){
        Patient patient =s.getByIdPatient(srNo);
        return patient;
    }

}
