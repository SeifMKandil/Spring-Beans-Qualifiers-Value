package com.example.spring_boot_tutorial.exceptions;

public class TaskUtilizationException extends Exception{
    public final String error="Too much tasks you are over Utilized";

    public String getError() {
        return error;
    }
}
