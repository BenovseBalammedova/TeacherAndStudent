package com.management.TeacherStudentService.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Students")
@SuperBuilder
public class Student extends User {

    private String major;

    private Double gpa;

    @Column(name = "course_year", nullable = false)
    private Short courseYear;

}
