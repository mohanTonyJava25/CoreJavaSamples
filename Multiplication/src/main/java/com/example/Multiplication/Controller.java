package com.example.Multiplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/AdditionService/{value1}/{value2}")
	public int AdditionService(@PathVariable int value1, @PathVariable int value2) {

		System.out.println("Values received for multiplication :" + value1 + " and " + value2);
		System.out.println("addition results" + (value1 + value2));
		return value1 + value2;

	}

}
