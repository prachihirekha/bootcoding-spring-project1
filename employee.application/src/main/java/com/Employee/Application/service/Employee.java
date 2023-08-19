package com.Employee.Application.service;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class Employee {
    private int id;
    private String name;
    private String Department;
}
