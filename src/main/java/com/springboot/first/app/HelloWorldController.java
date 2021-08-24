package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//=(@Controller+@ResponseBody)	
//@Controller-this makes this class a spring MUC  class to handle web requests
//@ResponseBody-this makes the java object to json or xml or any other form
//this makes this class able to handle web requests
public class HelloWorldController {
	
	//GET HTTp method
	//when client accesses http://localhost:8080/hello-world he will receive "Hello World!" 
	
	@GetMapping("/hello-world")  //this makes this method a REST API and handles get request
	public String helloWorld() {
		return "Hello World!";
	}
	
}
