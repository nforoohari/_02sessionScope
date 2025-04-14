<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Products</title>
</head>
<body>
<table>
    <tr>
        <td>Product Name</td>
    </tr>
    <c:forEach var="product" items="${shoppingCart.products}">
        <tr>
            <td>
                <c:out value="${product}"/>
            </td>
        </tr>
    </c:forEach>
</table>
<h1> ${nimaCart} </h1>
</body>
</html>
