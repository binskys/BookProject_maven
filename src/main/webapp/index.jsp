<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> 登录</title>
    <link href="WEB-INF/css/book.css" rel="stylesheet"/>
</head>
<body>
<div>
    <button type="submit" onclick="toLogin()">登录</button>
</div>
</body>
<script>
    function toLogin() {
        window.location.href='http://192.168.20.171:8080/api/login';
    }
</script>
</html>
