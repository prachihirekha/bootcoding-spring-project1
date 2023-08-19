package com.Employee.Application.helper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Random;


    @Component
    @Slf4j
    public  class EmployeeHelper {
        public String name() {
            Random random = new Random();
            String name[] = {"raju", "ramu", "sonu", "divya", "Raja"};
            int index = random.nextInt(name.length);
            return name[index];
        }
    }
