package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/dockerapi")
	public void FirstApi() {
		System.out.println("docker application is started..");
	}

}
