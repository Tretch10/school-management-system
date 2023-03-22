package com.idenu.system.studentService;

import com.idenu.system.repository.StudentRepositoryInterface;
import com.idenu.system.studentModel.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Student> getAllStudents() {
        return studentRepositoryInterface.findAll();
    }

    @Override
    public Student getStudentById(long id) {
        Optional<Student> student = studentRepositoryInterface.findById(id);
        if (student.isPresent()) {
            return student.get();
        }else{
         return null; //I am returning null because I haven't made a designated exception
        }
    }
}
