<%-- 
    Document   : index
    Created on : Dec 29, 2018, 11:19:29 AM
    Author     : mohit2906
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
         <!--<div style="width: 500px; background-color: #000;height:300px ; color: white;">-->
           
            <% //  String str = (String)request.getAttribute("student"); 
//                  out.println(str);
            %>
               
                

                ${student}<br> 
                
                <hr><br>
                
                <c:forEach items="${student}" var="s">
                   ${s}<hr>
                    
                </c:forEach>
                   
                  
                
                
                
                
                
               
                <c:out value="Hello WOrld" />
                
                <%--<c:import url="https://www.google.com" />--%>
            
                
                 
        
           
       <!--</div>-->
       
        
         
      
      
      
    </body>
</html>
