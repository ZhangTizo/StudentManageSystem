
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>课程列表</title>
    <style>
        h1 {
            background-color: deepskyblue;
        }
        body{
            /*background-image: url("../img/BGP.jpg");*/
            background-image: url("../../img/BGP.jpg");
            background-size: 100%;
            background-color: #B5DEF2;
        }
        /*gridtable*/
        table.gridtable{
            font-family:verdana,arial,sans-serif;
            font-size:18px;
            color:#333333;
            border-width:1px;
            border-color:#666666;
            border-collapse:collapse;
        }
        table.gridtable th{
            width: 150px;
            border-width:1px;
            padding:8px;
            border-style:solid;
            border-color:#666666;
            background-color:#dedede;
        }
        table.gridtable td{
            text-align:center;
            width: 150px;
            border-width:1px;
            padding:8px;
            border-style:solid;
            border-color:#666666;
            background-color:#ffffff;
        }

        a:link {
            font-size: 18px;
            color: blue;
            text-decoration: none;
        }
        a:visited {
            font-size: 18px;
            color: blue;
            text-decoration: none;
        }
        a:hover {
            font-size: 18px;
            color: red;
            text-decoration: underline;
        }

    </style>
</head>
<body>
<img src="../../img/16.png" style="width: 100%">
<form action="SearchClassesServlet"><br>
    <input type="button" onclick="location.href='../success.jsp'" value="返回上一页">
    <input type="button" onclick="location.href='ClassesListServlet?method=insert'" value="插入课程信息"><br>
    <div align="center">
        <h1>课程管理</h1>
    </div><br>
    <div align="center"><br>
            课程名：<input type="text" name="c_name" placeholder="课程名" size="18">&nbsp;&nbsp;
            <input type="submit" value="查询"><br><br>
        <table border="1" cellpadding="15" class="gridtable">
            <tr>
                <%--<th>ID</th>--%>
                <th>课程号</th>
                <th>课程名</th>
                <th>教师号</th>
                <th>备注</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${classesList}" var="classes">
                <tr>
                    <%--<td>${classes.id}</td>--%>
                    <td>${classes.c_no}</td>
                    <td>${classes.c_name}</td>
                    <td>${classes.t_no}</td>
                    <td>${classes.memo eq "" ? "无" : classes.memo}</td>
                    <td>
                        <a href="ClassesListServlet?method=update&post=${classes.id}">修改</a>&nbsp;&nbsp;
                        <%--<a href="ClassesListServlet?method=delete&post=${classes.id}">删除</a>--%>
                        <a href="javascript:if(confirm('确实要删除吗?'))location='ClassesListServlet?method=delete&post=${classes.id}'">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <div align="center"><br>
            <input type="button" value="上一页" onclick="location.href='ClassesListServlet?method=up&post=${currentPages}'">&nbsp;&nbsp;
            当前第&nbsp;<u>${currentPages}</u>&nbsp;页&nbsp;
            &nbsp;<input type="button" value="下一页" onclick="location.href='ClassesListServlet?method=down&post=${currentPages}'">
            &nbsp;&nbsp;共&nbsp;<u>${pages}</u>&nbsp;页&nbsp;&nbsp;
            &nbsp;-&nbsp;向
            <input type="text" size="5px" name="page">&nbsp;页&nbsp;
            <input type="submit" value="跳转">
        </div>
    </div>
</form>
</body>
</html>
