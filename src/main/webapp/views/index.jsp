<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="register" modelAttribute="student" method="POST">
      <table>
     <tr>
				<td>Student IId</td>
				<td><form:input path="studentId"/></td>
      </tr>
      
       <tr>
      <td>Student Name</td>
      <td><form:input path="studentName"/></td>
      </tr>
     
      <tr>
      <td>Student Roll Num</td>
      <td><form:input path="rollNum"/></td>
      </tr>
     
      <tr>
      <td>Student Email</td>
      <td><form:input path="email"/></td>
      </tr>
     
      <tr>
      <td>Student Mobile Number</td>
      <td><form:input path="mobileNum"/></td>
      </tr>
        <tr>
      <td>city</td>
      <td><form:input path="add.city"/></td>
      </tr>
     
      <tr>
      <td>street</td>
      <td><form:input path="add.street"/></td>
      </tr>
      
     
      <tr>
      <td></td>
      <td><input type="submit" value="Register"/></td>
      </tr>




</table>
</form:form>

</body>
</html>