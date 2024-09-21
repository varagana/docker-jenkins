package com.example.DockerDemoApp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String greet() {
		return "hello";
	}
	
	@GetMapping("/hello")
	public String greet1() {
		return "hello1";
	}

}
