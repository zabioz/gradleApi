package com.example.demo.service;


import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;


import com.example.demo.dto.ZipCodeDto;
@Service

public class ZipCodeService {
	@Autowired
	@Qualifier("zipCodeSearchRestTemplate")
    RestTemplate restTemplate;
	
	 private static final String URL = "https://zip-cloud.appspot.com/api/search?zipcode={zipcode}";

	    public ZipCodeDto service(String zipcode) {
	        return restTemplate.getForObject(URL, ZipCodeDto.class, zipcode);
	    }
}