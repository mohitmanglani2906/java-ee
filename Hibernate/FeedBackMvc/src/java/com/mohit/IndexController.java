
package com.mohit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController 
{
    @RequestMapping("/feed")
    public String show()
    {
        return "feedback";
    }
}
