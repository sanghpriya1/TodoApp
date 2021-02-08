package com.todo.work.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	@GetMapping("/Home")
	public String todoer() {
		return "Hello";
	}
	@GetMapping("/Courses") 
		public String toShower() {
			return "No course for you";
		}
	@GetMapping("/MoreCourses") 
	public String toShow() {
		return "More course for you";
	}

}
