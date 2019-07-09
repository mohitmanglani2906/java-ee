
package com.mohit.filter;

import com.mohit.hibe.UserExits;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UpdateFilter implements Filter
{
    UserExits ue = new UserExits();
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException 
    {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
    {
        System.out.println("In Update Filter");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String phone_no = request.getParameter("phone_no");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        String regex = "(.*)@gmail.com";
        HttpServletResponse httpresponse = (HttpServletResponse)response;
        HttpServletRequest httprequest =  (HttpServletRequest)request;
        HttpSession httpsession = httprequest.getSession();
        
        if(fname.equals("") || lname.equals("") || email.equals("") || phone_no.equals("") || address.equals("") || gender.equals("") || password.equals("") || repassword.equals(""))
        {
            httpresponse.sendError(HttpServletResponse.SC_UNAUTHORIZED,"All The Fields Are Required!!");  
           
        }
        else if(!email.matches(regex))
        {
          
            httpresponse.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE,"You should have Gmail Account!!");
        }
        else if(phone_no.length()!=10)
        {
            httpresponse.sendError(HttpServletResponse. SC_LENGTH_REQUIRED,"Required Length For Phone No Is 10!!");
        }
        else if(!password.equals(repassword))
        {
            httpresponse.sendError(HttpServletResponse.SC_BAD_REQUEST,"Password and Repassword should Be Same!!");
        }
        
        else if(!httpsession.getAttribute("email").equals(email))
        {
            if(ue.userExitsOrNot(email))
            {
                httpresponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Already Exits!!! Try Another Mail Id!");
            }
            else
            {
                chain.doFilter(request,response);
            }
            
        }
        else
        {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy()
    {
        
    }
    
}
