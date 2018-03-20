package com.stream.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.stream.model.Board;

@Mapper
public interface BoardRepo {
	// List<Board> getList(Long next);
	// Board getById(@Param("id") Long id, @Param("userId") int userId);

	List<Board> getListAll();

	boolean add(Board board);

	boolean delete(Board board);
}
