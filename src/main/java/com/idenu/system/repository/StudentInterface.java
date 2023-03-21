package com.idenu.system.repository;

import com.idenu.system.studentModel.StudentManagementModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInterface extends JpaRepository<StudentManagementModel, Long> {


}
