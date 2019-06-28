
package com.mohit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddServelt extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
            try
            {
                int k=0;
                int i= Integer.parseInt(req.getParameter("num1"));
                int j= Integer.parseInt(req.getParameter("num2"));
                String pass = req.getParameter("pwd");
                
                
                Cookie cookie = new Cookie("p",pass); // cookie for password  in html form
                res.addCookie(cookie);
                Cookie c1 = new Cookie("i",i+"");
                res.addCookie(c1);
                k = i+j;
                HttpSession session = req.getSession();
                session.setAttribute("k", k); 
                res.sendRedirect("sq");
                
                
                
                // int k = i+j;
                
                //res.sendRedirect("sq?k=" + (i+j));  // Session Management // this will be shown in URl as we
                                               // are using doGet method //for one or two values
                
            }
            catch(Exception e)
            {
                PrintWriter out = res.getWriter();
                out.println(e.getMessage());  
            }
    }
}
