package com.FirstAPI.StudentDatabaseSampleAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add_student")
    public ResponseEntity addStudent(@RequestBody Student student){
        String response = studentService.addStudent(student);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/get_student")
    public ResponseEntity getStudent(@RequestParam("q") int rollNo) {
        Student student = studentService.getStudent(rollNo);
        if(student == null){
            return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(student, HttpStatus.FOUND);
        }
    }

    @PutMapping("/update_student/{rollNo}")
    public ResponseEntity updateStudent(@PathVariable("rollNo") int rollNo, @RequestBody Student student) {
        String response = studentService.updateStudent(rollNo, student);
        if(response.equals("Not Found")){
            return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete_student/{rollNo}")
    public ResponseEntity deletestudent(@PathVariable("rollNo") int rollNo) {
        String response = studentService.deletestudent(rollNo);
        if(response.equals("Invalid Roll No")){
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
}
