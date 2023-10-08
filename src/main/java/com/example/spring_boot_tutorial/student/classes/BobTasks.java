package com.example.spring_boot_tutorial.student.classes;

public class BobTasks {
    String name;
    String description;
    Boolean isCompleted;


    public void setname(String name) {
        this.name = name;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public void setisCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public String getname() {
        return name;
    }

    public String getdescription() {
        return description;
    }

    public Boolean getisCompleted() {
        return isCompleted;
    }
}
