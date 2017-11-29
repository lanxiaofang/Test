<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/14
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/login.action" method="post">
    用户名：<input type="text"  name="sname">
    密码：<input type="password" name="spwd">
    <input type="submit" value="登录">
</form>
</body>
</html>
