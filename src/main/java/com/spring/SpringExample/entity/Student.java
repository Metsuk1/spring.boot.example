package com.spring.SpringExample.entity;

import lombok.*;
import jakarta.persistence.*;

import java.beans.Transient;
import java.time.LocalDate;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor

@Data //все выше перечисленные аннотации есть в этой аннотации
@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    @Column(unique=true)
    private String email;

    private int age;

}
