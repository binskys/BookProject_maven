<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/12
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<div id="div_css" class="div_login_css">
    <form action="/api/user/info" id="from_user_info" method="post">
        用户名：<input type="text" name="account" id="account"/>
        <dr/>

        <button type="submit" form="from_user_info">查询用户信息</button>
    </form>
</div>
</body>
</html>
