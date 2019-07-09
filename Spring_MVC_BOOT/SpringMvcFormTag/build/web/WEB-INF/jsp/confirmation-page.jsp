

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation.........</title>
    </head>
    <body>
        <h1>Hello ${reservation.firstName}</h1>
        <p>Your Registration is Confirmed</p>
        
        FirstName : ${reservation.firstName} <br>
        LastName  : ${reservation.lastName}  <br>
        Gender  : ${reservation.gender}<br><br>
        
        Meals:
        
        <ul style="display:block;">
            <c:forEach var="meal" items="${reservation.food}">
                <li style="display:inline-block">${meal}<span style="color:red;">&nbsp;,</span></li>
            </c:forEach>
        </ul> <br><br>
        
        Leaving City:  ${reservation.cityFrom}<br>
        Going City: ${reservation.cityTo}
       
    </body>
</html>
