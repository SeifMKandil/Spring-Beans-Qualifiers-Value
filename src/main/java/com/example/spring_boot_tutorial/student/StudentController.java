package com.example.spring_boot_tutorial.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/alice/tasks")
    public List<String> getAliceTasks() {
        return studentService.getAliceTasks();
    }

    // Example endpoint to get Bob's tasks
    @GetMapping("/bob/tasks")
    public List<String> getBobTasks() {
        return studentService.getBobTasks();
    }
}
