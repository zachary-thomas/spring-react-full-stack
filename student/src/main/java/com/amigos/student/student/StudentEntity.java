package com.amigos.student.student;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    @Id
    private Long id;
    private String name;
    private String email;
    private Gender gender;

    public static StudentEntity from(Student student){
        return StudentEntity.builder()
                .email(student.getEmail())
                .id(student.getId())
                .name(student.getName())
                .gender(student.getGender())
                .build();
    }

}
