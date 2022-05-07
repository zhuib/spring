<%--
  Created by IntelliJ IDEA.
  User: zhuib
  Date: 2020/10/10
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3 style="color: red" >
        <s:fielderror>
            　　 <s:param>username</s:param>
        </s:fielderror>
    </h3>
    <s:form action="formTagsDemo" namespace="/form">
        <s:textfield name="username" label="姓名"/>
        <s:password name="password" label="密码"/>
        <s:radio name="gender" list="{'男','女'}" label="性别"/>
        <s:checkboxlist name="sports" list="#{'wq':'网球','ppq':'乒乓球','lq':'篮球','yy':'游泳','pb':'跑步'}" listKey="key" listValue="value" value="{'wq','ppq','pb'}" label="爱好的运动"/>
        <s:select name="books" list="{'小说','诗歌','古典文学','现代文学'}" value="{'小说','现代文学'}" label="爱好文学书" size="5" multiple="true" headerKey="-1" headerValue="-------请选择喜欢的书籍--------" emptyOption="true"/>
        <s:textarea name="message" rows="6" cols="45" label="留言"/>
        <s:submit value="提交表单"/>
        <s:reset value="重置表单"/>

    </s:form>
</body>
</html>
