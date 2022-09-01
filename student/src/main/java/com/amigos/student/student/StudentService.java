package com.amigos.student.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student addStudent(Student student) {
        return Student.from(studentRepository.save(StudentEntity.from(student)));
    }
    public void deleteStudent(Student student) {
        studentRepository.delete(StudentEntity.from(student));
    }
}
