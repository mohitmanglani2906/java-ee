

<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reservation Page</title>
    </head>
    <body>
    <center><h3>Railway Reservation Form</h3></center>
    <center><form:form action="submitForm" modelAttribute="reservation">
            First Name: <form:input path="firstName"></form:input>
            <br><br>
            
            Last Name:  <form:input path="lastName"></form:input>
            <br><br>
            
            Gender  : 
            Male: <form:radiobutton path="Gender" value="Male"></form:radiobutton>
            Female : <form:radiobutton path="Gender" value="Female"></form:radiobutton>
            <br><br>
            
            Meals:
            BreakFast<form:checkbox path="food" value="BreakFast"></form:checkbox>
            Lunch<form:checkbox path="food" value="Lunch"></form:checkbox>
            Dinner<form:checkbox path="food" value="Dinner"></form:checkbox>
            <br><br>
            
           Leaving City:<form:select path="cityFrom">
                <form:option value="Rajkot" label="Rajkot"></form:option>
                <form:option value="Ahemedabasd" label="Ahemedabad"></form:option>
                <form:option value="Surat" label="Surat"></form:option>
            </form:select>
           <br><br>
           
           Going City:<form:select path="cityTo">
                <form:option value="Rajkot" label="Rajkot"></form:option>
                <form:option value="Ahemedabasd" label="Ahemedabad"></form:option>
                <form:option value="Surat" label="Surat"></form:option>
            </form:select>
            
            <input type="submit" value="Submit">
        </form:form></center>
    </body>
</html>
