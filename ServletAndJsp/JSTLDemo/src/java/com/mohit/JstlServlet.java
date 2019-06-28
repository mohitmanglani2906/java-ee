
package com.mohit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class JstlServlet extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
    {
        try{
          //  String name="Mohit";
          //  req.setAttribute("label",name);\
          
            List<Student> values = Arrays.asList(new Student(1,"Mohit"),new Student(2,"navin"),new Student(3,"Kalin")); 
            
            req.setAttribute("student",values);
            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.forward(req,res);
        }
        catch(Exception e)
        {
            PrintWriter out = res.getWriter();
            out.println(e);
        }
      
      
    }
    
}
