<%-- 
    Document   : File
    Created on : Dec 30, 2018, 9:46:40 PM
    Author     : mohit2906
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload Your Files</title>
    </head>
    <body>
        <form action="upload" method="post" enctype="multipart/form-data">
            <input type="file" name="file" multiple>
            <input type="submit">
        </form>
    </body>
</html>
