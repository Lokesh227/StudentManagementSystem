<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<script src="https://kit.fontawesome.com/1333e073f2.js" crossorigin="anonymous"></script>
    <style>
    @import url('https://fonts.googleapis.com/css2?family=Noto+Sans&display=swap');
    *{
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }
    body {
        font-family: 'Noto Sans', sans-serif;
        background-color: #4a9cfa;
        min-height: 100vh;
    }
     .title {
         text-align: center;
         font-size: 40px;
         margin-top: 2rem;
     }
     .container {
         display: flex;
         justify-content: center;
         align-items: center;

     }
    .box input {
        border: none;
        background: none;
        font-size: 1.3rem;
    }
    .box{
        text-decoration: none;
        color: black;
        cursor: pointer;
        font-size: 1.3rem;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
        margin: 20px;
        border-style: none;
        border-radius: 20px;
        background: rgba(224, 236, 255, 0.6);
        height: 200px;
        outline: none;
        width: 200px;     
     }
     i {
         margin-top: 10px;
         font-size: 30px;
     }
    .logout {
      position: absolute;
      top:50px;
      right: 10px;
      text-align: right;
    }
    .logout input{
    	  text-transform: uppercase;
          border:none;
          background-color:  rgba(224, 236, 255, 1);
          width: 100px;
          height: 30px;
          border-radius: 8px;
    }
    .box input {
    	 height: 200px;
         outline: none;
         width: 200px; 
    }
    .eye {
    	position:absolute !important;
    	top:52%;
    	left: 50%;
    	transform: translateX(-50%)
    }
    .rel input {
     
    }
    .rel {
    position: relative;
    }

    </style>
</head>
<body>
    <h6 class="title">Welcome</h6>
	    <form action="LogoutController">
	   <div class="logout"><input type="submit" value="logout"></div>
	   </form>
	   <div class="container">
        <form action="ViewController" method="get">
            <div class="rel"><input class="box " type="submit" value="View Students"><i class="eye far fa-eye"></i></div>  
        </form>
        <div><a  class="box" href="add.jsp">Add Student  <i class="far fa-plus-square"></i></a></div>
        </div>
        <div class="container">
        <div ><a class="box" href="modify.jsp">Modify Student<i class="fas fa-exchange-alt"></i></a></div>
        <div ><a class="box" href="delete.jsp">Delete Student<i class="fas fa-user-minus"></i></a></div>

    </div>
   <%
   response.setHeader("cache-control", "no-cache, no-store,must-revalidate");
   		if(session.getAttribute("username") == null){
   			response.sendRedirect("index.jsp");
   		}
   %>
   
</body>
</html>