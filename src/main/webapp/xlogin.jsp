<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11952
  Date: 2018/12/22
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <!--引入bootstrap-->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <%--<link href="../assets/style.css" rel="stylesheet">--%>
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <style type="text/css">
        body{
            background-image: url(${pageContext.request.contextPath}/images/login.jpg);
            background-size:cover;
        }
        #id1{
            margin-left:40%;
            vertical-align: middle;
        }
        .control-group span{
            color:#FF0002;
        }
    </style>
    <script type="text/javascript">
        function changeImage(img){
            img.src = img.src + "?" + new Date().getTime();
        }
    </script>
</head>
<body>

    <div class="container-fluid" id="id1">
        <div class="row-fluid" >
            <div class="span12" >
                <h3 class="text-center">
                    登录以了解更多内容
                </h3>
                <form class="form-horizontal" style="text-align: center" action="${pageContext.request.contextPath}/backstage/login.action" method="post">
                    <div class="control-group">
                        <label class="control-label" for="inputEmail">账号</label>
                        &nbsp;&nbsp;&nbsp;<span>${errors.username}</span>
                        <div class="controls">
                            <input id="inputEmail" required type="text" placeholder="账号" name="username"/>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="inputPassword">密码</label>
                        &nbsp;&nbsp;&nbsp;<span>${errors.password}</span>
                        <div class="controls">
                            <input id="inputPassword" required type="password" placeholder="密码" name="password"/>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="inputCode">你是机器人吗?</label>
                        &nbsp;&nbsp;&nbsp;<span>${errors.checkcode}</span>
                        <div class="controls">
                            <img src="${pageContext.request.contextPath}/IdentifyCode" onclick="changeImage(this)" title="换一张" style="cursor:pointer">
                            <br/><input id="inputCode" required type="text" placeholder="验证码" name="checkcode"/>
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <label class="checkbox"><input type="checkbox" /> Remember me</label>
                            <button type="submit" class="btn">登陆</button>
                        </div>
                    </div>

                </form>
            </div>
        </div>
    </div>

</body>
</html>
