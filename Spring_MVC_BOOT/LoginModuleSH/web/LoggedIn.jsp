<%-- 
    Document   : LoggedIn
    Created on : Apr 3, 2019, 10:43:11 AM
    Author     : mohit2906
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Welcome</title>
	<style type="text/css">
            body{
               
            }
	*{
		margin:0;
		padding:0;
	}
		.header{
			width:98.7vw;
			height:10vh;
			background-color: #f1f1f1;
			box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);

		}
		.ul1{
			padding: 5px;
		}
		li
		{
			width:auto;
			float:right;
			padding:8px 16px;
			display: block;
			background-color:red;
			margin: 5px; 
			text-align: center;

		}
		a{
			color:white;
			text-decoration: none;
			font-family: sans-serif;

		}
                .logoutbtn:hover{
                    box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);
                }
                
                .middle
		{
                    height:80vh;
                                        
                }
		

		#updatesubmit
           {
                     width:225px;
                     height:50px;
                     background-color: blue;
                     border:1px solid black;
                     margin-left: 100vh;
/*                     margin-top: 50px; */
                     margin-top: 40px;
                     margin-bottom: 50px;
                     color:white;
                     font-size: 36px;
                     border:none;
                     padding: 8px 16px;
                     text-align: center;
            }
            
            #updatesubmit:hover{
                box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);
            }
            
            
		#deleteaccount
                 {
                     width:200px;
                     height:50px;
                     background-color: red;
                     border:1px solid black;
                     margin-left: 100vh;
/*                     margin-top: 200px; */
                     text-decoration: none;
                     color:white;
                     font-size: 25px;
                     border:none;
                     padding:8px 23px;
                     text-align: center;
                     margin-top: 150px;
                    
                 }
                 
                 #deleteaccount:hover{
                     box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);
                 }
                 .footer
                 {
                    width:98.7vw;
                    height:15vh;
                    background-color:black;
                 }
	</style>
</head>
<body>
    
    <%
               response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); // To Prevent Back Button
               response.setHeader("Pragma","no-cache");
               response.setHeader("Expires","0");
               HttpSession httpsession = request.getSession();
               
               if(httpsession.getAttribute("email")==null)
               {
                   response.sendRedirect("index.htm");
               }
        
    %>
	<div class="header">
		<ul class="ul1">
			<li class="logoutbtn"><a href="logout.htm">Logout</a></li>
                        <li class="logoutbtn"><a href="#"><% out.println(httpsession.getAttribute("email"));%></a></li>
                        
                </ul>
	</div>
                        
        <div class="middle">
            
		<form action="update.htm" method="post">
			<input type="submit" name="" value="Update" id="updatesubmit">
		</form>
		<a href="delete.jsp" id="deleteaccount">Delete Acccount</a>

	</div>    
                        
                        <div class="footer">
                            <center><h1 style="color:white;">Made In USA</h1></center>
                        </div>                

</body>
</html>
