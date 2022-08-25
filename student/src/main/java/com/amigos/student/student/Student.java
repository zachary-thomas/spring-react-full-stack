package com.amigos.student.student;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
// or @Data
public class Student {
    private Long id;
    private String name;
    private String email;
    private Gender gender;

    public static Student from(StudentEntity studentEntity){
        return Student.builder()
                .email(studentEntity.getEmail())
                .id(studentEntity.getId())
                .name(studentEntity.getName())
                .gender(studentEntity.getGender())
                .build();
    }
}
