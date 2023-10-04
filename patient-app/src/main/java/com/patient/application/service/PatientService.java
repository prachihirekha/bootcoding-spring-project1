package com.patient.application.service;

import com.patient.application.model.InvoiceModePatient;
import com.patient.application.model.Patient;
import com.patient.application.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PatientService {
    @Autowired
    private PatientRepository r;
    public  void singlePatient(Patient patient){
        System.out.println(patient);
        r.save(patient);
       // return "success";

    }
}
