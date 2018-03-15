package com.stream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stream.component.StreamView;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MainController {
	@Autowired
	private StreamView streamView;
	
	@GetMapping
	public String hello() {
		log.info("hello Man");
		return "hello";
	}
	
	@PostMapping
	public String hello2() {
		return "noMan";
	}
}
