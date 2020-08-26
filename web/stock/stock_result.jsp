<%@ page language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Taiwan Stock Market</title>
</head>
<body>

<h1 align="center"> Stock Data Search Result </h1>
<%
    String data = request.getAttribute("stock_market_data");
    out.print(data)
%>

</body>
</html>