package com.git.main.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

	@GetMapping("get")
	public String get() {

		return "Ankush";
	}

}
