<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> 登录</title>
    <link href="css/book.css" rel="stylesheet"/>
</head>
<body>
<%--http://localhost:8081/--%>
<div id="div_login" class="div_login_css">
    <form action="user/login" id="from_login" method="post">
        用户名：<input type="text" name="account" id="account"/>
        <dr/>
        密码：<input type="password" name="passWord" id="pwd"/><br/>

        <button type="submit" form="from_login" onclick="login()">登录</button>
    </form>
</div>
</body>
<script type="text/javascript">
    document.getElementById("time_p").innerHTML = Date();

    function showTime() {
        document.getElementById("time_p").innerHTML = Date();
    }

    function showSub(a, b) {
        return a + b;
    }

    function login() {
        var account = document.getElementById("account").value;
        var pwd = document.getElementById("pwd").value;
        if (account.length !== 0 || pwd.length !== 0) {

        } else {
            alert("请输入用户名或密码")
        }

    }

</script>
</html>
