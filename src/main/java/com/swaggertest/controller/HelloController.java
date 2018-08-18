package com.swaggertest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "hello", produces=MediaType.APPLICATION_JSON_VALUE)
	public String sayHello() {
		return "Swagger Hello World Application";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/api/hellopost")
	public String sayHello1() {
		return "Swagger Hello World Application";
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/api/swaggerapiput")
	public String sayHello2() {
		return "Swagger Hello World Application";
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/swaggerapidelete")
	public String sayHello3() {
		return "Swagger Hello World Application";
	}
}
