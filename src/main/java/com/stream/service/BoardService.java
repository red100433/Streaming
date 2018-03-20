package com.stream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stream.model.Board;
import com.stream.repository.BoardRepo;

@Service
public class BoardService {
	@Autowired
	private BoardRepo boardRepo;
	
	public List<Board> getListAll() {
		return boardRepo.getListAll();
	}
}
