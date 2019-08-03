package com.rayyanshaji.rest.services.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
public class HelloWorldController {
	
	@RequestMapping(method=RequestMethod.GET, path= "/hello")
	public HelloService HelloWorld() {
		//throw new RuntimeException("Server Problem Sir. Bye ");
	return new HelloService("Bye Rayyan");
	}
	
	@RequestMapping(method=RequestMethod.GET, path= "/hello-world")
	public HelloService helloService() {
		//throw new RuntimeException("Server Problem Sir. Hello-World");
	return new HelloService("Hello Rayyan Shaji");
	}
	
	@GetMapping("/hello-world/path/{name}")
	public HelloService helloPathVariable(@PathVariable String name) {
		return new HelloService(String.format("Hello, %s", name));
	}
	
}
