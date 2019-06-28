
package com.mohit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/add")
public class Check implements Filter
{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException 
    {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
    {
        String name =request.getParameter("val1");
        String pass=request.getParameter("pwd");
        PrintWriter out = response.getWriter();
        if(name.length()>1 && pass.length()>1)
        {
            chain.doFilter(request, response);
        }
        else
        {
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");  
                rd.forward(request,response);
        }            
    }

    @Override
    public void destroy() {
        
    }
    
}
