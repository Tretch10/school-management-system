package com.idenu.system.studentService;

import com.idenu.system.repository.StudentRepositoryInterface;
import com.idenu.system.studentModel.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepositoryInterface studentRepositoryInterface;


    public StudentServiceImpl(StudentRepositoryInterface studentRepositoryInterface) {

        this.studentRepositoryInterface = studentRepositoryInterface;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepositoryInterface.save(student);
    }
}
