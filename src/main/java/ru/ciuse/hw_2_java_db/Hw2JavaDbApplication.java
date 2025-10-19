package ru.ciuse.hw_2_java_db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "ru.ciuse.hw_2_java_db")
public class Hw2JavaDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Console.class, args);
	}

}
