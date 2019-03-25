<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script>
$(document).ready(function () {
      $('#dt13table').DataTable();
      $('.dataTables_length').addClass('bs-select');
    });
</script>
<jscore:forEach items= "${cartList}" var="cart">


${cart.cartId}
${cart.productName}
${cart.productPrice}
${cart.totalPrice }
${cart.quantity }


</jscore:forEach >
<table id="dt13table" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
 <thead>
   <tr>
     <th class="th-sm">ProductName

     </th>
     <th class="th-sm">ProductPrice

     </th>
     <th class="th-sm">TotalPrice

     </th>
     <th class="th-sm">Quantity

     </th>


   </tr>
 </thead>
 <tfoot>
   <tr>
     <th>ProductName
     </th>
     <th>ProductPrice
     </th>
     <th>TotalPrice
     </th>
     <th>Quantity
     </th>

   </tr>
 </tfoot>
</table>

</body>
</html>

</body>
</html>