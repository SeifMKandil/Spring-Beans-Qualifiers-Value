package com.example.spring_boot_tutorial.student.config;

import com.example.spring_boot_tutorial.student.AliceList;
import com.example.spring_boot_tutorial.student.BobList;
import com.example.spring_boot_tutorial.student.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class studentConfiguration {

    @Value("#{'${alice.tasks}'.split(',')}")
    private List<String> aliceTasks;

    @Value("#{'${bob.tasks}'.split(',')}")
    private List<String> bobTasks;

    @Bean
    public StudentService studentService(AliceList aliceList, BobList bobList) {
        return new StudentService(aliceList, bobList);
    }

    @Bean(name = "aliceList")
    public AliceList aliceListBean() {
        return new AliceList(aliceTasks);
    }

    @Bean(name = "bobList")
    public BobList bobListBean() {
        return new BobList(bobTasks);
    }
}
