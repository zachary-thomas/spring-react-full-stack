package com.amigos.student.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student addStudent(Student student) {
        return studentRepository.addStudent(student);
    }
}
