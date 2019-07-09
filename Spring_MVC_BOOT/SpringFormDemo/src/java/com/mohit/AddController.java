
package com.mohit;

import com.service.GetResult;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller                 // This defines that java class is a servlet class
//@RequestMapping("/add")    // This is a url pattern that will be used for calling servlet
public class AddController
{
    @RequestMapping(value = "/add",method = RequestMethod.POST)   // this defines that we are using doGet method that we use in servlet i.e. public void doGet()
    public ModelAndView addtion(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response)
    {
        System.out.println("Hey I am in Add Controller Servlet");
//        int i = Integer.parseInt(request.getParameter("t1"));   // If you want to comment these two lines then you can use    
//        int j = Integer.parseInt(request.getParameter("t2"));   // @Requestparam("input type name in form") int i 
        int k = new GetResult().add(i, j);
        
        
        
        ModelAndView mv = new ModelAndView();   // This ModelAndView Class is used to pass the data from the servlet to jsp or html page 
        mv.setViewName("display");          // to get the view and data will be passed to this view
        mv.addObject("result",k);           // In this the data will be stored 
        
        
        return mv;
    }
}
