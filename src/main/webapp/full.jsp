<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11952
  Date: 2018/12/24
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Full Portfolio</title>
    <meta charset="utf-8" />

    <!--引入bootstrap-->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets-3/css/main.css" />
</head>
<body id="top">

<!-- Banner -->
<!--
    To use a video as your background, set data-video to the name of your video without
    its extension (eg. images-3/banner). Your video must be available in both .mp4 and .webm
    formats to work correctly.
-->
<section id="banner" data-video="${pageContext.request.contextPath}/images-3/banner">
    <div class="inner">
        <header>
            <h1>Full Portfolio</h1>
            <p>Wellcome to My Life.<br />
                <%--designed by <a href="https://templated.co/">Templated.</a>--%> Welcome to correct my point of view, I won't change it anyway.</p>
        </header>
        <a href="#main" class="more scrolly">Learn More</a>
    </div>
</section>

<!-- Main -->
<div id="main">
    <div class="inner">

        <!-- Boxes -->
        <div class="thumbnails">
            <c:forEach var="work" items="${pageInfo.list }">
                <div class="box">
                    <a href="${pageContext.request.contextPath}/coverimg/${work.wimg}" class="image  fit"><img src="${pageContext.request.contextPath}/coverimg/${work.wimg}" alt="" /></a>
                    <div class="inner">
                        <h3>${work.wtitle}</h3>
                        <p>${work.wintro}</p>
                        <a href="${pageContext.request.contextPath}/work/detailed/${work.wid}" class="button fit" data-poptrox="youtube,800x400">Learn</a>
                    </div>
                </div>
            </c:forEach>
        </div>

        <!-- 显示分页信息 -->
        <div class="row">
            <!--分页文字信息  -->
            <div class="col-md-6">当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
                页,总 ${pageInfo.total } 条记录
            </div>
            <!-- 分页条信息 -->
            <div class="col-md-6">
                <nav aria-label="Page navigation">
                    <ul class="pagination">
                        <li><a href="${pageContext.request.contextPath }/work/works/1">首页</a></li>
                        <c:if test="${pageInfo.hasPreviousPage }">
                            <li><a href="${pageContext.request.contextPath }/work/works/${pageInfo.pageNum-1}"
                                   aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
                            </a></li>
                        </c:if>


                        <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                            <c:if test="${page_Num == pageInfo.pageNum }">
                                <li class="active"><a href="#">${page_Num }</a></li>
                            </c:if>
                            <c:if test="${page_Num != pageInfo.pageNum }">
                                <li><a href="${pageContext.request.contextPath }/work/works/${page_Num }">${page_Num }</a></li>
                            </c:if>

                        </c:forEach>
                        <c:if test="${pageInfo.hasNextPage }">
                            <li><a href="${pageContext.request.contextPath }/work/works/${pageInfo.pageNum+1 }"
                                   aria-label="Next"> <span aria-hidden="true">&raquo;</span>
                            </a></li>
                        </c:if>
                        <li><a href="${pageContext.request.contextPath }/work/works/${pageInfo.pages}">末页</a></li>
                    </ul>
                </nav>
            </div>

        </div>
        <!--分页信息结束-->

    </div>
</div>

<!-- Footer -->
<footer id="footer">
    <div class="inner">
        <%--<h2>Etiam veroeros lorem</h2>
        <p>Pellentesque eleifend malesuada efficitur. Curabitur volutpat dui mi, ac imperdiet dolor tincidunt nec. Ut erat lectus, dictum sit amet lectus a, aliquet rutrum mauris. Etiam nec lectus hendrerit, consectetur risus viverra, iaculis orci. Phasellus eu nibh ut mi luctus auctor. Donec sit amet dolor in diam feugiat venenatis. </p>
--%>
        <ul class="icons">

            <li><a href="https://weibo.com/5018248892/profile?rightmod=1&wvr=6&mod=personinfo&is_all=1" class="label" target="_blank">weibo</a></li>
            <li><a href="https://github.com/hanhanhanxu" class="label" target="_blank">github</a></li>


        <%--<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
            <li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
            <li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
            <li><a href="#" class="icon fa-envelope"><span class="label">Email</span></a></li>
        --%>

        </ul>
        <p class="copyright">&copy; Almostlover(Han Xu). All rights reserved.<br/>Design: <a href="https://templated.co">TEMPLATED</a>. Images: <a href="https://unsplash.com/">Unsplash</a>. Videos: <a href="http://coverr.co/">Coverr</a>.</p>
    </div>
</footer>

<!-- Scripts -->
<script src="${pageContext.request.contextPath}/assets-3/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets-3/js/jquery.scrolly.min.js"></script>
<script src="${pageContext.request.contextPath}/assets-3/js/jquery.poptrox.min.js"></script>
<script src="${pageContext.request.contextPath}/assets-3/js/skel.min.js"></script>
<script src="${pageContext.request.contextPath}/assets-3/js/util.js"></script>
<script src="${pageContext.request.contextPath}/assets-3/js/main.js"></script>

</body>
</html>
