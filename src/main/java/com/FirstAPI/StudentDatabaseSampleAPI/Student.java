package com.FirstAPI.StudentDatabaseSampleAPI;

public class Student {
    private String name;
    private int rollNo;
    private String state;
    private int age;

    public Student(String name, int rollNo, String state, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.state = state;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
