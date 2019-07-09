
package com.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

@Controller
//@RequestMapping("/add")
public class AddController
{
    @RequestMapping(value="/add",method = RequestMethod.GET)
    public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",i+j);
        return mv;
    }
    
    @RequestMapping("/index.htm")
    public String show()
    {
        return "index";
    }
}
