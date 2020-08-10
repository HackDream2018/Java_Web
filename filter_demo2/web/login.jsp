<%--
  Created by IntelliJ IDEA.
  User: alw
  Date: 2020/8/10
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <title>登录页面</title>
  </head>
  <body>
  <form action="<c:url value='/login'/>" method="post">
    用户名: <input type="text" name="username">
    <input type="submit" value="登录">
  </form>
  </body>
</html>
