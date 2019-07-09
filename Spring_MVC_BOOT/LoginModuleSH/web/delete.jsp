<%-- 
    Document   : delete
    Created on : Apr 4, 2019, 10:45:25 AM
    Author     : mohit2906
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
    </head>
    <body>
        <script>
           var v = confirm("Are you sure??");
           if(v)
           {
               window.location="delete.htm";
           }   
           else{
               window.location="LoggedIn.jsp";
           }
          
        </script>
    </body>
</html>
