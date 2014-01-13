<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-12-15
  Time: 下午5:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<%=request.getContextPath()%>/css/head.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/jquery-easyui-1.3.5/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/jquery-easyui-1.3.5/themes/icon.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/jquery-easyui-1.3.5/jquery.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/jquery-easyui-1.3.5/jquery.easyui.min.js"></script>
    <title></title>
</head>
<body>
    <div class="head">
      <label><%=request.getSession().getAttribute("username")%>,欢迎您</label>
      <span><a href="myTask">我的任务</a></span>
      <span><a href="deptTask">部门任务</a></span>
      <span><a href="statistics">统计</a></span>
      <span><a href="score">评分</a></span>
    </div>
</body>
</html>
