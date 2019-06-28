
/*
HttpServletconfig and HttpServletcontext
*/


package com.mohit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
        
      PrintWriter out = res.getWriter();
      
      res.setContentType("text/html");  // This is used to give a style to servlet page in Java code 
      
               
      out.println("Hi <hr>");
      
      ServletContext ctx = getServletContext(); //this will get all the contexts of web.xml file
                                                // specified by context-param
      String str=ctx.getInitParameter("name");
      out.println(str);
      out.println("<hr>");
      out.println(ctx.getInitParameter("Phone"));
      
      /*Here we will see servlet config */ /*This  is used for particular servlet*/
      
      ServletConfig sc =getServletConfig();
      String str1 = sc.getInitParameter("name");
      out.println("<hr> "+ str1);
              
      
      
      
    }
}
