package com.amigos.student.student;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class StudentEntity {
    @Id
    private Long id;
    private String name;
    private String email;
    private Gender gender;

}
