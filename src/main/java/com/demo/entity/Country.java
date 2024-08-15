package com.demo.entity;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("CountryHash")
public class Country {

	private Integer id;
	
	private String countryName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
}
