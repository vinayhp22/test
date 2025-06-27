package com.mngt.student.service;

import com.mngt.student.dtos.StudentDTO;
import com.mngt.student.model.Student;
import java.util.List;

public interface StudentService {
    Student createStudent(StudentDTO dto);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student updateStudent(Long id, StudentDTO dto);
    void deleteStudent(Long id);
}
