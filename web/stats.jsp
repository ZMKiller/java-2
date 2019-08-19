<%--
  Created by IntelliJ IDEA.
  User: zmkil
  Date: 19.08.2019
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stats</title>
</head>
<body>
<%
    String name = (String) request.getAttribute("user_name");
    String lastName = (String) request.getAttribute("user_lastname");
    Integer cat = (Integer) request.getAttribute("user_cat");
    Integer dog = (Integer) request.getAttribute("user_dog");
    out.print(name + " ");
    out.print(lastName + ", ");
    out.print("Like : " + "<br>");
    out.print("Cat : " +cat+ "<br>");
    out.print("Dog : " +dog+ "<br>");
%>

</body>
</html>
