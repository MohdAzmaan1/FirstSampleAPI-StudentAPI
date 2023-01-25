package com.FirstAPI.StudentDatabaseSampleAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student){
        return studentRepository.addStudent(student);
    }

    public Student getStudent(int rollNo){
        return studentRepository.getStudent(rollNo);
    }

    public String updateStudent(int rollNo, Student student){
        return studentRepository.updateStudent(rollNo, student);
    }

    public String deletestudent(int rollNo){
        return studentRepository.deletestudent(rollNo);
    }
}
