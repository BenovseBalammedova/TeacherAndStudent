package com.management.TeacherStudentService.entity;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Teachers")
@SuperBuilder
public class Teacher extends User {

    private Double salary;

    private String subject;

    private Integer experience;


}
