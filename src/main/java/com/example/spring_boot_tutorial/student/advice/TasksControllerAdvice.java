package com.example.spring_boot_tutorial.student.advice;

import com.example.spring_boot_tutorial.exceptions.TaskUtilizationException;
import com.example.spring_boot_tutorial.exceptions.TasksEmptyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class TasksControllerAdvice {
    @ExceptionHandler(TasksEmptyException.class)
    @ResponseBody
    public ResponseEntity handleTasksEmpty(TasksEmptyException tasksEmptyException)
    {
        String errorMessage = tasksEmptyException.getError();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }

    @ExceptionHandler(TaskUtilizationException.class)
    @ResponseBody
    public ResponseEntity handleTaskUtilization(TaskUtilizationException taskUtilizationException)
    {
        String errorMessage = taskUtilizationException.getError();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }

}

