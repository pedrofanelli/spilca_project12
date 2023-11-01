package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Country;

@RestController
public class CountryController {

	@GetMapping("/france")
	public Country france() {
		Country c = Country.of("France", 67);
		return c;
	}
}
