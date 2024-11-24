package com.management.TeacherStudentService.repository;


import com.management.TeacherStudentService.dto.StudentResponceDto;
import com.management.TeacherStudentService.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> getByMajor(String major);
    public List<Student> getByCourseYear(Short courseYear);
    public List<Student> getByGpaInterval(Double gpa1, Double gpa2);

}
