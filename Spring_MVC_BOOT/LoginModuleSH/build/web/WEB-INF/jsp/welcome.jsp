<%-- 
    Document   : welcome
    Created on : Apr 2, 2019, 8:28:09 PM
    Author     : mohit2906
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Hey User, ${email}</h1>
        <%  response.sendRedirect("LoggedIn.jsp"); %>
        
        <%--<jsp:forward page="LoggedIn.jsp">--%>
            <%--<jsp:param name="email" value="${email}"/>--%>
        <%--</jsp:forward>--%>
    </body>
</html>
