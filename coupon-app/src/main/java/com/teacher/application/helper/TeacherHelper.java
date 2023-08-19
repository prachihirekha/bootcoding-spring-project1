package com.teacher.application.helper;

import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

@Component
public class TeacherHelper {
    public String teacher(){
            Random random = new Random();
            String name[] = {"raju", "ramu", "sonu", "divya", "Raja"};
            int index = random.nextInt(name.length);
            return name[index];
        }
        public String subject(){
        Random ram =new Random();
        String subject[] ={"englis","hindi","marathi","Science","maths","geo","history"};
        int index =ram.nextInt(subject.length);
        return subject[index];
        }
    }

