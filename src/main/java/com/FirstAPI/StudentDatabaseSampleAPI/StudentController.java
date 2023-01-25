package com.FirstAPI.StudentDatabaseSampleAPI;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<Integer, Student> map = new HashMap<>();

    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        int rollNo = student.getRollNo();
        map.put(rollNo,student);
        return "Student details are added successfully";
    }

    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("q") int rollNo) {

        return map.get(rollNo);
    }

    @PutMapping("/update_student/{rollNo}")
    public String updateStudent(@PathVariable int rollNo, @RequestBody Student student) {
        student.setAge(student.getAge());
        student.setName(student.getName());
        student.setState(student.getState());
        map.put(rollNo,student);
        return "Update is Successfull";
    }

    @DeleteMapping("/delete_student/{rollNo}")
    public String deletestudent(@PathVariable int rollNo) {
        map.remove(rollNo);
        return "Student details are deleted";
    }
}
