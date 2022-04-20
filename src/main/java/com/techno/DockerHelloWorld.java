package com.techno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker")
public class DockerHelloWorld {

	@GetMapping
	public String getName() {  
		
		return "Welcome to deployment in docker app By Mr. Gaurav Gadre";
	}
}
