<%--
  Created by IntelliJ IDEA.
  User: alw
  Date: 2020/8/9
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>向Session中取数据</h1>
<%out.print(session.getAttribute("animal"));%>
</body>
</html>
