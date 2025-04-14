<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add To Cart</title>
</head>
<body>
<form action="addToCart" method="post">
    product name : <input type="text" name="productName">
    <br>
    <input type="submit" value="Add To Cart">
    <br>
    <a href="/cart">Go to Basket</a>
</form>
</body>
</html>
