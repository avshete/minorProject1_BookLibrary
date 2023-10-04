package com.example.MinorProject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.MinorProject1.repository.AuthorRepositoryInterf;
import com.example.MinorProject1.repository.StudentRepositoryInterf;

@SpringBootApplication
public class MinorProject1Application implements CommandLineRunner{
	
	@Autowired
	AuthorRepositoryInterf authorRepositoryInterf;

	@Autowired
	StudentRepositoryInterf studentRepositoryInterf;

	public static void main(String[] args) {
		SpringApplication.run(MinorProject1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("In Main Method");
	}

}
