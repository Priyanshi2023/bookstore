package com.prog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class bookscontroller {
	@GetMapping("/")
	public String home() {
		return "indexbook";
	}
	@GetMapping("/edit")
	public String editBook() {
		return "edit_book";
	}

}
