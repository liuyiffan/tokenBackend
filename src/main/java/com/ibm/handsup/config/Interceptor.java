package com.ibm.handsup.config;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.ibm.handsup.constants.CONSTANTS;
import com.ibm.handsup.response.Response;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Interceptor implements HandlerInterceptor {
	@SuppressWarnings("rawtypes")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		String token = request.getHeader("token");
		// No token found in header
		if (token == null) {
			try {
				Response result = Response.ok(Response.CODE_TOKEN_NOTEXIST, "Access token is required.", null);
				response.setContentType("application/json");
				response.getOutputStream().write(new ObjectMapper().writeValueAsBytes(result));
			} catch (Exception e) {
				// log
			}
			return false;
			
		// Wrong token
		} else if (!checkAuth(token)) {
			try {
				Response result = Response.ok(Response.CODE_TOKEN_EXPIRED, "Wrong access token.", null);
				response.setContentType("application/json");
				response.getOutputStream().write(new ObjectMapper().writeValueAsBytes(result));
			} catch (Exception e) {
				// log
			}
			return false;
			
		// Token check pass
		} else {
			return true;
		}
	}
	
	/**
	 * Sinple example of token check function
	 * @param token
	 * @return
	 */
	private boolean checkAuth(String token) {
		long timestamp = Long.valueOf(token);
		long now = new Date().getTime();
		return (now - timestamp) < CONSTANTS.TOKEN_EXPIRED_TIME && (now - timestamp) > 0;
	}
}
