
package com.mohit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  // This defines your class as a servlet in com.mohit package 
@RequestMapping("/helloworld1") // This is a urlpatterns as we have used in servlet and jsp
public class HelloWorldController 
{
    @RequestMapping(method = RequestMethod.GET) // This defines which type of method it is either get or post......
    public String helloworld(ModelMap modelmap,HttpServletResponse response,HttpServletRequest request) throws IOException, ServletException   // This is a ModelMap to put your data to or to pass your data in the form of String variable
    {
        System.out.println("Oon Methodeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Hey</h1></body></html>");
        
        modelmap.addAttribute("message","Hey Whats fine!!!");
        return "index";
//        RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
//        response.setContentType("text/html");
//        rd.include(request,response);
//        
//        return "index";
    }
}
