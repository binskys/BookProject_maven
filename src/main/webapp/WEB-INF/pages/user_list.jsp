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
    <title>用户列表</title>
</head>
<body>
<div id="div_css" class="div_login_css">
    <form action="/api/user/list" id="from_user_info" method="get">

        <button type="submit" form="from_user_info">查询用户列表</button>
    </form>
</div>
</body>
</html>
