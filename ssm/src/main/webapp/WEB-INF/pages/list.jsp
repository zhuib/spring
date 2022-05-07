<%--
  Created by IntelliJ IDEA.
  User: zhuib
  Date: 2020/7/7
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>表现层，查询所有账户</h3>
<%--    ${list}--%>
    <c:forEach items="${list}" var="account">
        ${account.name}<br>
<%--        ${account.money}<br>--%>
    </c:forEach>
</body>
</html>
