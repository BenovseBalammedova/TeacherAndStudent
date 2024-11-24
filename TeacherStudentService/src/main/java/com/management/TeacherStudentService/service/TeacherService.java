package com.management.TeacherStudentService.service;

import com.management.TeacherStudentService.dto.TeacherRequestDto;
import com.management.TeacherStudentService.dto.TeacherResponseDto;
import com.management.TeacherStudentService.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<TeacherResponseDto> getAll();

    TeacherResponseDto getById(Long id);

    void delete(Long id);

    void save(TeacherRequestDto obj);

    void update(Long id, TeacherRequestDto obj);

    List<TeacherResponseDto> getBySubject(String subject);

    List<TeacherResponseDto> getByUpperExperience(Integer exp);

    List<TeacherResponseDto> getBySalaryInterval(Double lowerSalary, Double upperSalary);

}
