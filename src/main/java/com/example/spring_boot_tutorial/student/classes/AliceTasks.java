package com.example.spring_boot_tutorial.student.classes;

public class AliceTasks {
    String name;
    String description;
    Boolean isCompleted;

    public AliceTasks(String name , String description , Boolean isCompleted){
        this.name = name;
        this.description = description ;
        this.isCompleted=isCompleted;

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }
}
