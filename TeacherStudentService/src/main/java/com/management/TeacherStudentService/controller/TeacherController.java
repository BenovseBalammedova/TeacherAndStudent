package com.management.TeacherStudentService.controller;

import com.management.TeacherStudentService.dto.TeacherRequestDto;
import com.management.TeacherStudentService.dto.TeacherResponseDto;
import com.management.TeacherStudentService.entity.Teacher;
import com.management.TeacherStudentService.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {



    private final TeacherService service;

    public TeacherController(TeacherService service) {
        this.service = service;
    }

    @GetMapping("/get-all")
    public List<TeacherResponseDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Object getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody TeacherRequestDto obj) {
        service.save(obj);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable Long id, @RequestBody TeacherRequestDto obj) {
        service.update(id, obj);
    }

    @GetMapping("/get-By-Subject/{subject}")
    List<TeacherResponseDto> getBySubject(@PathVariable String subject) {
        return service.getBySubject(subject);
    }

    @GetMapping("/get-By-Upper-Experience/{exp}")
    List<TeacherResponseDto> getByUpperExperience(@PathVariable Integer exp) {
        return service.getByUpperExperience(exp);
    }

    @GetMapping("/salary/{lowerSalary}/{upperSalary}")
    List<TeacherResponseDto> getBySalaryInterval(@PathVariable Double lowerSalary, @PathVariable Double upperSalary) {
        return service.getBySalaryInterval(lowerSalary, upperSalary);
    }

}
