package com.idenu.system.controller;

import com.idenu.system.studentModel.Student;
import com.idenu.system.studentService.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;

    }

    @PostMapping()
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();

    }

    //in curly braces because its a path variable and path variable is dynamic

//    @GetMapping("{id}")
//    public ResponseEntity<Student> getStudentById@PathVariable("id") long studentid){
//        return new ResponseEntity<Student>(studentService.getStudentById(studentid), HttpStatus.OK);
//
//    }

}
