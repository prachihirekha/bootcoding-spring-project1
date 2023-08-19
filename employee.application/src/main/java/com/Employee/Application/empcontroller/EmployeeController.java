package com.Employee.Application.empcontroller;

import com.Employee.Application.service.Employee;
import com.Employee.Application.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
    private EmployeeService employeeService;
@GetMapping("/getEmployee")
public String newEmployee() {
    return "New Employes :" + employeeService.getNewEmployee();
}
@GetMapping("/getMutilpleEmployee")
    public List<String> newEmpQunatity(){
    int quantity =10;
    return employeeService.getNewEmployee(quantity);
}
    //public Employee getDummyJson(){
   //return Employee.builder().id(employeeService.getNewEmployee()).name(c).build();
}

