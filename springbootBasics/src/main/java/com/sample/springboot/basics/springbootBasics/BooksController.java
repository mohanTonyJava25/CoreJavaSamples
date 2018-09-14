package com.sample.springboot.basics.springbootBasics;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

@RestController
public class BooksController {
	
	@Autowired
	private FeignService feignService;
	

	@GetMapping("/books")
	public ResponseEntity<List<Books>> getAllBooks() {
		return new ResponseEntity<List<Books>>(Arrays.asList(new Books(1, "Java book", " ariel"),new Books(2, "S book", " ariel")), HttpStatus.OK);

	}
	
	@GetMapping("/booksonUI")
	public ModelAndView displayBooksOnUI() {
		Books books = new Books(1, "Java book", " ariel");
		
		//map.addAttribute("books", Arrays.asList(books));
		return new ModelAndView("displaybooks", "books", books);

	}
	
	
	@GetMapping("/getdataFromExternalSite")
	public ResponseEntity<Response> getdataFromExternalSite() {
		return new ResponseEntity<Response>(feignService.getData() , HttpStatus.OK);

	}
	
	@GetMapping("/getdataFromExternalSiteOnUI")
	public ModelAndView getdataFromExternalSiteOnUI() {
		
		Response response =feignService.getData();
		return new ModelAndView("external", "response", response);

	}

	
	@GetMapping("/produceMultipleService/{value1}/{value2}")	
	public int MultipleService(@PathVariable int value1,@PathVariable int value2)
	
	{
		System.out.println("Values received for mutiplication : "+value1 + " and "+value2);
		System.out.println("multiplication result :::::"+(value1*value2));
		return value1  *  value2;
		
	}
	
	
  
	
}
