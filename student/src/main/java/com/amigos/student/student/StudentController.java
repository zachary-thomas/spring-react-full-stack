package com.amigos.student.student;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/students")
public class StudentController {

    private final StudentService studentService;

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
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping
    public void deleteStudent(@RequestBody Student student) {
        studentService.deleteStudent(student);
    }
}
