package com.patient.application;

import com.patient.application.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientAppApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(PatientAppApplication.class, args);
	}
@Autowired
private Service patientService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String s =patientService.newPatient();
		System.out.println("new Patient :" + s);

	}
}
