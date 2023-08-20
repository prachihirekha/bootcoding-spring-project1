package com.patient.application.repository;

import com.patient.application.model.InvoiceModePatient;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRepository {
    public String patient(InvoiceModePatient p){
        System.out.println("Insert data into DataBase");
        return "Mission Impossible";
    }

}
