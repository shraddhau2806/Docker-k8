package com.example.demo.entity;

 

public class Student {
    private int rollnumber;
    private String name;
    private double marksScored;
    public Student(int rollnumber, String name, double marksScored) {
        super();
        this.rollnumber = rollnumber;
        this.name = name;
        this.marksScored = marksScored;
    }
    public int getRollnumber() {
        return rollnumber;
    }
    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMarksScored() {
        return marksScored;
    }
    public void setMarksScored(double marksScored) {
        this.marksScored = marksScored;
    }
    @Override
    public String toString() {
        return "Student [rollnumber=" + rollnumber + ", name=" + name + ", marksScored=" + marksScored + "]";
    }
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
}