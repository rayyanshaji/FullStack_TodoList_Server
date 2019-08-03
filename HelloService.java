package com.rayyanshaji.rest.services.restfulwebservices.helloworld;

public class HelloService {

	private String message;

	public HelloService(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloService [message=" + message + "]";
	}
	
}
