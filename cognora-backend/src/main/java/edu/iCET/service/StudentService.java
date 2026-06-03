package edu.iCET.service;

import edu.iCET.model.entity.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);

    List<Student> getAll();

    void deleteStudent(Long id);
}
