package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class ControllerClass
{

	
	@Autowired   // This will create a object of AlienRepo because we want to save our data into database   
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
	
	@PostMapping("/alien")  // Post mapping by which we can add data into database using Postman api
	@ResponseBody            // In PostMapping we can use consumes={"application/json"}
	public Alien addedAlien(Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	@GetMapping(path="/aliens",produces= {"application/xml","application/json"}) // Content Negotiation
	@ResponseBody
	public List<Alien> getAllAliens()
	{
		return repo.findAll();
	}
	
	
	@GetMapping("/alienses/{aid}")
	@ResponseBody
	public Optional<Alien> getByid(@PathVariable("aid") int aid)
	{
		return repo.findById(aid);
	}
	
	@RequestMapping(path="/getAlien")
	public ModelAndView showAliean(@RequestParam int aid)
	{
		ModelAndView mv =  new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		
		System.out.println(repo.findByTech("java"));
		System.out.println(repo.findByAidGreaterThan(aid));
		System.out.println(repo.findByTechSorted("java"));
		mv.addObject(alien);
		
		return mv;
	}
	
	
	
	@RequestMapping("/deleteAlien")
	public ModelAndView deleteAlien(@RequestParam int aid)
	{
		ModelAndView mv = new ModelAndView("home.jsp");
		repo.deleteById(aid);
		return mv;
	}
	
	@DeleteMapping("/aliendelete/{aid}")
	@ResponseBody
	public String deletealien(@PathVariable("aid") int aid)
	{
		try
		{
			Alien a = repo.getOne(aid);
			System.out.println(a);
			repo.delete(a);
			return "Deleted";
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return "something went wrong!!";
		
	}
	
	@PutMapping(path="/alienupdate",consumes= {"application/json"})
	@ResponseBody
	public Alien updateorSave(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
}
