package com.unkim.springprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import processing.core.PApplet;

@SpringBootApplication
public class SpringProcessingApplication {

    public static void main(String[] args) {
        PApplet.main(ProcessingMain.class, args);
        SpringApplication.run(SpringProcessingApplication.class, args);
    }
}
