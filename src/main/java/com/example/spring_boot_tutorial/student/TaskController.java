package com.example.spring_boot_tutorial.student;
import com.example.configclass.interfaces.StaticTasksService;
import com.example.spring_boot_tutorial.exceptions.TaskUtilizationException;
import com.example.spring_boot_tutorial.exceptions.TasksEmptyException;

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
    public List<String> getAliceTasks() throws TaskUtilizationException,TasksEmptyException {
        if (aliceList.getTasks().get(0).isEmpty())
            throw new TasksEmptyException();
        else if (aliceList.getTasks().size() > 3) {
            throw  new TaskUtilizationException();
        }
        return aliceList.getTasks();
    }

    @GetMapping("/bob")
    public List<String> getBobTasks() throws TaskUtilizationException , TasksEmptyException {
        if (bobList.getTasks().get(0).isEmpty())
            throw new TasksEmptyException();
        else if (bobList.getTasks().size() > 3) {
            throw  new TaskUtilizationException();
        }
        return bobList.getTasks();
    }


}
