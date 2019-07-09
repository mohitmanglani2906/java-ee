<%-- 
    Document   : display
    Created on : Feb 14, 2019, 10:07:29 PM
    Author     : mohit2906
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display</title>
    </head>
    <body>
        <h1>Result is : <%= request.getAttribute("result")%></h1>
        <h1>Result is : ${result}</h1>
    </body>
</html>
