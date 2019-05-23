<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11952
  Date: 2019/4/19
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台-帖子</title>

    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- BOOTSTRAP STYLES-->
    <link href="${pageContext.request.contextPath}/assets-houtai/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="${pageContext.request.contextPath}/assets-houtai/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLES-->
    <link href="${pageContext.request.contextPath}/assets-houtai/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />

    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js"></script>
    <!--引入bootstrap-->
  <%--  <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>--%>
</head>
<body>
<div id="wrapper">
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="adjust-nav">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">
                    <img src="${pageContext.request.contextPath}/assets-houtai/img/logo.png" />
                </a>
            </div>

            <span class="logout-spn">
                  <a href="#" style="color:#fff;">LOGOUT</a>

                </span>
        </div>
    </div>
    <!-- /. NAV TOP  -->
    <!-- 左侧导航栏  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">

                <li>
                    <a href="${pageContext.request.contextPath}/admin/xmenu"><i class="fa fa-desktop "></i>Dashboard <span class="badge">Included</span></a>
                </li>

                <li class="active-link"><!--这个class是标识选中的样式标在哪个左侧导航栏上-->
                    <a href="${pageContext.request.contextPath}/admin/xworkinfo"><i class="fa fa-table "></i>帖子管理<span class="badge">Included</span></a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/admin/xmessinfo"><i class="fa fa-edit "></i>留言管理<span class="badge">Included</span></a>
                </li>

                <li>
                    <a href="#"><i class="fa fa-qrcode "></i>My Link One</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-bar-chart-o"></i>My Link Two</a>
                </li>

                <li>
                    <a href="#"><i class="fa fa-edit "></i>My Link Three </a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-table "></i>My Link Four</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-edit "></i>My Link Five </a>
                </li>
            </ul>
        </div>

    </nav>

    <!-- /. NAV SIDE  -->
    <!-- 右侧主体内容  -->
    <div id="page-wrapper">
        <div id="page-inner">
            <h2>帖子work管理</h2>
            <!-- 搭建显示页面 -->
            <div class="container">
                <!-- 标题 -->
                <div class="row">
                    <div class="col-md-12">
                        <h1>Works-CRUD</h1>
                    </div>
                </div>
                <!-- 按钮 -->
                <div class="row">
                    <div class="col-md-4 col-md-offset-8">
                        <a class="btn btn-default" href="${pageContext.request.contextPath}/admin/addwork" role="button">新增work</a>
                        <%--<button class="btn btn-primary">新增</button>
                        <button class="btn btn-danger">删除</button>--%>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 col-md-offset-8">
                        <a class="btn btn-default" href="${pageContext.request.contextPath}/admin/addwork2" role="button">新增work-eidtor.md</a>
                        <%--<button class="btn btn-primary">新增</button>
                        <button class="btn btn-danger">删除</button>--%>
                    </div>
                </div>
                <!-- 显示表格数据 -->
                <div class="row">
                    <div class="col-md-12">
                        <table class="table table-hover">
                            <tr style="color:red">
                                <th>wid</th>
                                <th>wtitle</th>
                                <th>wintro</th>
                                <th>wimg</th>
                                <th>操作</th>
                            </tr>
                            <c:forEach items="${pageInfo.list }" var="work">
                                <tr>
                                    <th>${work.wid }</th>
                                    <th><a href="${pageContext.request.contextPath}/work/detailed/${work.wid}">${work.wtitle }</a></th>
                                    <th>${work.wintro}</th>
                                    <th>${work.wimg }</th>
                                    <th>
                                            <%-- <button class="btn btn-primary btn-sm">
                                                 <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                 编辑
                                             </button>--%>
                                        <a href="javascript:void(0);" onclick="deletework('${work.wid}')">删除</a>
                                    </th>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>

                <!-- 显示分页信息 -->
                <div class="row">
                    <!--分页文字信息  -->
                    <div class="col-md-6">当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
                        页,总 ${pageInfo.total } 条记录</div>
                    <!-- 分页条信息 -->
                    <div class="col-md-6">
                        <nav aria-label="Page navigation">
                            <ul class="pagination">
                                <li><a href="${pageContext.request.contextPath}/work/works/1">首页</a></li>
                                <c:if test="${pageInfo.hasPreviousPage }">
                                    <li><a href="${pageContext.request.contextPath}/work/works/${pageInfo.pageNum-1}"
                                           aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
                                    </a></li>
                                </c:if>


                                <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                                    <c:if test="${page_Num == pageInfo.pageNum }">
                                        <li class="active"><a href="#">${page_Num }</a></li>
                                    </c:if>
                                    <c:if test="${page_Num != pageInfo.pageNum }">
                                        <li><a href="${pageContext.request.contextPath}/work/works/${page_Num }">${page_Num }</a></li>
                                    </c:if>

                                </c:forEach>
                                <c:if test="${pageInfo.hasNextPage }">
                                    <li><a href="${pageContext.request.contextPath}/work/works/${pageInfo.pageNum+1 }"
                                           aria-label="Next"> <span aria-hidden="true">&raquo;</span>
                                    </a></li>
                                </c:if>
                                <li><a href="${pageContext.request.contextPath}/work/works/${pageInfo.pages}">末页</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <!-- /. PAGE WRAPPER  -->
</div>

<!-- 底部  -->
<div class="footer">

    <div class="row">
        <div class="col-lg-12">
            &copy; 2014 yourdomain.com | Design More Templates
            <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from
            <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
        </div>
    </div>
</div>

<!-- /. WRAPPER  -->
<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
<!-- JQUERY SCRIPTS -->
<script src="${pageContext.request.contextPath}/assets-houtai/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="${pageContext.request.contextPath}/assets-houtai/js/bootstrap.min.js"></script>
<!-- CUSTOM SCRIPTS -->
<script src="${pageContext.request.contextPath}/assets-houtai/js/custom.js"></script>

<script type="text/javascript">
    function deletework(wid){
        var b=window.confirm("确定完全删除该work帖子？");
        if(b){
            window.location="${pageContext.request.contextPath }/admin/deletework/"+wid;
        }
    }
</script>
</body>
</html>
