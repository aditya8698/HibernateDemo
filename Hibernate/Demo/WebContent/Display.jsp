<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
<br>
<h3>User Details</h3>
<br>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Country</th>
<th>Email</th>
</tr>
<c:forEach var="user" items="${usersList}">
<tr>
<td><c:out value="${user.id}"/></td>
<td><c:out value="${user.name }"/></td>
<td><c:out value="${user.country }"/></td>
<td><c:out value="${user.email }"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>