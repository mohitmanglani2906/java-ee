<%-- 
    Document   : addquestions
    Created on : Feb 25, 2019, 8:32:42 PM
    Author     : mohit2906
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            .input
            {
                width:50vw;
                padding:20px;
                border:none;
                border-bottom: 3px solid greenyellow;
            }
            
            #submitbutton
            {
                width:10vw;
                border:none;
                background-color: green;
                font-size: 25px;
                border-radius:50px;
                margin-top:10px; 
            }
            #submitbutton:hover{
                background-color: red;
            }
        </style>
        <title>Add Questions</title>
    </head>
    <body>
    <center><h1>Add Your Questions!!!1!</h1></center>
    <center><form action="saveQuestions.htm" method="get">
        <table>
            <tr>
                <td><input type="text" name="idquestion" placeholder="Enter Question id:" class="input"></td>
            </tr>
            
            <tr>
                <td><input type="text" name="question" placeholder="Enter Question" class="input"></td>
            </tr>
            
            <tr>
                <td><input type="text" name="option1" placeholder="Enter Option 1" class="input"></td>
            </tr>
            
            <tr>
                <td><input type="text" name="option2" placeholder="Enter Option 2" class="input"></td>
            </tr>
            
            <tr>
                <td><input type="text" name="option3" placeholder="Enter Option 3" class="input"></td>
            </tr>
            
             <tr>
                 <td><input type="text" name="option4" placeholder="Enter Option 4" class="input"></td>
            </tr>
            
            <tr>
                <td><input type="text" name="answer" placeholder="Enter Answer" class="input"></td>
            </tr>
            
            <tr>
                <td> <center><input type="submit" id="submitbutton" value="submit" class="input" style=""></center></td>
            </tr>
            
        </table>
        </form></center>
    </body>
</html>
