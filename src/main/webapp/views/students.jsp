<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<thead>
<tbody>
<tr>
<th>Student Id</th>
<th>Student Name</th>
<th>Student Roll Number</th>
<th>Student Email</th>
<th>Student Mobile Number</th>
<th>Student city</th>
<th>Student street</th>
</tr>
</thead>

<c:forEach items="${stud }" var="st">
<tr>
<td>${st.studentId }</td>
<td>${ st.studentName}</td>
<td>${ st.rollNum}</td>
<td>${ st.email}</td>
<td>${st.mobileNum}</td>
<td>${ st.add.city}</td>
<td>${st.add.street}</td>
</tr>
</c:forEach>
</tbody>

</table>

</body>
</html>