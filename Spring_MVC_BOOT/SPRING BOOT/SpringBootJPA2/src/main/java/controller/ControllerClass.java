package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class ControllerClass
{

	
	@Autowired   // This will create a  object of AlienRepo because we want to save our data into database   
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);     // This method will save your data into database
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView showAliean(@RequestParam int aid)
	{
		ModelAndView mv =  new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(aid).orElse(null);
		mv.addObject(alien);
		
		return mv;
	}
}
