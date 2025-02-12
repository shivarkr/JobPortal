package com.example.Jobportal;

import com.example.Jobportal.Entitys.Job;
import com.example.Jobportal.Repositiry.Jobrepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class JobportalApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JobportalApplication.class, args);

	}

}
