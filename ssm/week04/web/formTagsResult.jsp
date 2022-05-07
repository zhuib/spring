<%--
  Created by IntelliJ IDEA.
  User: zhuib
  Date: 2020/10/10
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>姓名：<s:property value="username"/> </p>
    <p>密码：<s:property value="password"/> </p>
    <p>性别：<s:property value="gender"/> </p>
    <p>爱好的运动：<s:property value="sports"/> </p>
    <p><s:label label="喜爱的文学书" name="books"/> </p>
    <p><s:label label="留言" name="message"/> </p>
</body>
</html>
