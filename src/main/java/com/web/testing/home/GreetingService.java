package com.web.testing.home;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	public String greet() {
		return "Hello, Mock";
	}
	
}
