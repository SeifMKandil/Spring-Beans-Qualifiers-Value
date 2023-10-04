package com.example.spring_boot_tutorial.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

public class AliceList {
    private final List<String> tasks;

    public AliceList(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
