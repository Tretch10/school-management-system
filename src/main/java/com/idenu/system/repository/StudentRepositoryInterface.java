package com.idenu.system.repository;

import com.idenu.system.studentModel.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoryInterface extends JpaRepository<Student, Long> {


}
