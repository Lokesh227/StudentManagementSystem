<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "java.util.*,com.loki.model.Student" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	 @import url('https://fonts.googleapis.com/css2?family=Noto+Sans&display=swap');
    
    body {
        font-family: 'Noto Sans', sans-serif;
       background-image: linear-gradient(to right,#29323c, #485563);
        min-height: 100vh;
        display: flex;
        flex-direction: column;
        padding: 10px 8%;
    }
      .title {
         color : white;
         text-align: center;
         font-size: 40px;
         margin-top: 1rem;
     }
    
    table {
     color : white;
     margin-top: 2rem;
    }
   table,
      th,
      td {
        padding: 10px 20px;
        border: 2px solid #999;
        border-collapse: collapse;
      }
    
</style>
</head>
<body>
   <%
	if(session.getAttribute("username") == null){
			response.sendRedirect("index.jsp");
  }
   
     List<Student> list =(ArrayList<Student>)session.getAttribute("students");
    request.setAttribute("list", list);
   %>
   <div class="title">Students</div>
   <table cellpadding="10px" cellspacing="10px">
   <thead>
   <td>Roll no</td>
   <td>Name</td>
   <td>Email Id</td>
   <td>Phone No</td>
   <td>Department</td> 
   </thead>
   <tbody> 
        <c:forEach var="student" items="${requestScope.list}">
         <tr>  
    		<td><c:out value="${student.getRollNo()}"/> </td>
    		<td><c:out value="${student.getName()}"/> </td>
    		<td><c:out value="${student.getEmail()}"/> </td>
    		<td><c:out value="${student.getPhone()}"/> </td>
    		<td><c:out value="${student.getDepartment()}"/> </td>
    		</tr>
        </c:forEach>
        
    
   </tbody>
    </table>
   
</body>
</html>