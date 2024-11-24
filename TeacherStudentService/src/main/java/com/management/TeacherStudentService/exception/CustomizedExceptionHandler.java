package com.management.TeacherStudentService.exception;

import ch.qos.logback.core.model.processor.ModelHandlerException;
import com.management.TeacherStudentService.exception.superexception.MainInvalidException;
import com.management.TeacherStudentService.exception.superexception.MainNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(MainNotFoundException.class)
    @ResponseStatus(code=HttpStatus.NOT_FOUND)
    public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),
                ex.getMessage(),
                request.getDescription(false)
        );

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);

    }


        @ExceptionHandler(MainInvalidException.class)
        @ResponseStatus(code=HttpStatus.BAD_REQUEST)
        public final ResponseEntity<Object> handleInvalidUserException(Exception ex, WebRequest request){
            ErrorDetails errorDetails=new ErrorDetails(
                    LocalDateTime.now(),
                    ex.getMessage(),
                    request.getDescription(false)
            );

            return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);

    }

}
