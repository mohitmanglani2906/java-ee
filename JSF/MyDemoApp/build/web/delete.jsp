

<%@page import="org.apache.tomcat.util.http.Cookies"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
    </head>
     <body>
         <%
            String phone="";
            String pass="";
            
            Cookie cookies[] = request.getCookies();
            
           
            
//            out.println(cookies[0].getValue());
            
            out.println("<script>");
            out.println("  if(confirm('Are you sure?')){ window.location='deleteservlet' } else {window.location = 'welcome.xhtml'}");
            out.println("</script>");
                  
            
//            out.println("<script>"
//                    + "alert('hey')"
//                    + "</script>");
               
            
         
         %>
         
      
    </body>
</html>
