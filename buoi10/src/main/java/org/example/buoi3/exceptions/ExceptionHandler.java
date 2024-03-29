package org.example.buoi3.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.OK)
    public ErrorResponse handleNotFoundException(NotFoundException exception){
        return new ErrorResponse(404, exception.getMessage());
    }
}
