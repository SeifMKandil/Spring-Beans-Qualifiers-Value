package com.example.spring_boot_tutorial.student.interfaces;

import com.example.spring_boot_tutorial.student.classes.AliceTasks;
import com.example.spring_boot_tutorial.student.classes.BobTasks;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import java.util.List;

@Mapper(componentModel = "spring")
public interface ListMapper {
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "isCompleted", target = "isCompleted")
    AliceTasks sourceToTarget(BobTasks source);
    List<AliceTasks> sourceListToTargetList(List<BobTasks> sources);
}
