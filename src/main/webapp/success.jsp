<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
<style>
   @import url('https://fonts.googleapis.com/css2?family=Noto+Sans&display=swap');
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Noto Sans', sans-serif;
            background-color: #8EC5FC;
        }
 .message {
  	font-size: 36px;
  	font-weight: bold;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%,-50%);
     }

</style>
</head>
<body>
  <div class="message">
   <%
   		String str = (String)session.getAttribute("message");
       if(str!= null)out.print(str);
   %>
  </div>
  
</body>
</html>