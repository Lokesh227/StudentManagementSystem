<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modify Student</title>
 	
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Noto+Sans&display=swap');
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            background-color: #8EC5FC;
            background-image: linear-gradient(62deg, #8EC5FC 0%, #e1c5fc 100%);
            font-family: 'Noto Sans', sans-serif;
            display: flex;
            justify-content: center;
            flex-direction: column;
            align-items: center;
            min-height: 100vh;
        }
        .title {
            text-transform: uppercase;
            font-size: 2rem;
            font-weight: 600;
            margin-bottom: 2rem;
        }
        .link {
            cursor: pointer;
            margin: 10px 0;
            display: flex;
            justify-content: center;
            align-items: center;
            font-weight: bold;
            width: 280px;
            height: 50px;
            text-transform: uppercase;
            font-size: 1rem;
            padding: 10px;
            background-color: violet;
        }
        a {
            text-decoration: none;
            color: black;
        }
        .input {
            font-size: 16px;
            padding: 10px;
            width: 250px;
            outline: none;
            border: none;
            border-radius: 5px;

        }
    </style>
</head>
<body>
	<%
		if(session.getAttribute("username") == null){
				response.sendRedirect("index.jsp");
	  } %>
    <div class="title">Modify Student</div>
    <form action="">
  <div class="links">
    <a href="updateName.html"><div class="link name">Update Name </div></a>
    <a href="updateEmail.html"><div class="link email">Update Email </div></a>
    <a href="updatePhone.html"><div class="link phone">Update Phone </div></a>
    <a href="updateDep.html"><div class="link department">Update Departmnent </div></a>
  </div>
 </form>
    
</body>
</html>