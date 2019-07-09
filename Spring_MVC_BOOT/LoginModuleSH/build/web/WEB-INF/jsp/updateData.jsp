<%-- 
    Document   : updateData
    Created on : Apr 3, 2019, 12:58:37 PM
    Author     : mohit2906
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
        <style>
             #previous
             {
                text-decoration: none;
                width:100px;
                height:20px;
                padding: 20px;
                margin:10px;                
                color:black;
                background-color: #ccc;
                float:right;
                text-align: center;
            }
            
            .contact{
			width:98.7vw;
			height:115vh;
			
		}
            
            .contact1{
			margin-top: -300px;	
			margin-left: 120px;
			width:80%;
			height:auto;
			
			
		}
		.h1contact{
			letter-spacing: 5px;
			font-family: Playfair Display;
			font-weight: 400;
			font-size: 36px;
		}
            .contactform{

			border:none;
			border-bottom: 1px solid black;
			width:100%;
			height:20px;
			padding: 15px;
			font:inherit;

		}
                
                #btn1{
			margin-top: 30px; 
			border:0px solid grey;
			
			height:40px;
			padding: 10px;
			text-align: center;
			margin-bottom: 25px;
			background-color: #f1f1f1;
			color: #000;
			font-family: sans-serif;
		}
		#btn1:hover{
			background-color: #ccc;
			color:#000;
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
        
        
        
        <a href="LoggedIn.jsp" id="previous">Previous</a>
        
        <h1 class="h1contact">Update!!</h1>
        <div class="contact" id="contact1" style="margin-top: 210px;">
        <div class="contact1">
				<form class="form1" action="update" style="margin-top: 30px;" method="get" enctype="multipart/form-data">
					<input type="text" name="fname" placeholder="First Name" required="" class="contactform" >
					<input type="text" name="lname" placeholder="Last Name" required="" class="contactform">
					<input type="Email" name="email" placeholder="Email" required="" class="contactform" style="margin-top: 10px; ">
					<input type="text" name="phone_no" placeholder="Mobile no" required="" class="contactform" value="" style="margin-top: 10px;">

					<input type="textarea" name="address" placeholder="Enter your Address" class="contactform" style="margin-top: 10px;">
					
					<select name="gender" style="width:500px;margin-top: 10px;border:none;height:40px;border-bottom: 1px solid black; font:inherit;font:inherit;padding: 10px;">
						<option value="">Gender</option>
						<option value="Male">Male</option>
						<option value="Female">Female</option>
						<option value="Not Specified!">Don't want to Say!!</option>
					</select>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="password" name="password" placeholder="Password" required="true"  class="contactform" style="margin-top: 10px;">
					<input type="password" name="repassword" placeholder="Confirm Password" required="true"  class="contactform" style="margin-top: 10px;">
					
					
					<input type="submit" name="submit" placeholder="" value="SUBMIT" placeholder="contactform" id="btn1" style="width:100px;">
				</form>
        </div> 
        </div>
    </body>
</html>
