package com.stream.config;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.stream.component.EncryptionSha;

import lombok.extern.slf4j.Slf4j;

@Component
public class UserInterceptor extends HandlerInterceptorAdapter{
	@Autowired
	private EncryptionSha encryptionSha;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String ip = request.getRemoteAddr();
		String encryption = encryptionSha.sha256(ip);
		
		Cookie cookie = new Cookie("user", encryption);
		response.addCookie(cookie);
		
		return true;
	}
}
