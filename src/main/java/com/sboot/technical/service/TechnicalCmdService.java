/*package com.sboot.technical.service;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sboot.technical.model.Technical;
import com.sboot.technical.repository.TechnicalRepository;

@Component
public class TechnicalCmdService implements CommandLineRunner {

	@Autowired
	TechnicalRepository technicalReposiotry;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Stream.of("java", "spring", "rest", "jpa").forEach(name -> this.technicalReposiotry.save(new Technical(name)));
	}

}
*/