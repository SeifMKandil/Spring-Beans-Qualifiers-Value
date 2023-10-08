package com.example.spring_boot_tutorial.student.config;

import com.example.configclass.interfaces.StaticTasksService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Arrays;

@Configuration
public class TaskConfig {

    @Bean(name = "bobListWeekend")
    public StaticTasksService bobTask() {
        return () -> Arrays.asList("Do the dishes,Go out,Touch the grass".split(","));
    }
}
