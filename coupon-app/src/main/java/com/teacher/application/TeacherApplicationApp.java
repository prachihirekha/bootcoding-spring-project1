package com.teacher.application;

import com.teacher.application.servise.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TeacherApplicationApp implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(TeacherApplicationApp.class, args);
    }

    @Autowired
    private TeacherService ts;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(" running the application");
        List<String> TeacherList = ts.getNewTeacher(10);
        for (String t: TeacherList) {
            System.out.println(t);
        }
    }
}
