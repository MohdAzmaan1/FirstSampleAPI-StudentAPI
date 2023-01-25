package com.FirstAPI.StudentDatabaseSampleAPI;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepository {
    Map<Integer, Student> map = new HashMap<>();

    public String addStudent(Student student){
        int rollNo = student.getRollNo();
        map.put(rollNo,student);
        return "Student details are added successfully";
    }

    public Student getStudent(int rollNo){
        if(!map.containsKey(rollNo)){
            return null;
        }
        return map.get(rollNo);
    }

    public String updateStudent(int rollNo, Student student){
        if(!map.containsKey(rollNo)){
            return "Not Found";
        }
        else{
            student.setAge(student.getAge());
            student.setName(student.getName());
            student.setState(student.getState());
            map.put(rollNo,student);
            return "Update is Successfull";
        }
    }

    public String deletestudent(int rollNo){
        if(map.containsKey(rollNo)){
            map.remove(rollNo);
            return "Student details are deleted";
        }
        else{
            return"Invalid Roll No";
        }
    }
}
