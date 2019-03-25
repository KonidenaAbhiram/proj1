<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@include file="adminheader.jsp" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>



</head>
<body>
<sf:form action="addproduct" method="post" modelAttribute="pr" enctype="multipart/form-data">

ProductId<sf:input path="productId"/>
ProductName<sf:input path="productName"/>
ProductPrice<sf:input path="productPrice"/>
<sf:input path="Image" type="file" />

<input type="submit"value="saveProduct"/>
</sf:form>

</body>
</html>