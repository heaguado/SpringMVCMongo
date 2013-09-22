<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<form:form commandName="user" action="showMessage" method="POST">
			
			<table>
			
			<tr>
			<td>
				<c:out value="Name: "/> <form:input path="name" title="Name"/>
			</td>
			</tr>
			
			<tr>
			<td>
			<c:out value="Surname: "/> <form:input path="surname" title="Surname"/>
			</td>
			</tr>
			
			<tr>
			<td>
				<c:out value="Age: "/> <form:input path="age" title="Age"/>
			</td>
			</tr>
			
			<tr>
				<td>
					<input type="submit" value="Send"/>
				</td>
			</tr>
			</table>
		</form:form>
	
		<%-- <c:url value="/showMessage.html" var="messageUrl" /> --%>
		<%-- <a href="${messageUrl}">Click to enter</a> --%>
	</body>
</html>
