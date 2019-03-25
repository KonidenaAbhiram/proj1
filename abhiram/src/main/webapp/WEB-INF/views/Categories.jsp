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
<sf:form action="addCat" method="post" modelAttribute="cat">
categoryId<sf:input path="categoryId"/>
categoryName<sf:input path="categoryName"/>
categoryDescription<sf:input path="categoryDescription"/>
<input type="submit" value="saveCategory"/>
</sf:form>

</body>
</html>