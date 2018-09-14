package com.sample.springboot.basics.springbootBasics;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class JsonController {
	
	@PostMapping("/convertToJava")
	public String convertToJava(@RequestBody String request) throws JsonParseException, JsonMappingException, IOException {
		
		System.out.println("Received json request :: "+request);
		
		// jackson api 
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		
		Employee emp = objectMapper.readValue(request, Employee.class);
		
		System.out.println("Converted to Java object : "+emp);
		
		Employee emp2 = new Employee();
		emp2.setEmpDept("IT");
		emp2.setId("111");
		emp2.setEmpName("mohan");
		emp2.setSal("100000000");
		
		
		String jsonresult = objectMapper.writeValueAsString(emp2);
		
		System.out.println("Object to Json result ::::::: "+jsonresult);
		
		return jsonresult;
		
	}

}
