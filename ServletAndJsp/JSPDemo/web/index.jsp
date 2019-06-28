
<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp" %>
 <%@ include file="home.jsp" %><!--This will be called first as we have included in header of the current file-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index jsp</title>
    </head>
    <body bgcolor="#ccc" style="color:white;">
         <%  // delimeter // scriplet
                int i =Integer.parseInt(request.getParameter("num1"));  //implicit object i.e request
                int j= Integer.parseInt(request.getParameter("num2"));
                int k = i+j;
                out.println("Output is : " + k);
                
          %>      
                
          <%--<%@ include file="home.jsp" %>--%><!--You can call this file here but once in a JSP of the current file-->
          
    </body>
</html>
