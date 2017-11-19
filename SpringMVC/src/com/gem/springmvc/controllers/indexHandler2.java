package com.gem.springmvc.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;

import com.gem.springmvc.pojo.User;

public class indexHandler2 implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HELLO SpringMVC");
		User u01 = new User(1,"张益桃","苏州");
		User u02 = new User(1,"王玉迎","苏州");
		User u03 = new User(1,"任力峰","苏州");
		List<User>userList = new ArrayList<User>();
		userList.add(u01);
		userList.add(u02);
		userList.add(u03);
		
		request.setAttribute("userList", userList);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	

}
