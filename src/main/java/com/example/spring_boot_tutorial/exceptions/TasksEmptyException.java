package com.example.spring_boot_tutorial.exceptions;

public class TasksEmptyException extends Exception {
    public final String error="NO TASKS FOUND";

    public String getError() {
        return error;
    }
}
