<%-- 
    Document   : index
    Created on : Dec 30, 2018, 7:14:37 PM
    Author     : mohit2906
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style type="text/css">
        *{
            margin:0;
            padding:0;
        }
            #sub1{
                width:150px;
                height:50px;
                background-color: #f1f1f1;
                color:black;
                padding:8px;
                border:0px solid black;
                text-align: center;
                font-size: 20px;
                margin-left: 230px;
                margin-top: 20px;
                box-shadow: 2px 2px grey;
            }
            #sub1:hover{
                background-color: #ccc;
            }
            .d1{
                width:400px;
                height:150px;
                background-color: coral;
                border-radius: 5px;
                margin-left: 100px;
                margin-top: 20px;
                box-shadow: 2px 2px 2px 2px grey;
            }
            input{
                margin-left: 40px;
                margin-top: 20px;
                height: 25px;

            }
            p{
                margin-left: 40px;
                margin-top: 20px;
            }
        </style>
    </head>
    <h1 style="color:red;">Password and Username should contain more than one word</h1>
    <body>
        <form action="add" method="get">
            <div class="d1">
                <p style="float: left;"> Enter Name   :</p><input type="text" name="val1" placeholder="Enter name: " style="float: left;margin-left: 60px;"><br><br>
                 
                 <p style="float: left;">Enter Password:  </p> <input type="password" name="pwd" placeholder="Enter Password:" style="float: left;">
                 <br><br>
            </div>
           
            <input type="submit" id="sub1">

        </form>
    </body>
</html>
