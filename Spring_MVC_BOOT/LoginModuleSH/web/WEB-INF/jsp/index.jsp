<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
	<title>Welcome</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	 <style>
	 	*{
			margin: 0;
			padding: 0;
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
                        text-align: center;
		}
		#p1contact{
			margin-top: 50px;
			line-height: 1.5em;
			font-family: Playfair Display; 
		}
		#p2contact{
			margin-top: 20px;
			color:#607d8b;
			font-size: 18px;
			font-weight: bold;
			font-family: Times New Roman, Georgia, Serif;
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

		.login{
			
			margin-left:120px;
			width:82%;
			margin-top: 100px;
		}
		.logininput{
			border:none;
			border-bottom: 1px solid black;
			width:100%;
			height:20px;
			padding: 15px;
			font:inherit;
			margin-top: 20px;
		}

		#btnlogin {
			border:0px solid grey;
			width:100px;
			height:40px;
			padding: 10px;
			text-align: center;
			margin-bottom: 25px;
			background-color: #f1f1f1;
			color: #000;
			font-family: sans-serif;
			margin-left: 0px;
			margin-top: 30px;
		}
		#btnlogin:hover{
			background-color: #ccc;
			color:#000;
		}
		

	 </style>
</head>
<body>
	
	
	
	<div class="login">
		<form action="loginuser" method="get" >
			<h1 class="h1contact">Log In</h1>
			<input type="text" name="email"  placeholder="Email" required="true" class="logininput" >
			<input type="password" name="password" placeholder="Password" required="true" class="logininput">
			<input type="submit" name="submitlogin" id="btnlogin">
		</form>
	</div>

	<div class="contact" id="contact1">
		<hr style="width: 80%;margin-top:400px;margin-left: 120px;opacity: .2;">
		<div class="contact1">
			<h1 class="h1contact">Sign Up!!</h1>

				<form class="form1" action="save" style="margin-top: 30px;" method="get" enctype="multipart/form-data">
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
