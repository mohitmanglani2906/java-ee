
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="str" value="Hi I am Mohit Manglani" />
        <c:forEach items="${fun:split(str,' ')}"  var="s" >
            <br>
            ${s}
        </c:forEach>
            
            <br>
            length : ${fun:length(str)}
            <br>
            
            index: ${fun:indexOf(str,"Mohit")}
            <br>
            
            is there: ${fun:contains(str,"Mohit")}
            <br>
            
            <c:if test="${fun:contains(str,'Mohit')}">
                ${"No there"}
            </c:if>
            <br>
            
            <c:if test="${fun:endsWith(str,'Manglani')}">
                ${"yes there"}
            </c:if>
            <br>
            
            ${fun:toLowerCase(str)}
            <br>
            
            ${fun:toUpperCase(str)}
            
    </body>
</html>
