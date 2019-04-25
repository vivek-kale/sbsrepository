package com.myjsp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Jscontroller {
	
	@RequestMapping("/hello")
	public String welcome(HttpServletRequest request)
	{
		request.setAttribute("mode", "MODE_HOME");
		return "welcome";
	}
	
	@RequestMapping("/usersign")
	public String userlg(HttpServletRequest request)
	{
		request.setAttribute("mode", "MODE_LOGIN");
		return "welcome";
	}
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request)
	{
		request.setAttribute("mode", "MODE_REGISTER");
		return "welcome";
	}


}
