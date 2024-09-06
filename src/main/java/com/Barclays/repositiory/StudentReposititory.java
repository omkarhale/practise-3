package com.Barclays.repositiory;

import com.Barclays.entitiy.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentReposititory extends JpaRepository<Student,Long> {
}
