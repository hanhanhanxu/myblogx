<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11952
  Date: 2019/4/17
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评论页面</title>
    <!--引入bootstrap-->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>


    <%--<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" />

    <style>
        #main img{
            width: 60px;
            height: 60px;
        }
    </style>
</head>
<body  class="is-preload">

<!-- 左侧上半部分 -->
<header id="header">
    <div class="inner">
        <a href="${pageContext.request.contextPath}/index.jsp" class="image avatar"><img src="${pageContext.request.contextPath}/images/avatar.jpg" alt="点击头像返回主页" title="点击头像返回主页" /></a>
        <h1><strong>Han Xu</strong>,College students<br />
            Web developers ; LOLer ;<br/>Ideal is to open an Internet cafe<br/> and coffee shop;<br />return ;<br/>
            crafted by <a href="http://html5up.net">HTML5 UP</a>.</h1>
    </div>
</header>


<!-- 左侧下半部分 -->
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

<!-- 右侧主题部分 -->
<div id="main">

    <%--右侧头部--%>
    <div>
        <div class="row">
            <div class="col-lg-4">
                <ul class="list-group">
                    <li class="list-group-item">
                        <span class="badge list-group-item-success">(‾◡◝)</span>
                        <h5>欢迎你的留言！</h5>
                    </li>
                </ul>
            </div>
        </div>

        <%--评论区--%>
        <section id="three">
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
            </div>
        </section>

        <%--显示评论信息--%>
        <a href="${pageContext.request.contextPath}/message/messages"><h2>留言区</h2></a>
        <c:forEach items="${pageInfo.list}" var="m">
            <div class="media">
                <div class="media-left">
                    <img class="media-object" src="${pageContext.request.contextPath}/static/messimgs/${m.messpic}" alt="...">
                </div>
                <div class="media-body">
                    <h4 class="media-heading">${m.name}</h4>
                    <p>${m.messcontent}</p>
                    <p>${m.floor}楼&nbsp;&nbsp${m.messdate}&nbsp;&nbsp;发表</p>
                    <hr>
                </div>
            </div>
        </c:forEach>


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
                        <li><a href="${pageContext.request.contextPath }/message/messages/1">首页</a></li>
                        <c:if test="${pageInfo.hasPreviousPage }">
                            <li><a href="${pageContext.request.contextPath }/message/messages/${pageInfo.pageNum-1}"
                                   aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
                            </a></li>
                        </c:if>


                        <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                            <c:if test="${page_Num == pageInfo.pageNum }">
                                <li class="active"><a href="#">${page_Num }</a></li>
                            </c:if>
                            <c:if test="${page_Num != pageInfo.pageNum }">
                                <li><a href="${pageContext.request.contextPath }/message/messages/${page_Num }">${page_Num }</a></li>
                            </c:if>

                        </c:forEach>
                        <c:if test="${pageInfo.hasNextPage }">
                            <li><a href="${pageContext.request.contextPath }/message/messages/${pageInfo.pageNum+1 }"
                                   aria-label="Next"> <span aria-hidden="true">&raquo;</span>
                            </a></li>
                        </c:if>
                        <li><a href="${pageContext.request.contextPath }/message/messages/${pageInfo.pages}">末页</a></li>
                    </ul>
                </nav>
            </div>

        </div>
        <!--分页信息结束-->

       <%-- <div class="text-center">
            <button class="btn btn-default btn-block">查看更多</button>
        </div>--%>

    </div>

</div>


<!-- Scripts -->
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.poptrox.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/util.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>

</body>
</html>
