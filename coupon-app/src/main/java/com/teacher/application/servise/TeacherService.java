package com.teacher.application.servise;

import com.teacher.application.helper.TeacherHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeacherService {
    @Autowired
    private TeacherHelper th ;
    public List<String> getTeacher ()
    {
        List<String> list =new ArrayList<>();
        list.add(th.teacher());
        list.add((th.subject()));
        return list;
    }
    public List<String> getNewTeacher(int quantity){
        List<String> teacher =new ArrayList<>();
        for(int i=0;i< quantity;i++) {
             teacher.add(th.teacher());
             teacher.add(th.subject());
        }
        return teacher;
    }
}
