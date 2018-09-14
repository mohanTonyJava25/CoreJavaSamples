package com.sample.springboot.basics.springbootBasics;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import feign.Feign;


import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

@Service
public class FeignService {

	public Response getData() {

		FeignClientExample feign = Feign.builder().client(new OkHttpClient()).encoder(new GsonEncoder())
				.decoder(new GsonDecoder()).logger(new Slf4jLogger(FeignClientExample.class))
				.logLevel(Logger.Level.FULL).target(FeignClientExample.class, "https://httpbin.org/get");

		Response feignResponse = feign.getData();

		System.out.println("feign response >>>>>>>>>>>>>>" + feignResponse);
		return feignResponse;
	}

}
