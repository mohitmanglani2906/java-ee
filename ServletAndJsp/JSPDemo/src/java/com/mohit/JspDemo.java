
package com.mohit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class JspDemo extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
                int i =Integer.parseInt(req.getParameter("num1"));
                int j= Integer.parseInt(req.getParameter("num2"));
                int k = i+j;
                
                PrintWriter out = res.getWriter();
                out.println("<html><body bgcolor='red'>");
                out.println("Output is : " + k);
                out.println("</body></html>");
                
    }
    
}
