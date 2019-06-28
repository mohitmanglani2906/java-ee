
package com.mohit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SqServelt extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
        
        String s="";
        String s1 = "";
        Cookie cookies[]=req.getCookies();
        HttpSession session = req.getSession();   
        int k= (int)session.getAttribute("k");
        
            
            
        for(Cookie c : cookies)
        { // getcookies array by name from requesting values
            if(c.equals("p"))
            {
                 s = c.getValue();
                 System.out.println("Password is : " + s);
            }
            else
            {
                s1=c.getValue();
                System.out.println("I is : " + s1);
            }
        }
       
    

            k = k*k;
            PrintWriter out = res.getWriter();
           
            out.println("Response is: " +  k + " Password : " + s);
            out.println("I is : " + s1);
           
        
           
            System.out.println("Sq Called" + " password : " + s); // Here compiler will not print password in console as it provides
                                                                    // that much security
            System.out.println("I is : " + s1);                                                                       
        
    }
}
