package com.cognizant.springlearn.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cognizant.springlearn.model.Country;

@RestController
public class CountryController {
	
	@Autowired
	private Country country;
	@RequestMapping("/country")
	public Country getCountryIndia() {
		return country;
	}
}
