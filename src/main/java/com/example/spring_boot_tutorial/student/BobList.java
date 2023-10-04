package com.example.spring_boot_tutorial.student;
import java.util.List;


public class BobList {
    private final List<String> tasks;

    public BobList(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
