<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--虚拟首页，这个页面的作用是转发到action中，然后去数据库中加载work数据。-->
<html>
<head>
    <title>index</title>
    <link rel="shortcut icon" href="https://raw.githubusercontent.com/hanhanhanxu/hanxu/master/favicon.ico" type="image/x-icon" />
</head>
<body>
<!--从数据库中加载主页信息-->
<jsp:forward page="/work/index"></jsp:forward>
</body>
</html>
