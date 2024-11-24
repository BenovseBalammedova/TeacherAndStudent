package com.management.TeacherStudentService.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeacherRequestDto {

    private String fullName;

    private Integer age;

    private String email;

    private String password;

    private Double salary;

    private String subject;

    private Integer experience;

}