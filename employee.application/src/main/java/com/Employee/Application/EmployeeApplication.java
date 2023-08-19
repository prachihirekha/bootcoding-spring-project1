package com.Employee.Application;

import com.Employee.Application.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
@SpringBootApplication
public class EmployeeApplication implements ApplicationRunner {
    public static void main(String[] args) {

        SpringApplication.run(EmployeeApplication.class, args);
    }
    @Autowired
    private EmployeeService employeeService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("hello world");
        String newEmp = employeeService.getNewEmployee();
        System.out.println(newEmp);
        List<String> empList = employeeService.getNewEmployee(100);
        for(String emp : empList) {
            System.out.println(emp);
        }
    }
}

