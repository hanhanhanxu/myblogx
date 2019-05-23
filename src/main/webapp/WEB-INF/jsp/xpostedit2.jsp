<%--
  Created by IntelliJ IDEA.
  User: 11952
  Date: 2019/4/19
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增work</title>
    <meta charset="utf-8" />
    <!--markdown需要的文件css,js-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/editormd.css"/>
    <script src="${pageContext.request.contextPath}/static/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/static/js/editormd.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<!-- MarkDown的id标志 -->
<div id="my-editormd">
    <form action="${pageContext.request.contextPath}/admin/publish2" method="post">
        <!-- 书写与实时显示的textarea -->
        <textarea id="my-editormd-markdown-doc" name="my-editormd-markdown-doc" style="display:none;"></textarea>
        <!-- 用于后端获取md稳当内容，Java中：request.getParameter("my-editormd-html-code")。  -->
        <textarea id="my-editormd-html-code" name="my-editormd-html-code" style="display:none;"></textarea>

        <button type="submit">提 交</button>
    </form>

</div>



<script type="text/javascript">
    $(function() {
        editormd("my-editormd", { //注意1：这里的就是上面的DIV的id属性值
            width: "90%",
            height: 640,
            syncScrolling: "single",
            path: "${pageContext.request.contextPath}/static/lib/", //注意2：你的路径
            saveHTMLToTextarea: true //注意3：这个配置，方便post提交表单

        });
    });
</script>

</body>
</html>
