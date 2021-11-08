package com.sen.animalapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnimalController {
	
	@GetMapping("/")
	public @ResponseBody String home() {
		return "home";
	}
	
	@GetMapping("/login")
	public @ResponseBody String login() {
		return "login";
	}
}
