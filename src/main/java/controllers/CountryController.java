package controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Country;

@RestController
public class CountryController {

	
	/*
	 * By default Spring creates a String representation of the object/collection and converts it to JSON!
	 */
	/*
	@GetMapping("/france")
	public Country france() {
		Country c = Country.of("France", 67);
		return c;
	}
	*/
	
	/*
	 * Setting the response status and headers, with the body!
	 */
	@GetMapping("/france")
	public ResponseEntity<Country> france() {
		Country c = Country.of("France", 67);
		return ResponseEntity
				.status(HttpStatus.ACCEPTED)
				.header("continent", "Europe")
				.header("capital", "Paris")
				.header("favorite_food", "cheese and wine")
				.body(c);
	}
	
	
	
	@GetMapping("/all")
	public List<Country> countries() {
		Country c1 = Country.of("France", 67);
		Country c2 = Country.of("Spain", 47);
		return List.of(c1, c2);  // In Java 9 and later, List.of() is designed to return an instance of java.util.ImmutableCollections.ListN, which is an internal, highly optimized implementation of an immutable list.
	}
}
