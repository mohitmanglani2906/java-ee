/*
 * How Spring boot is different from Spring mvc?
 * Here we can see in maven dependencies that we no need any external
 * server like tomcat and glassfish it provides us an in built server
 * with port number.
 * 
 * But What is benefit of that?
 * The benefit is if you just copy your project to your 
 * friend computer there no need of any external configuration.
 * */

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController 
{
	@RequestMapping("home")
//	@ResponseBody  // It simply show the actual data whatever you pass!!
	public ModelAndView home(@RequestParam("name") String Myname)
	{
		/*
		 * Here @RequestParam will get name from client and send this name to server and 
		 * server will send this data to view page
		 * */
		
		System.out.println(Myname +  "  Heyyyy welcome..... ");
		System.out.println("Hello Boot!!!");
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",Myname);
		mv.setViewName("home");
		return mv;
//		session.setAttribute("name", Myname);
		
		
		
		
		/*
		 * To move your jsp pages to another folder you can configure application.properties
		 * file in that case you have just add two lines for suffix and prefix and remove .jsp
		 * extension from return statement
		 * */
		
		/*
		 * Here above line will download home.jsp because when boot came into the picture
		 * it does not know what is .jsp so......
		 * 
		 * So to use jsp we have to use tomcat jasper just add dependencies in your 
		 * pom.xml file
		 *  
		 * */
		
	}
	
	@RequestMapping("alien")
	public ModelAndView alienshow(Alien alien)
	{
		ModelAndView mv=  new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("alien");
		System.out.println(alien.getAid() + " " + alien.getAname() + " " + alien.getAtech() +  " ");
		return mv;
	}
}
