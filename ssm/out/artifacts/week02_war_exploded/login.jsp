<%--
  Created by IntelliJ IDEA.
  User: zhuib
  Date: 2020/9/18
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="login" namespace="/action" >
    <s:textfield  name="username" label="用户名"/><br>
    <s:password name="password" label="密码"/><br>
    <s:submit value="登录"/><br>
</s:form>
</body>
</html>
