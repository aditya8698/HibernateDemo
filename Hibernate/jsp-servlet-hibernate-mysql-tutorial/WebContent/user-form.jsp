<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Details</title>
</head>
<body>
	<center>
		<h1>User Details</h1>
		<h3>
			<a href="list">List All Users</a>
		</h3>
	</center>
	<div align="center">
		<c:if test="${user != null}">
			<form action="update" method="post">
		</c:if>
		<c:if test="${user == null}">
			<form action="insert" method="post">
		</c:if>
		<table border="1" cellpadding="5">
			<caption>
				<h2>
					<c:if test="${user != null}">
            			Edit User
            		</c:if>
					<c:if test="${user == null}">
            			Add New User
            		</c:if>
				</h2>
			</caption>
			<c:if test="${user != null}">
				<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
			</c:if>
			<tr>
				<th>User Name:</th>
				<td><input type="text" name="name"
					value="<c:out value='${user.name}' />" /></td>
			</tr>
			<tr>
				<th>User Email:</th>
				<td><input type="text" name="email"
					value="<c:out value='${user.email}' />" /></td>
			</tr>
			<tr>
				<th>Country:</th>
				<td><input type="text" name="country"
					value="<c:out value='${user.country}' />" /></td>
			</tr>
		</table>
		<input type="submit" value="Save" />
		</form>
	</div>
</body>
</html>
