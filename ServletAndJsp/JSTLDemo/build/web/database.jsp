
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Database</title>
        <style>
            body{
                background-color: #ccc;
                font-family:arial;
            }
            th,td{
                border-bottom:1px solid black;
                border-right: 1px solid black;
                text-align: left;
                padding:5px;
            }
            #sign1{
                width:150px;
            }
            table{
                width:50%;
                height:auto;
                border-spacing: 0px;
                background-color: white;
            }
        </style>
    </head>
    <body>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/student" user="root" password="" />
        <sql:query var="rs" dataSource="${db}">select * from student_info </sql:query>

        <% int i=0;%>
        <table style="border:1px solid black; " align="center" >
            <h1 style="text-align: center;">Attendance Sheet</h1>
            <tr>
                <th>Sr. no</th>
                <th>Fname</th>
                <th>Lname</th>
                <th>Roll no</th>
                <th id="sign1">Sign</th>
            </tr>
        <c:forEach items="${rs.rows}" var="result">
            <tr>
                <td><% out.println(++i); %> </td>
                <td><c:out value="${result.fname}"></c:out></td>  
                <td><c:out value="${result.lname}"></c:out></td>  
                <td><c:out value="${result.roll_no}"></c:out></td>
                <td></td>
            </tr>
           
        </c:forEach>
        </table>

    </body>
</html>
