<%--
  Created by IntelliJ IDEA.
  User: zhuib
  Date: 2020/10/16
  Time: 0:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>register</title>
</head>
<style type="text/css">
    .errorMessage{
        color: red;
    }
</style>
<body>
    <s:form action="upload" enctype="multipart/form-data" namespace="/lab05">
        <s:textfield name="username" label="用户名"/>
        <s:password name="password" label="密码"/>
        <s:password name="password2" label="确认密码"/>
        <s:textfield name="age" label="年龄"/>
        <s:textfield name="graduationDate" label="毕业时间"/>
        <s:file name = "photo" label="上传相片"/>
        <s:submit value="注册"/>
    </s:form>
</body>
</html>
