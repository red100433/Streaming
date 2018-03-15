package com.stream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stream.component.EncryptionSha;
import com.stream.component.StreamView;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MainController {
	@Autowired
	private StreamView streamView;
	
	@Autowired
	private EncryptionSha encryptionSha; 
	
	@GetMapping
	public String hello(@CookieValue("user") String ip) {
		log.info("encryption ip : {}", ip);
//		log.info("String: {}, SHA256: {}" , "hiyo", encryptionSha.sha256("hiyo"));
		return "hello";
	}
	
	@PostMapping
	public String hello2() {
		return "noMan";
	}
}
