<%--
  Created by IntelliJ IDEA.
  User: zhuib
  Date: 2020/9/25
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${tip}
<s:form action="login" namespace="/lab03">
    <s:textfield name="username" label="用户名"/>
    <s:password name="password" label="密码"/>
    <s:submit value="登录"/>
</s:form>
</body>
</html>
