package com.example.greeting.api.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping
	public String greet() {
		return getGreetings();
	}

	private String getGreetings() {		
		Calendar c = Calendar.getInstance();
		int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
		if (timeOfDay < 12) {
			return "Good morning, Patil!";
		} else if (timeOfDay < 16) {
			return "Good afternoon, Patil!";
		} else if (timeOfDay < 21) {
			return "Good evening, Patil!";
		} else {
			return "Good night, Patil!";
		}
	}
}
