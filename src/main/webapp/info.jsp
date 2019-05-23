<%--
  Created by IntelliJ IDEA.
  User: 11952
  Date: 2018/12/23
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--主页点进来之后的详情 ， work详情-->
<html>
<head>
    <head>
        <title>Blog Details</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets-2/css/main.css" />
    </head>
<body>

<!-- Header -->
<header id="header">
    <div class="logo"><a href="#">Create By Hx <span>文章内容由 韩旭 创作</span></a></div>
</header>

<!-- Main -->
<section id="main">
    <div class="inner">

        <!-- One -->
        <section id="one" class="wrapper style1">

            <div class="image fit flush">
                <img src="${pageContext.request.contextPath}/coverimg/${work.wimg}" alt="" />
            </div>
            <header class="special">
                <h2>${work.wtitle}</h2><!--标题-->
                <p>${work.wintro}</p><!--简介-->
            </header>
            <div class="content"><!--文章内容-->
                ${workinfo.winfocontent}
                <%--
                <p>Curabitur eget semper ante. Morbi eleifend ultricies est, a blandit diam vehicula vel. Vestibulum porttitor nisi quis viverra hendrerit. Suspendisse vel volutpat nibh, vel elementum lacus. Maecenas commodo pulvinar dui, at cursus metus imperdiet vel. Vestibulum et efficitur urna. Duis velit nulla, interdum sed felis sit amet, facilisis auctor nunc. Cras luctus urna at risus feugiat scelerisque nec sed diam. </p>
                <p>Nunc fringilla metus odio, at rutrum augue tristique vel. Nulla ac tellus a neque ullamcorper porta a vitae ipsum. Morbi est sapien, hendrerit quis mi in, aliquam bibendum orci. Vestibulum imperdiet nibh vitae maximus posuere. Aenean sit amet nibh feugiat, condimentum tellus eu, malesuada nunc. Mauris ac pulvinar turpis, sit amet pharetra est. Ut bibendum justo condimentum, vehicula ex vel, venenatis libero. Etiam vehicula urna sed justo bibendum, ac lacinia nunc pulvinar. Integer nec velit orci. Vestibulum pellentesque varius dapibus. Morbi ullamcorper augue est, sed luctus orci fermentum dictum. Nunc tincidunt, nisl consequat convallis viverra, metus nisl ultricies dui, vitae dapibus ligula urna sit amet nibh. Duis ut venenatis enim.</p>
            --%>
            </div>
        </section>

    </div>
</section>

<!-- Footer -->
<footer id="footer">
    <div class="container">
        <ul class="icons">

            <li><a href="https://weibo.com/5018248892/profile?rightmod=1&wvr=6&mod=personinfo&is_all=1" class="label" target="_blank">weibo</a></li>
            <li><a href="https://github.com/hanhanhanxu" class="label" target="_blank">github</a></li>


        <%--<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
            <li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
            <li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
            <li><a href="#" class="icon fa-envelope-o"><span class="label">Email</span></a></li>
        --%>
        </ul>
    </div>
    <div class="copyright">
        &copy; Almostlover(Han Xu). All rights reserved. <br><a href="https://unsplash.com">Unsplash</a> Design <a href="https://templated.co">TEMPLATED</a>
    </div>
</footer>

<!-- Scripts -->
<script src="${pageContext.request.contextPath}/assets-2/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets-2/js/jquery.poptrox.min.js"></script>
<script src="${pageContext.request.contextPath}/assets-2/js/skel.min.js"></script>
<script src="${pageContext.request.contextPath}/assets-2/js/util.js"></script>
<script src="${pageContext.request.contextPath}/assets-2/js/main.js"></script>

</body>
</html>
