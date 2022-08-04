package com.amigos.student.student;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository extends JpaRepository<Student, int>{
    public Student addStudent(Student student) {
    }
}
