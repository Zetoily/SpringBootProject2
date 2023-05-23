<%@ page import="logic.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Miron
  Date: 30.04.2023
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Show cart</title>
</head>
<body>

<%@page import="logic.Cart" %>>

<%Cart cart = (Cart) session.getAttribute("cart");%>

<p>Name: <%=cart.getName()%></p>
<p>Quantity: <%=cart.getQuantity()%></p>
</body>
</html>
