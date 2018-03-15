package com.stream.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stream.component.StreamView;

@Service
public class StreamService {
	@Autowired
	private StreamView streamView;
	
	public void streaming(HttpServletRequest req, HttpServletResponse res) {
		Map<String, String> map = new HashMap<>();
		map.put("movieName", "[JTBC] 슈가맨 2.E02.180121.720p-NEXT");
		try {
			streamView.render(map, req, res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
