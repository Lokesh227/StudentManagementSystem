<html>
<head>
 <title>Login</title>
 <link href="./styles/style.css" type="text/css" rel="stylesheet">
 <style>
     @import url('https://fonts.googleapis.com/css2?family=Noto+Sans&display=swap');
   
body{
    margin: 0;
    padding: 0;
    font-family: sans-serif;
    background: #34495e;
}
.box h1 {
    color: white;
    text-transform: uppercase;
    font-weight: 500;
}
.box {
    width: 300px;
    padding: 40px;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%,-50%);
    background: #191919 ;
    text-align: center; 
    border-radius: 10%;
}
.box input[type="text"], .box input[type="password"] {
    border: 0;
    background: none;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #3498db;
    border-radius: 24px;
    padding: 14px 10px;
    width: 200px;
    color: white;
    transition: 0.4s;
    outline: none;
}
.box input[type="text"]:focus, .box input[type="password"]:focus {
        width: 280px;
        border-color: #2ecc71;

}
.box input[type="submit"] {
    border: 0;
    background: none;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #2ecc71;
    border-radius: 24px;
    padding: 14px 40px;
    color: white;
    outline: none;
    cursor: pointer;
    transition: 0.25s;
    
}
.box input[type="submit"]:hover {
    background-color: #2ecc71;

}
	.error {
		color:red;
	}
 	
 </style>
 </head>
<body>
	<form method="post" action="LoginController">
	  <class class="box">
            <h1>Login</h1>
            <input type="text"  name="name" placeholder="Name">
            <input type="password" name="password" placeholder="Password">
            <input type="submit" value="Login">
        </div>
	</form>
     <%
       String str = (String)session.getAttribute("error");
   
     %>
     <h5 class="error"><% if(str!= null)out.print(str); %></h5>
     <%
     session.removeAttribute("error");
     session.invalidate();     
     %>
     <script src="./js/app.js"></script>
</body>
</html>
