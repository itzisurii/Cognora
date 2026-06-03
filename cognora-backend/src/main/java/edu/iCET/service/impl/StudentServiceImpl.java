package edu.iCET.service.impl;

import edu.iCET.model.entity.Student;
import edu.iCET.repository.StudentRepository;
import edu.iCET.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    public Student save(Student student) {
        return repository.save(student);
    }

    public List<Student> getAll() {

        return repository.findAll();
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
