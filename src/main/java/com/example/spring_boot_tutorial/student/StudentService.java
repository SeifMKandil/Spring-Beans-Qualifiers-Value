package com.example.spring_boot_tutorial.student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;


    public class StudentService {
        private final AliceList aliceList;
        private final BobList bobList;

        public StudentService(@Qualifier("aliceList") AliceList aliceList,
                              @Qualifier("bobList") BobList bobList) {
            this.aliceList = aliceList;
            this.bobList = bobList;
        }

        public List<String> getAliceTasks() {
            return aliceList.getTasks();
        }

        public List<String> getBobTasks() {
            return bobList.getTasks();
        }
    }

