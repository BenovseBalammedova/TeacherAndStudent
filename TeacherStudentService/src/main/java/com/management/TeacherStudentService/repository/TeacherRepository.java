package com.management.TeacherStudentService.repository;

import com.management.TeacherStudentService.dto.TeacherResponseDto;
import com.management.TeacherStudentService.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    public List<Teacher> getBySubject(String subject);
    public List<Teacher> getByUpperExperience(Integer exp);
    public List<Teacher> getBySalaryInterval(Double lowerSalary, Double upperSalary);
}
