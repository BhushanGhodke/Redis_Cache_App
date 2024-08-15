package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>{
	

}
