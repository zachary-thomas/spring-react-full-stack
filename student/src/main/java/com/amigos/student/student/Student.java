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
}
