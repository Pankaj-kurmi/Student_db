package org.example.student.repositry;

import org.example.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositry extends JpaRepository<Student,Long> {
}
