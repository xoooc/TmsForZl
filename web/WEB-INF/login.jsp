<%@ page import="com.tms.zl.utils.Constant" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-12-15
  Time: 下午3:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
我在哪里？
<form action="Login" method="post">
    <table>
        <tr><td>用户名</td><td><label for="username"></label><input type="text" name="username" id="username"/></td></tr>
        <tr><td>密码</td><td><label for="password"></label><input type="password" name="password" id="password"/></td></tr>
        <tr><td><input type="submit" value="登录" name="ok"/></td><td><input type="reset" value="取消" name="cancel" /></td></tr>
    </table>
    <%
        if(request.getAttribute("logininfo") != null) {
            if((Integer)request.getAttribute("logininfo") == Constant.IS_WRONG_PASSWORD) {
                out.print("错误的用户名或密码");
            }else if((Integer)request.getAttribute("logininfo") == Constant.IS_NOT_EXIST_USERNAME) {
                out.print("该用户不存在");
            }
        }
    %>
</form>

</body>
</html>
