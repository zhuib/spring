<%--
  Created by IntelliJ IDEA.
  User: zhuib
  Date: 2020/7/5
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    常用注解--%>
    <a href="anno/testRequestParam?name=hah">RequestParam</a>

    <form action="anno/testRequestBody" method="post">
        用户姓名：<input type="text" name="username"/><br>
        用户年龄：<input type="text" name="age"/><br>
        <input type="submit" value="提交"/>
</form>

    <a href="anno/testPathVariable/12">PathVariable</a> <br>
    <a href="anno/testRequestHeader">RequestHeader</a> <br>
    <a href="anno/testCookieValue">CookieValue</a> <br>

    <form action="anno/testModelAttribute" method="post">
        用户姓名：<input type="text" name="uname"/><br>
        用户年龄：<input type="text" name="age"/><br>
        <input type="submit" value="提交"/>
</form>

<a href="anno/testSessionAttribute">SessionAttribute</a> <br>
<a href="anno/getSessionAttribute">getSessionAttribute</a> <br>
<a href="anno/delSessionAttribute">delSessionAttribute</a> <br>
</body>
</html>
