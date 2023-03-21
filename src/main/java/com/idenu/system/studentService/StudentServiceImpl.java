package com.idenu.system.studentService;

import com.idenu.system.repository.StudentInterface;
import com.idenu.system.studentModel.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentInterface studentInterface;

    @Autowired
    public StudentServiceImpl(StudentInterface studentInterface) {
        super();
        this.studentInterface = studentInterface;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentInterface.save(student);
    }
}
