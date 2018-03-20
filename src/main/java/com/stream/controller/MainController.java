package com.stream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stream.model.Board;
import com.stream.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {
	
//	@GetMapping("streaming")
//	@ResponseBody
//	public String hello(@CookieValue("user") String ip, HttpServletRequest req, HttpServletResponse res) {
//		return "stream";
//	}
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping
	public String home() {
		return "home";
	}
	
	@GetMapping("board")
	@ResponseBody
	public List<Board> board() {
		return boardService.getListAll();
	}
	
	@GetMapping("stream")
	public String index() {
		return "stream";
	}
}
