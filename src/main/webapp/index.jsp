<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Welcome to my web</title>
    <link href="WEB-INF/css/book.css" rel="stylesheet"/>
</head>
<body>
<div>
    <button type="submit" onclick="toLogin()">登录</button>
    <button type="submit" onclick="getUserInfo()">查询用户信息</button>
</div>
</body>
<script>
    function toLogin() {
        window.location.href='http://192.168.20.171:8080/api/login';
    }
    function getUserInfo() {
        window.location.href='http://192.168.20.171:8080/api/user/info';
    }
</script>
</html>
