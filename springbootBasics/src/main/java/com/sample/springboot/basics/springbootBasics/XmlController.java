package com.sample.springboot.basics.springbootBasics;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myschema.Employee;

@RestController
public class XmlController {
	
	
	@PostMapping("/xmlToJava") 
	public String convertXmlToJava(@RequestBody String request) throws JAXBException {
		System.out.println("Received xml request : "+request);
		
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance(com.example.myschema.Employee.class);
		
		Source source = new StreamSource(new ByteArrayInputStream(request.getBytes()));
		
		 JAXBElement<com.example.myschema.Employee> jaxbElement= (JAXBElement<com.example.myschema.Employee>) jaxbContext.createUnmarshaller().unmarshal(source,com.example.myschema.Employee.class);
		 
		 com.example.myschema.Employee employee =  jaxbElement.getValue();
		 
		 
		 System.out.println(employee.getDept());
		 System.out.println(employee.getEmpId());
		 System.out.println(employee.getEmpName());
		 System.out.println(employee.getLocaion());
		 
		 
		 // again java to xml : 
		 
		// JAXBContext jaxbContext = jaxbContext.newInstance(Employee.class);
		 StringWriter sw = new StringWriter();
		 jaxbContext.createMarshaller().marshal(employee, sw);
		 
		 System.out.println("Object to XML :::::: "+sw.toString());
		
		return sw.toString();
		
	}

}
