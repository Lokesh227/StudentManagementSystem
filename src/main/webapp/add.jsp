<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Student</title>
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
            margin-bottom: 1.5rem;
        }
        .form {
            display: flex;
        }
        .submit {
            text-align: center;
        }
        .labels > *, .inputs > * {
            margin: 15px 0;
            font-size: 1.25rem;
            font-weight: bold;
        }
        .labels .label {
            height: 35px;
            margin-right: 15px;
        }
        .inp input {
            height: 35px;
            font-size: 17px;
            border-radius: 5px;
            outline: none;
            border: none;
            box-shadow: rgba(50, 50, 93, 0.25) 0px 13px 27px -5px, rgba(0, 0, 0, 0.3) 0px 8px 16px -8px;          
             padding-left: 8px;
        }
        .submit input{
            margin-top: 1rem;
            border: none;
            width: 200px;
            border-radius: 8px;
            font-size: 1rem;
            font-weight: 600;
            cursor: pointer;
            color: white;
            text-transform: uppercase;
            background-color: #8103f796;
            padding: 15px;
        }

    </style>
</head>
<body>

	 <%
		if(session.getAttribute("username") == null){
				response.sendRedirect("index.jsp");
	  } %>
     <div class="title">Add Student</div>
     <form action="AddStudentController">
       <div class="form">
       <div class="labels">
           <div class="label">Roll No</div>
           <div class="label">Name</div>
           <div class="label">Email</div>
           <div class="label">Phone No</div>
           <div class="label">Department</div>
       </div>
       <div class="inputs">
       <div class="inp">: <input type="text" name="rollno"></div>
       <div class="inp">: <input type="text" name="name"></div>
       <div class="inp">: <input type="text" name="email"></div>
       <div class="inp">: <input type="text" name="phone"></div>
       <div class="inp">: <input type="text" name="department"></div>
       </div>
       </div>
       <div class="submit"><input type ="submit" value="ADD"></div>
     </form>


</body>
</html>