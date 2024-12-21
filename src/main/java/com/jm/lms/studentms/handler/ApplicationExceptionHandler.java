package com.jm.lms.studentms.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
   public Map<String, String>  exceptionHandlerAdvice(MethodArgumentNotValidException ex){
       Map<String,String> errorInfo = new HashMap<>();
       ex.getBindingResult().getFieldErrors().forEach(error ->{
          errorInfo.put(error.getField(), error.getDefaultMessage());
       });

        return errorInfo;
    }
}