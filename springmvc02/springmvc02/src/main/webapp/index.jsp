<%--
  Created by IntelliJ IDEA.
  User: zhuib
  Date: 2020/7/5
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="user/testString">testString</a>
<%--    传统的方法--%>
<form action="user/fileUpload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br>
    <input type="submit" value="上传"/>

</form>
<%--    springmvc上传方法--%>
<form action="user/fileUpload2" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br>
    <input type="submit" value="上传"/>
</form>

<%--    springmvc跨服器文件上传方法--%>
<form action="user/fileUpload3" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br>
    <input type="submit" value="上传"/>
</form>
</body>
</html>
