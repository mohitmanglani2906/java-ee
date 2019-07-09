package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootIntroApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootIntroApplication.class, args);  // For AutoConfiguration
		
		// Spring makes Singleton design pattern By Default that means it creates object automatically
		
		System.out.println("Hello Wolrd");
		System.out.print("Hey Boot I am Coming to you!!");
		
		Student stu  = context.getBean(Student.class);  // This will make an object of a Student Class
		
		stu.show();
		stu.call();
	}

}
