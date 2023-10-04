package com.patient.application.repository;

import com.patient.application.model.InvoiceModePatient;
import com.patient.application.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
//   public String patient(InvoiceModePatient p){
//        System.out.println("Insert data into DataBase");
//        return "Mission Impossible";
//    }

}
