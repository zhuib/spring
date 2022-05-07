<%--
  Created by IntelliJ IDEA.
  User: zhuib
  Date: 2020/9/18
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>${name}, 您好！欢迎光临！</h3>
</body>
</html>
