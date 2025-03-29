package com.springboot.githubaction.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/MyApp")
public class MessageController {

	   private static final Logger log = LoggerFactory.getLogger(MessageController.class);
	
	@GetMapping("/message")
	public String gettestDept() {	
		
		log.info("In Controller ......... ");
		return "This is demo for Spring Boot CI CD using GitHub-Actions..";
	}
}