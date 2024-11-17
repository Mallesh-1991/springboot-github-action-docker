package com.springboot.githubaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/MyApp")
public class MessageController {

	
	@GetMapping("/message")
	public String gettestDept() {	
		
		
		return "This is demo for Spring Boot CI CD using GitHub-Actions..";
	}
}