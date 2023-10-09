package com.example.spring_boot_tutorial;

import com.example.spring_boot_tutorial.student.classes.AliceTasks;
import com.example.spring_boot_tutorial.student.classes.BobTasks;
import com.example.spring_boot_tutorial.student.interfaces.ListMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@ComponentScan({"com.example"})
public class SpringBootTutorialApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootTutorialApplication.class, args);

        ListMapper listMapper = Mappers.getMapper(ListMapper.class);

        List<BobTasks> bobTasksList = Arrays.asList(
                createBobTask("Task 1", "Description 1", true),
                createBobTask("Task 2", "Description 2", false)
        );

        List<AliceTasks> aliceTasksList = listMapper.sourceListToTargetList(bobTasksList);

        for (AliceTasks aliceTask : aliceTasksList) {
            System.out.println("Name: " + aliceTask.getName());
            System.out.println("Description: " + aliceTask.getDescription());
            System.out.println("Is Completed: " + aliceTask.getCompleted());
            System.out.println();
        }
    }

    private static BobTasks createBobTask(String name, String description, boolean isCompleted) {
        BobTasks bobTask = new BobTasks();
        bobTask.setname(name);
        bobTask.setdescription(description);
        bobTask.setisCompleted(isCompleted);
        return bobTask;
    }
    }


