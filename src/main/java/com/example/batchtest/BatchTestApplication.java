package com.example.batchtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@SpringBootApplication
@EnableTask
public class BatchTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchTestApplication.class, args);
	}

}
