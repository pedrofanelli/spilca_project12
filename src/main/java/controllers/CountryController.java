package controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Country;

@RestController
public class CountryController {

	
	/*
	 * By default Spring creates a String representation of the object and converts it to JSON!
	 */
	
	@GetMapping("/france")
	public Country france() {
		Country c = Country.of("France", 67);
		return c;
	}
	
	@GetMapping("/all")
	public List<Country> countries() {
		Country c1 = Country.of("France", 67);
		Country c2 = Country.of("Spain", 47);
		return List.of(c1, c2);  // In Java 9 and later, List.of() is designed to return an instance of java.util.ImmutableCollections.ListN, which is an internal, highly optimized implementation of an immutable list.
	}
}
