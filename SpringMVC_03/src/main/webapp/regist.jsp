<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/14
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="/regist.action" method="post" enctype="multipart/form-data">
    用户名：<input type="text" name="sname"><br>
    密码：<input type="password" name="spwd"><br>
    上传照片：<input type="file" name="file"><br>
    <input type="submit" value="注册">
</form>

<form action="/test.action" method="post" enctype="multipart/form-data">
    上传照片：<input type="file" name="file"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
