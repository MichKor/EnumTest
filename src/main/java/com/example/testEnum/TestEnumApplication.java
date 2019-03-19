package com.example.testEnum;

import com.example.testEnum.service.MovieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestEnumApplication {

	public static void main(String[] args) {
		MovieService movieService = new MovieService();
		movieService.addMovie();
		SpringApplication.run(TestEnumApplication.class, args);
	}

}
