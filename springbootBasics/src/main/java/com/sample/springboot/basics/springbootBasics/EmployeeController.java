package com.sample.springboot.basics.springbootBasics;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class EmployeeController {
	
	
	
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@PostMapping("/postJson")
	public void convertJsontoJAVA(@RequestBody String str) throws JsonParseException, JsonMappingException, IOException {
		
		System.out.println("Received request : "+str);
		
		// jackson api  , google api gson
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		
		Employee emp = objectMapper.readValue(str, Employee.class);
		
		System.out.println("Emp pid : "+emp.getId());
		System.out.println("Emp name : "+emp.getEmpName());
		System.out.println("Emp dept : "+emp.getEmpDept());
		System.out.println("Emp salray : "+emp.getSalary());
		
	}
	
	
	
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody String jsonRequest) throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Save Employee Request : "+jsonRequest);
		ObjectMapper objectMapper = new ObjectMapper();
		Employee employee = objectMapper.readValue(jsonRequest, Employee.class);
		
		String response = employeeDAO.saveEmployee(employee);
		
		
		
		return response;
	}

}
