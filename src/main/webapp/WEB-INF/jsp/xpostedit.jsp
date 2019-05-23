<%--
  Created by IntelliJ IDEA.
  User: 11952
  Date: 2018/12/22
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发表帖子</title>

    <!--引入bootstrap-->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <!-- 富文本编辑器引入文件 -->
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/ueditor/ueditor.all.min.js"> </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/ueditor/lang/zh-cn/zh-cn.js"></script>

    <style type="text/css">
        body{
            text-align:center
        }
        div{
            width:80%;
            margin:0 auto
        }
    </style>
    <!--
    div居中：先设置body text-align:center
             再设置div  margin:0 auto
    -->

</head>
<body>
    <h2 style="text-align: center">Publish Recent Work</h2>
    <div id="id1">
        <form action="${pageContext.request.contextPath}/admin/publish" method="post" enctype="multipart/form-data">
            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon1">标题</span>
                <input type="text" name="title" class="form-control" placeholder="Title" aria-describedby="sizing-addon1">
            </div>
            <br>

            <div class="input-group">
                <span class="input-group-addon" id="sizing-addon2">简介</span>
                <input type="text" name="intro" class="form-control" placeholder="introduction" aria-describedby="sizing-addon2">
            </div>
            <br>

            <div class="input-group">
                <span class="input-group-addon" id="sizing-addon3">预览图</span>
                <input type="file" name="preimg" class="form-control" aria-describedby="sizing-addon3">
                <img src="" height="100px">
                <!--预览图片-->
                <script type="text/javascript">
                    $("[name='preimg']").change(function(){
                        $(this).siblings('img').attr('src',URL.createObjectURL($(this)[0].files[0]));
                    });
                </script>
            </div>
            <br>

            <script id="editor" type="text/plain" style="width:1024px;height:500px;">
            </script>

            <input type="submit" value="Publish">
        </form>
    </div>
    <script type="text/javascript">
        var ue = UE.getEditor('editor');
    </script>
</body>
</html>
