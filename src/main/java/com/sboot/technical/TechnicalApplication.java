package com.sboot.technical;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sboot.technical.model.Technical;
import com.sboot.technical.repository.TechnicalRepository;

@SpringBootApplication
public class TechnicalApplication {
	
	@Bean
	CommandLineRunner commandLineRunner(TechnicalRepository technicalRepository) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				Stream.of("java", "spring", "rest", "jpa").forEach(name -> technicalRepository.save(new Technical(name)));
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(TechnicalApplication.class, args);
	}
}
