package com.management.TeacherStudentService.controller;

import com.management.TeacherStudentService.service.StudentService;
import com.management.TeacherStudentService.dto.StudentRequestDto;
import com.management.TeacherStudentService.dto.StudentResponceDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {


    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/get-all")
    public List<StudentResponceDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public StudentResponceDto getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody StudentRequestDto obj) {
        service.save(obj);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable Long id, @RequestBody StudentRequestDto obj) {
        service.update(id, obj);
    }

    @GetMapping("/get-By-Major/{major}")
    public List<StudentResponceDto> getByMajor(@PathVariable String major) {
        return service.getByMajor(major);
    }

    @GetMapping("/get-By-Course-Year/{courseYear}")
    public List<StudentResponceDto> getByCourseYear(@PathVariable Short courseYear) {
        return service.getByCourseYear(courseYear);
    }

    @GetMapping("/{gpa1}/{gpa2}")
    public List<StudentResponceDto> getByGpaInterval(@PathVariable Double gpa1, @PathVariable Double gpa2) {
        return service.getByGpaInterval(gpa1, gpa2);
    }

}
