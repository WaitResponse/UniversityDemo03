package com.gem.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gem.springmvc.pojo.User;

public class indexHandler implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.println("HELLO SpringMVC");
		User u01 = new User(1,"张益桃","苏州");
		User u02 = new User(1,"王玉迎","苏州");
		User u03 = new User(1,"任力峰","苏州");
		List<User>userList = new ArrayList<User>();
		userList.add(u01);
		userList.add(u02);
		userList.add(u03);
		ModelAndView mv = new ModelAndView();		
		mv.addObject("userList",userList);
		mv.setViewName("index");
		return mv;
	}

}
