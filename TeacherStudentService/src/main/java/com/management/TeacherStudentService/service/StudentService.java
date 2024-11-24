package com.management.TeacherStudentService.service;

import com.management.TeacherStudentService.dto.StudentRequestDto;
import com.management.TeacherStudentService.dto.StudentResponceDto;

import java.util.List;

public interface StudentService {

    List<StudentResponceDto> getAll();

    StudentResponceDto getById(Long id);

    void delete(Long id);

    void save(StudentRequestDto obj);

    void update(Long id, StudentRequestDto obj);

    List<StudentResponceDto> getByMajor(String major);

    List<StudentResponceDto> getByCourseYear(Short courseYear);

    List<StudentResponceDto> getByGpaInterval(Double gpa1, Double gpa2);

}
