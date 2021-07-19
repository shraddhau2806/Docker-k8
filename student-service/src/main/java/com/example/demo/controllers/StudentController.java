package com.example.demo.controllers;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

 

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;

 

 

@RestController
public class StudentController {

 

    @Autowired
    private StudentService service;
    
    @GetMapping(path="/students/{key}")
    public Student getStudent(@PathVariable("key") int key) {
        return this.service.getStudent(key);
    }
    
    
}