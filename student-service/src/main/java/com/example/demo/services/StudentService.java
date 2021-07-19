package com.example.demo.services;
import java.util.HashMap;
import java.util.Map;

 

import org.springframework.stereotype.Service;

 

import com.example.demo.entity.Student;

 

@Service
public class StudentService {

 

    Map<Integer, Student> hm=new HashMap<Integer,Student>();

 

    public StudentService(Map<Integer, Student> stds) {
        super();
        this.hm = stds;
        
    }
    
    public StudentService() {
        super();
        init();
        // TODO Auto-generated constructor stub
    }

 

    public void init() {
        
        Student s2=new Student(2,"chetan",89.0);
        Student s3=new Student(3,"deepali",89.0);
        Student s4=new Student(4,"anuhj",89.0);
        Student s5=new Student(5,"nitin",89.0);
        hm.put(1, new Student(1,"nutan",89.0));
        hm.put(2, s2);
        hm.put(3, s3);
        hm.put(4, s4);
        hm.put(5, s5);
    }
    
    public Student getStudent(int key) {
        return this.hm.get(key);
    }
}