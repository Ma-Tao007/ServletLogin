<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
</head>
<style>
    span{
        width: 100px;
        text-align: right;
        float: left;
        margin-right: 10px;
    }
    button{
        margin-left: 100px;
    }
</style>
<body>
<div class="container">
    <h2>登陆页面</h2>
    <hr>
    <div class="wrap">

        <form action="login" method="post">
            <span>用户名</span><input type="text" name="username" name="userName" class="userName" placeholder="请输入用户名"></p>
            <span>密码</span><input type="password" name="password" placeholder="请输入密码"></p>
            <span>确认密码</span><input type="password" name="password" placeholder="请输入密码"></p>
            <button>登录</button>
        </form>

    </div>
</div>
</body>
</html>
