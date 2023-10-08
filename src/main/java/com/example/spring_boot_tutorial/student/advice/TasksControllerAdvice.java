package com.example.spring_boot_tutorial.student.advice;

import com.example.spring_boot_tutorial.exceptions.TasksEmptyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TasksControllerAdvice {
    @ExceptionHandler(TasksEmptyException.class)
    public ResponseEntity handleTasksEmpty(TasksEmptyException tasksEmptyException)
    {
        return ResponseEntity.ok(tasksEmptyException);
    }
}
