<%--
  Created by IntelliJ IDEA.
  User: zhuib
  Date: 2020/10/16
  Time: 0:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
<%--    <h3>文件上传成功！</h3>--%>
    <h3>注册成功！你上传的照片是：
        <s:property value="photoFileName"/>
    </h3>
<%--    <h3>上传文件的类型为：<s:property value="uploadContentType"/> </h3>--%>
</body>
</html>
