package com.example.spring_boot_tutorial.student;
import com.example.configclass.interfaces.StaticTasksService;
import com.example.spring_boot_tutorial.exceptions.TasksEmptyException;
import com.example.spring_boot_tutorial.student.classes.AliceTasks;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private final StaticTasksService aliceList;
    private final StaticTasksService bobList;



    public TaskController(@Qualifier("aliceList") StaticTasksService List, @Qualifier("bobList") StaticTasksService BobList
                          ) {
        this.aliceList = List;
        this.bobList = BobList;

    }

    @GetMapping("/alice")
    public List<String> getAliceTasks() throws TasksEmptyException {
        if (aliceList.getTasks().get(0).isEmpty())
            throw new TasksEmptyException();
        return aliceList.getTasks();
    }

    @GetMapping("/bob")
    public List<String> getBobTasks() {
        return bobList.getTasks();
    }


}
