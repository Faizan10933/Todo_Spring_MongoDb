package com.faizan.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(TodoRepository todoRepository){
//		return args -> {
//			Todo todo = new Todo(
//					"Brush your teeth",
//					"in the morning",
//					LocalDateTime.now()
//			);
//
//			todoRepository.insert(todo);
//		};
//	}

}
