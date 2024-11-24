package com.management.TeacherStudentService.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentResponceDto {


    private String fullName;

    private Integer age;

    private String email;

    private String major;

    private Double gpa;

    private Short courseYear;

}
