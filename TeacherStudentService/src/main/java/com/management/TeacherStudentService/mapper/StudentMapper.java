package com.management.TeacherStudentService.mapper;

import com.management.TeacherStudentService.entity.Student;
import com.management.TeacherStudentService.dto.StudentRequestDto;
import com.management.TeacherStudentService.dto.StudentResponceDto;

import java.util.List;

public class StudentMapper {

    public static StudentResponceDto entityToDto(Student student){
        return StudentResponceDto.builder()
                .fullName(student.getFullName())
                .email(student.getEmail())
                .age(student.getAge())
                .gpa(student.getGpa())
                .major(student.getMajor())
                .courseYear(student.getCourseYear())
                .build();
    }

    public static Student dtoToEntity(StudentRequestDto dto){

        return Student.builder()
                .fullName(dto.getFullName())
                .gpa(dto.getGpa())
                .email(dto.getEmail())
                .age(dto.getAge())
                .major(dto.getMajor())
                .courseYear(dto.getCourseYear())
                .password(dto.getPassword())
                .build();

    }
    public static List<StudentResponceDto> entityToList(List<Student> students){
        return students.stream().map(StudentMapper::entityToDto).toList();
    }

}
