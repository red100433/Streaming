package com.stream.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stream.service.StreamView;

@Controller
@RequestMapping("/contents")
public class TestController {
	@Autowired
	private StreamView streamView;

	@GetMapping("/{video_name:.+}")
	public String getContentMediaVideo(@PathVariable("video_name") String video_name, HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException, IOException {

		return streamView.stream(video_name, request, response);
	}
}
