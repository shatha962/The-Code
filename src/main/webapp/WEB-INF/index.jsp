<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/5/2021
  Time: 4:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>The Code</title>
</head>
<body>
<c:out value="${error}"/>
<h1> What is the code?</h1>
<form action="/checkCode" method="post">
    <input type="text" name="code">
    <input type="submit" value="Try Code">
</form>
</body>
</html>
