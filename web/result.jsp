<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="BIG5"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" http-equiv="Content-Type" content="text/html;charset=UTF-8">
</head>
<body>

<h1> Taiwan Stock Market Web </h1>
<%
  String ListedComp = (String) request.getAttribute("listedCompany");
  if (ListedComp.equals("2330")) {
      out.print("It's important so that I need to talk 3 times!");
      for (int i = 0; i <= 3; i ++) {
          out.print("<br> Listed Company: " + ListedComp);
      }
  } else {
      out.print("<br> Listed Company: " + ListedComp);
  }
%>

</body>
</html>