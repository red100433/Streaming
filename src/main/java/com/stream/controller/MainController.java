package com.stream.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {
	
//	@GetMapping("streaming")
//	@ResponseBody
//	public String hello(@CookieValue("user") String ip, HttpServletRequest req, HttpServletResponse res) {
//		return "stream";
//	}
	
	@GetMapping
	public String index() {
		return "stream";
	}
}
