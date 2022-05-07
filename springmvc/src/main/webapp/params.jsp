<%--
  Created by IntelliJ IDEA.
  User: zhuib
  Date: 2020/7/5
  Time: 0:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    请求参数绑定
        把数据绑定到Account类中--%>
<%--    <a href="param/testParam?username=haha&passwd=123">请求参数绑定</a>--%>
<%--    <form action="param/saveAccount" method="post"><br>
        姓名：<input type="text" name="username"/><br>
        密码：<input type="text" name="password"/><br>
        存款：<input type="text" name="money"/><br>
&lt;%&ndash;        封装的数据是javabean中含有引用类型 则需使用引用的名字点属性&ndash;%&gt;
        用户姓名：<input type="text" name="user.uname"/><br>
        用户年龄：<input type="text" name="user.age"/><br>
        <input type="submit" value="提交"/>
    </form>--%>
<%--把数据封装到Account类中，类中存在list和map 的集合--%>
<%--<form action="param/saveAccount" method="post"><br>
    姓名：<input type="text" name="username"/><br>
    密码：<input type="text" name="password"/><br>
    存款：<input type="text" name="money"/><br>
    &lt;%&ndash;        封装的数据是javabean中含有引用类型 则需使用引用的名字点属性&ndash;%&gt;
&lt;%&ndash;    将数据封装到List中&ndash;%&gt;
    用户姓名：<input type="text" name="list[0].uname"/><br>
    用户年龄：<input type="text" name="list[0].age"/><br>
&lt;%&ndash;将数据封装到map中&ndash;%&gt;
    用户姓名：<input type="text" name="map['one'].uname"/><br>
    用户年龄：<input type="text" name="map['one'].age"/><br>
    <input type="submit" value="提交"/>
</form>--%>
<%--自定义类型转换器--%>
<%--<form action="param/saveUser" method="post">

    用户姓名：<input type="text" name="uname"/><br>
    用户年龄：<input type="text" name="age"/><br>
    用户生日：<input type="text" name="date"/><br>

    <input type="submit" value="提交"/>
</form>--%>

<a href="param/testServlet">原生Servlet</a>
</body>
</html>
