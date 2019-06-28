<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Info</title>
</head>
<body>
<% String name =request.getParameter("name");
        long enroll =Long.parseLong(request.getParameter("enroll"));
        int s1=Integer.parseInt(request.getParameter("sub1"));
        int s2=Integer.parseInt(request.getParameter("sub2"));
        int s3=Integer.parseInt(request.getParameter("sub3"));
        float per=(s1+s2+s3)/3.0F;
%>
<h3> Welcome <%=name%> </h3>
    <table border="1" style="border-collapse: collapse">
<tr>
    <td>Name</td>
    <td><%=name%></td>
</tr>
<tr>
    <td>Enrollment No.</td>
    <td><%=enroll%></td>
</tr>

<tr>
    <td>Subject 1</td>
    <td><%=s1%></td>
</tr>
<tr>
    <td>Subject 2</td>
    <td><%=s2%></td>
</tr>
<tr>
    <td>Subject 3</td>
    <td><%=s3%></td>
</tr>
<tr>
    <td>Percentage</td>
    <td><%=per%></td>
</tr>
</table>
</body>
</html>