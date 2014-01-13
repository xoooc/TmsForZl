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
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/jquery-easyui-1.3.5/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/jquery-easyui-1.3.5/themes/icon.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/jquery-easyui-1.3.5/jquery.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/jquery-easyui-1.3.5/jquery.easyui.min.js"></script>

    <title>我的任务</title>
    <script type="text/javascript">
        $(document).ready(function() {
            var jsonString = '<%=request.getAttribute("jsonTaskInfo")%>'
            alert(jsonString);
        });

    </script>
    <script type="text/javascript">
        $(function() {
            $('#mytask').datagrid({
                width : 1000,
                height : 800,
                autoRowHeight: false,
                striped: true,
                remoteSort: false,
                toolbar : [{
                    id : 'btnToday',
                    text : '今天',
                    handler:function() {
                        $('#btnToday').linkbutton('endable');
                        alert('今天')
                    }
                },'----',{
                    id : 'btnPre',
                    text : '<',
                    handler:function() {
                        $('#btnPre').linkbutton('endable');
                        alert('前一天')
                    }
                }, '--', {
                        id : 'btnNext',
                    text : '>',
                    handler:function() {
                        $('#btnNre').linkbutton('endable');
                        alert('后一天')
                    }
                },'----',{
                    id : 'lableTimeSegment',
                    text : '2013-09-10 到 2013-09-17'
                },'----',{
                    id : 'officeTask',
                    text : '科室任务',
                    handler:function() {
                        $('#officeTask').linkbutton('endable');
                        alert('科室任务')
                    }
                },'----',{
                    id : 'deptPlanTask',
                    text : '部门计划任务',
                    handler:function() {
                        $('#deptPlanTask').linkbutton('endable');
                        alert('部门计划任务')
                    }
                },'----','----','----','----',{
                    id : 'monthTask',
                    text : '本月任务',
                    handler:function() {
                        $('#monthTask').linkbutton('endable');
                        alert('本月任务')
                    }
                }],
                columns : [[{title : '星期一', field : 'taskId'},{title : '星期二', field : 'content'},
                    {title : '星期三', field : 'pubTaskTime'},{title : '星期四', field : 'type'}]]
            });
            var jsonString = '<%=request.getAttribute("jsonTaskInfo")%>'
            $('#mytask').datagrid("loadData",$.parseJSON(jsonString));
        });
    </script>
</head>
<body>
<%@include file="head.jsp"%>
<table id="mytask">
</table>

<%-- 点击单元格的对话框 --%>
<div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"
     closed="true" buttons="#dlg-buttons">
    <div class="ftitle">User Information</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>First Name:</label>
            <input name="firstname" class="easyui-validatebox" required="true">
        </div>
        <div class="fitem">
            <label>Last Name:</label>
            <input name="lastname" class="easyui-validatebox" required="true">
        </div>
        <div class="fitem">
            <label>Phone:</label>
            <input name="phone">
        </div>
        <div class="fitem">
            <label>Email</label>
            <input name="email" class="easyui-validatebox">
        </div>
    </form>
</div>
<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" onclick="">Save</a>
    <a href="#" class="easyui-linkbutton" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
</div>
    <!-- 循环显示多少行-->
<%--    <table class="easyui-datagrid"><% for(int i=0; i<24; i++) {
        //循环显示多少列
        %><tr><% for(int j=1; j<9; j++) {
            if(j==0) {
                %><td id="<%=i*8+j%>"><%=i-1%>点</td><%
            }else {
                %><td>第<%=i%>行,第<%=j%>列</td><%
            }
        }%><tr><%
    }%></table>--%>
</body>
</html>
