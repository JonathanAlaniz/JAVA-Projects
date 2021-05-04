package com.greeting.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.greeting.models.Greeting;

@Controller
public class HomeController {

	@GetMapping("/")
	public String greetingForm(Model model) {
		model.addAttribute("greeting", new Greeting());
		return "greeting";
	}

	@PostMapping("/")
	public String greetingSubmit(@ModelAttribute Greeting greeting) {
		return "result";
	}
}
