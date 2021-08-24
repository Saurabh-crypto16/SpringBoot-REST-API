package com.springboot.first.app;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	
	//this is a REST API that returns the object of student class as JSON
	//to return a XML:@GetMapping(value="/student", produces=MediaType.APPLICATION_XML_VALUE)
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Saurabh", "Prakash");
	}
	
	//REST API returning list
	@GetMapping("/students-list")
	public ArrayList<Student> getStudents(){
		ArrayList<Student> students =new ArrayList<>();
		
		students.add(new Student("Saurabh", "Prakash"));
		students.add(new Student("Saurabh", "Prakash"));
		students.add(new Student("Saurabh", "Prakash"));
		students.add(new Student("Saurabh", "Prakash"));
		students.add(new Student("Saurabh", "Prakash"));
		
		return students;
	}
	
	//REST API to handle path variables
	// base link/student/pathVariable
	//@PathVariable binds the path variables in the link to the function
	@GetMapping("student-path/{firstName}/{lastName}")	//{} inside this is called uri template variable
	public Student studentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	//REST API to handle query or web request parameters
	/*
	 * consider the link http://localhost8080/student-req?firstName=Saurabh&lastName=Prakash
	 * query parameter is after the ?
	 * and it is a key value pair
	 * */
	 @GetMapping("/student-req")
	 public Student studentQueryParam(
			 @RequestParam(name="firstName") String firstName,
			 @RequestParam(name="lastName") String lastName) {
		 return new Student(firstName, lastName);
	 }
}
















