package com.patient.application.service;

import com.patient.application.model.Patient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Service {

    public String newPatient() {
        return "success";
    }

    public String insertPatient(Patient p) {
        patients.add(p);
        return "mgs";
    }
    public List<Patient> patient(){
        return patients;
    }
    private List<Patient> patients=new ArrayList<>();// temp memory

    public boolean insertMultiplePatient(List<Patient> patient) {
        for(Patient p:patient){
            insertPatient(p);
    }
        return true;
}
    public Patient getByIdPatient(int srNo){
        for (Patient user :patients){
            if(srNo == user.getSrNo()){
                return user;
            }
        }
        return null;
    }
}
