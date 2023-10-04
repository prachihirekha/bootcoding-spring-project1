package com.patient.application.controller;

import com.patient.application.model.InvoiceModePatient;
import com.patient.application.model.Patient;
import com.patient.application.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patientinvoice")
public class InvoicePatientController {
    @Autowired
    private PatientService patientService;
    @PostMapping("/patient")
    public String registor(@RequestBody Patient patient){
        // System.out.println(patient);
        patientService.singlePatient(patient);
        return "Success";
    }


}
