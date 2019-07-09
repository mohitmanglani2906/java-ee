
package com.mohit;

import com.dao.DeleteData;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deleteservlet", urlPatterns = {"/deleteservlet"})
public class DeleteServlet extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    {
           String phone="";
           
           Cookie cookies[] = request.getCookies();
           phone = cookies[0].getValue();
           
           DeleteData deletedata = new DeleteData();
           
           try
           {
               if(deletedata.deleteAccount(phone)==1)
               {
                   response.sendRedirect("index.xhtml?faces-redirect=true");
               }
               else
               {
                   response.sendRedirect("welcome.xhtml?faces-redirect=true");
               }
           }
           
           catch(Exception e)
           {
               System.out.println(e.getMessage());
           }
           System.out.println("In Delete Servlet class");
           System.out.println(phone);
           
           
           
    }
}
