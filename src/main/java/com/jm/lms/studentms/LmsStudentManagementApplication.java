package com.jm.lms.studentms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class LmsStudentManagementApplication {

    public LmsStudentManagementApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(LmsStudentManagementApplication.class, args);

    }
}
