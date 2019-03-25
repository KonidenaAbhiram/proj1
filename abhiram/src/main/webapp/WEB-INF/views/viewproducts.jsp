<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore" %>
   <%@ include file="guestheader.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
 <title>Bootstrap Example</title>
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

 <table class="table">
   <thead>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>productId</th>
<th>productName</th>
<th>productPrice</th>
<jscore:forEach items= "${pro}" var="p">
<tr>
<td>${p.productId}</td>
<td>${p.productName}</td>
<td>${p.productPrice}</td>
<td><a href="viewproducts?proid=${p.productId}">viewdetails</a></td>

<tr>

</jscore:forEach>
</table>
</body>
</html>