package com.sboot.technical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.technical.model.Technical;
import com.sboot.technical.repository.TechnicalRepository;

@RestController
public class TechnicalController {
	
	@Autowired
	TechnicalRepository technicalRepository;
	
	@GetMapping(value = "/techniques", produces = "application/json")
	public List<Technical> getAllTechniques(){
		return technicalRepository.findAll();
	}

}
