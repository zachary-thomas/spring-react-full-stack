package com.amigos.student.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
// or @Data
public class Student {
    @Id
    private Long id;
    private String name;
    private String email;
    private Gender gender;

    // Converter for entity object
//    public static Student from(StudentEntity studentEntity){
//        return Student.builder()
//                .email(studentEntity.getEmail())
//                .id(studentEntity.getId())
//                .name(studentEntity.getName())
//                .gender(studentEntity.getGender())
//                .build();
//    }
}
