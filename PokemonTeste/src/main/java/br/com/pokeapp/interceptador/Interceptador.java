package br.com.pokeapp.interceptador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptador extends HandlerInterceptorAdapter {
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String uri = request.getRequestURI();
		
		if(uri.endsWith("index"))
			return true;
		
		if(request.getSession().getAttribute("treinador") != null)
			return true;
		
		response.sendRedirect("treinador");
		return false;
	
	}// preHandler
	
}// class
