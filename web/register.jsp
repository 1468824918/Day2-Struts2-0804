<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/10/24
  Time: 上午9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="/model/register.action" method="post">
    用户名:<input type="text" name="username">
    <br>
    密码:<input type="password" name="password">
    <br>
    确认密码:<input type="password" name="affirm">
    <br>
    爱好:<input type="checkbox" name="hobbies" checked="checked" value="eat">吃饭
    <input type="checkbox" name="hobbies" value="sleep">睡觉
    <input type="checkbox" name="hobbies" value="study">打豆豆
    <br>
    性别: <br>
    <input type="radio" name="gender" value="male" checked="checked">男
    <input type="radio" name="gender" value="female" >女
    <br>
    email:
    <input type="text" name="email">
    <br>
    <input type="submit" value="注册">
</form>
</body>
</html>
