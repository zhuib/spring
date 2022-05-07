<%--
  Created by IntelliJ IDEA.
  User: zhuib
  Date: 2020/9/18
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%=request.getParameter("username")%> 您好！
    您的登录密码是：<%=request.getParameter("password")%>,请保管好！
</body>
</html>
