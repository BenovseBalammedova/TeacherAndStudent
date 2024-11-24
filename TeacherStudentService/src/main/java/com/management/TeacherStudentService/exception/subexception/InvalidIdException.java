package com.management.TeacherStudentService.exception.subexception;

import com.management.TeacherStudentService.exception.superexception.MainInvalidException;

public class InvalidIdException extends MainInvalidException {
    public InvalidIdException(String message) {
        super(message);
    }
}
