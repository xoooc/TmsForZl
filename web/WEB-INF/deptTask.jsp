<%@ page import="java.util.Calendar" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-12-24
  Time: 下午9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门任务</title>
</head>
<body>
    <%@include file="head.jsp"%>
    <div>
        <div>
            <button>今天</button><button><</button><button>></button>
            <label><%=Calendar.getInstance().getTime()%></label>
            <button>周</button><button>日</button>
            <label>当月任务</label>
        </div>
    </div>
</body>
</html>
