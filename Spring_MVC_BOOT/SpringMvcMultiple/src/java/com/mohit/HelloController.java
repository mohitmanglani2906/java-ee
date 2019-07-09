
package com.mohit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController 
{
  
    @RequestMapping(value="/sayhello.htm",method = RequestMethod.GET)
    public String redirect()
    {
        return "firsthello";
    }
    
    @RequestMapping("/helloagain")
    public String againcall()
    {
        return "secondhello";
    }
}
