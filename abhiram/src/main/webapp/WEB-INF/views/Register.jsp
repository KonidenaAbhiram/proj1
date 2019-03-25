<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form action="addUser" method="post" modelAttribute="user">
Username<sf:input path="username"/>
Email<sf:input path="email"/>
Password<sf:input path="password"/>
Mobile<sf:input path="mobile"/>
Role<sf:input path="role"/>
Enabled<sf:input path= "enabled"/>
<input type="submit" value="AddUser">
</sf:form>
</body>
</html>
