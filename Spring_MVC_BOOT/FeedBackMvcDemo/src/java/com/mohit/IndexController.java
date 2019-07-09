
package com.mohit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
    @RequestMapping("/add")
    public String show()
    {
        return "welcome";
    }
}
