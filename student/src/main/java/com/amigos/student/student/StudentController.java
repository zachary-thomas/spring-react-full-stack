package com.amigos.student.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(Student.builder()
                        .id(1L)
                        .name("Jamila")
                        .email("jamila@email.edu")
                        .gender(Gender.FEMALE)
                        .build(),
                Student.builder()
                        .id(2L)
                        .name("Alex")
                        .email("alex@email.edu")
                        .gender(Gender.MALE)
                        .build());
    }

    @PostMapping
    public Student addStudent(@ResponseBody Student student){
        studentService.addStudent(student);
    }
}
