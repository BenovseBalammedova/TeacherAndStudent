package com.management.TeacherStudentService.exception.subexception;

import com.management.TeacherStudentService.exception.superexception.MainNotFoundException;

public class TeacherNotFoundException extends MainNotFoundException {
    public TeacherNotFoundException(String message) {
        super(message);
    }
}
