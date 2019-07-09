package com.mohit.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("/")
	public String getHome()
	{
		return "home.jsp";
	}
	
	@RequestMapping(value="/login")
	public String getLoginpage()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String getLogoutpage()
	{
		return "logout.jsp";
	}
}
