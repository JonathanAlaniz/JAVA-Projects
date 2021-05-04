package com.baconbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baconbuddy.models.Person;

@Controller
@RequestMapping({ "/", "/blank_blog", "/home" })
public class HomeController {

	@GetMapping()
	public String index(Model model) {
		model.addAttribute("person", new Person());
		// the string index will be looked for in
		// src/main/resources/templates

		return "index";
	}

	@PostMapping("/person")
	public String personSubmit(@ModelAttribute Person person) {
		return "result";
	}
}
