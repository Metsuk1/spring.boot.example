package com.spring.SpringExample.entity;

import lombok.*;

import java.time.LocalDate;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor

@Data //все выше перечисленные аннотации есть в этой аннотации
@Builder
public class Student {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String email;
    private int age;

}
