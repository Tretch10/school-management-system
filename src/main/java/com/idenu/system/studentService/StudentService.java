package com.idenu.system.studentService;

import com.idenu.system.studentModel.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(long id);



}
