 


<%@page import="java.util.Scanner"%>  <!--This is called directive statement-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Jsp</title>
    </head>
    <body style="color:black;">
        <%!   // this is declarative which is instance variable in servlet
            int coeff=3;
            Scanner s;
          %>
          
          
        <h1>Hello World!</h1>
        <%
            out.println(85);
         %>
         <hr>
         <% out.println("IP Address :  " + request.getRemoteAddr()); 
            
         %>
         
         <hr>
         <%= (new java.util.Date()).toLocaleString() %>
         <hr>
         <p id="demo"> </p> 
         <script type="text/javascript">
             function myFunction(p)
             {
                 
                 return p; 
             }
             document.getElementById("demo").innerHTML = myFunction(<%= coeff %>);
             
             </script>
             
             
         
    </body>
</html>
