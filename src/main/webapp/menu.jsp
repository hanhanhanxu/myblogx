<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--真正意义上的首页，用于显示近期帖子  work -->
<html>
<head>
    <head>
        <title>Hx's Blog</title>
        <link rel="shortcut icon" href="https://raw.githubusercontent.com/hanhanhanxu/hanxu/master/favicon.ico" type="image/x-icon" />
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" />
    </head>
<body class="is-preload">
<!-- Header -->
<header id="header">
    <div class="inner">
        <a href="${pageContext.request.contextPath}/index.jsp" class="image avatar"><img src="${pageContext.request.contextPath}/images/avatar.jpg" alt="点击头像返回主页" title="点击头像返回主页" /></a>
        <h1><strong>Han Xu</strong>,College students<br />
            Web developers ; LOLer ;<br/>Ideal is to open an Internet cafe<br/> and coffee shop;<br /><a href="${pageContext.request.contextPath}/xlogin.jsp">return ;</a><br/>
            crafted by <a href="http://html5up.net">HTML5 UP</a>.</h1>
    </div>
</header>

<!-- Main -->
<div id="main">

    <!-- One -->
    <section id="one">
        <header class="major">
            <h2>向之所欣，俯仰之间，已为陈迹<br />
                <%--犹不能不以之兴怀，况修短随化，终期于尽。--%></h2>
        </header>
        <p>这里用来存放一些自己的生活日志，<br/>有代码部分，也有生活部分<br/>还想有时间开一个公众号记录我所想的<br/>嗯，等有时间吧...
            <%--Accumsan orci faucibus id eu lorem semper. Eu ac iaculis ac nunc nisi lorem vulputate lorem neque cubilia ac in adipiscing in curae lobortis tortor primis integer massa adipiscing id nisi accumsan pellentesque commodo blandit enim arcu non at amet id arcu magna. Accumsan orci faucibus id eu lorem semper nunc nisi lorem vulputate lorem neque cubilia.--%></p>
        <ul class="actions">
            <!--这里用来弹出一个框，上面有我的练习方式-->
            <%--<li><a href="#" class="button">Learn More</a></li>--%>
        </ul>
    </section>

    <!-- 工作区 -->
    <section id="two">
        <h2>Recent Work</h2>
        <div class="row">
            <c:forEach var="work" items="${indexworks}">
                <article class="col-6 col-12-xsmall work-item">
                    <a href="${pageContext.request.contextPath}/coverimg/${work.wimg}" class="image fit thumb"><img src="${pageContext.request.contextPath}/coverimg/${work.wimg}" alt="" /></a>
                    <a href="${pageContext.request.contextPath}/work/detailed/${work.wid}"><h3>${work.wtitle}</h3></a>
                    <p>${work.wintro}</p>
                </article>
            </c:forEach>
        </div>
        <ul class="actions">
            <li><a href="${pageContext.request.contextPath}/work/works" target="_blank" class="button">Full Portfolio</a></li>
        </ul>
    </section>

    <!-- 评论区 -->
    <section id="three">
        <a href="${pageContext.request.contextPath}/message/messages"><h2>Message area</h2></a>
        <p>如果你想，可以通过以下方式联系到我<br/>如果有学术问题要探讨，请发送邮箱并尽量叙述清楚完善<br/>拒绝在qq，微信等社交软件讨论学术问题<br/>网站上很多地方都可以点击<br/>只是表面看不出来二而已(￣▽￣)"
            <%--Accumsan pellentesque commodo blandit enim arcu non at amet id arcu magna. Accumsan orci faucibus id eu lorem semper nunc nisi lorem vulputate lorem neque lorem ipsum dolor.--%></p>
        <div class="row">
            <div class="col-8 col-12-small">
                <form method="post" action="${pageContext.request.contextPath}/message/add">
                    <div class="row gtr-uniform gtr-50">
                        <div class="col-6 col-12-xsmall"><input required type="text" name="name" id="name" placeholder="Your Name(写了也不一定看)" /></div>
                        <div class="col-6 col-12-xsmall"><input required type="email" name="email" id="email" placeholder="Your Email(看也不一定回你)" /></div>
                        <div class="col-12"><textarea required name="messcontent" id="message" placeholder="Message" rows="4"></textarea></div>
                    </div>
                    <br>
                    <ul class="actions">
                        <li><input type="submit" value="Send Message" /></li>
                    </ul>
                </form>
            </div>
            <div class="col-4 col-12-small">
                <ul class="labeled-icons">
                    <li>
                        <h3 class="icon fa-home"><span class="label">Address</span></h3>
                        462600<br />
                        HeNan Luohe<br />
                        China
                    </li>
                    <li>
                        <h3 class="icon fa-mobile"><span class="label">Phone</span></h3>
                        000-000-0000
                    </li>
                    <li>
                        <h3 class="icon fa-envelope-o"><span class="label">Email</span></h3>
                        hanxuemail@163.com
                    </li>
                </ul>
            </div>
        </div>
    </section>
</div>

<!-- Footer -->
<footer id="footer">
    <div class="inner">
        <ul class="icons">
            <li><a href="https://weibo.com/5018248892/profile?rightmod=1&wvr=6&mod=personinfo&is_all=1" class="label" target="_blank">weibo</a></li>
            <li><a href="https://github.com/hanhanhanxu" class="label" target="_blank">github</a></li>
        </ul>
        <ul class="copyright">
            <li>Copyright &copy; Almostlover(Han Xu)</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
        </ul>
        <ul class="copyright">
            <li>网站备案号:<a href="http://www.miitbeian.gov.cn/" target="_blank">豫ICP备19008607号-1</a></li>
        </ul>
    </div>
</footer>

<!-- Scripts -->
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.poptrox.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/util.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>

</body>
</html>
