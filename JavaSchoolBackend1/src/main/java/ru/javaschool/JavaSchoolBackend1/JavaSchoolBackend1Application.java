package ru.javaschool.JavaSchoolBackend1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JavaSchoolBackend1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaSchoolBackend1Application.class, args);
	}

}
