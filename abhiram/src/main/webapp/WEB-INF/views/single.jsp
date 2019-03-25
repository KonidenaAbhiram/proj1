<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>${pro.productId}</p>
<p>${pro.productName}</p>
<p>${pro.productPrice}</p>
<td><a href="cart?proid=${pro.productId}">addtocart</a></td>
</body>
</html>