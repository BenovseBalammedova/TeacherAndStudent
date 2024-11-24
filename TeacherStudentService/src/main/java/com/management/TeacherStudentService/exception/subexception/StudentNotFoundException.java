package com.management.TeacherStudentService.exception.subexception;

import com.management.TeacherStudentService.exception.superexception.MainNotFoundException;

public class StudentNotFoundException extends MainNotFoundException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
