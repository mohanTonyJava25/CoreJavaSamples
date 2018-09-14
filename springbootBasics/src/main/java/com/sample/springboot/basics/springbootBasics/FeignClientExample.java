package com.sample.springboot.basics.springbootBasics;

import feign.RequestLine;

public interface FeignClientExample {
	
	
	
	
	@RequestLine("GET")
	Response getData();

}
