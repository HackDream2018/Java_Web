<%--
  Created by IntelliJ IDEA.
  User: alw
  Date: 2020/8/10
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <title>展示IP统计访问量</title>
  </head>
  <body>
    <table>
      <tr>
        <th>IP</th>
        <th>访问次数</th>
      </tr>

      <c:forEach items="${applicationScope.map}" var="entry">
        <tr>
          <td>${entry.key}</td>
          <td>${entry.value}</td>
        </tr>
      </c:forEach>

    </table>
  </body>
</html>
