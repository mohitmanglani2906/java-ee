
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



public class LoginFilter implements Filter 
{
     UserExits ue = new UserExits();
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
    {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        HttpServletResponse httpresponse = (HttpServletResponse)response;
        HttpServletRequest httprequest = (HttpServletRequest)request;
        
        if(email.equals("") || password.equals(""))
        {
            httpresponse.sendError(HttpServletResponse.SC_UNAUTHORIZED,"UnAuthorized User!!!");  
            return;  // This is essential else it will give you IllegalStartException 
        }
        System.out.println("In Filter login");
        
        if(ue.checkEmailAndPassword(email, password))
        {
            HttpSession httpsession = httprequest.getSession();
            httpsession.setAttribute("email",email);
            chain.doFilter(request, response);
        }
        else
        {
            httpresponse.sendError(HttpServletResponse.SC_NOT_FOUND,"User Not Found!!!");  
        }
    }

    @Override
    public void destroy() {
        
    }
    
}
