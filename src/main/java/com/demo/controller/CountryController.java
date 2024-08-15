package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Country;
import com.demo.repository.CountryRepository;

@RestController
@RequestMapping("/Country")
public class CountryController {

	@Autowired
	private CountryRepository countryRepository;

	
	@PostMapping("/save")
	public String saveCountry(@RequestBody Country country) {
		
		countryRepository.save(country);
		
		return "Country Saved";
	}
	
	@GetMapping("/getAll")
	public Iterable<Country> getAllCountry(){
		return countryRepository.findAll();
		
	}
}
