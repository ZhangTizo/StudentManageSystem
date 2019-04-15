<%--
  Created by IntelliJ IDEA.
  User: cjh
  Date: 2018/6/26
  Time: 下午 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成绩列表</title>
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
            /*text-align:center;*/
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

    </style>
</head>
<body>
<img src="../../img/16.png" style="width: 100%">
<form action="SearchGradeServlet">
    <br>
    <input type="button" onclick="location.href='../success.jsp'" value="返回上一页">
    <input type="button" onclick="location.href='GradeListServlet?method=insert'" value="录入成绩">
    <div align="center">
        <h1>成绩管理</h1>
    </div><br>
    <div align="center"><br>
        学号:<input size="8" type="text" name="s_no" placeholder="学号">&nbsp;&nbsp;
        课程号:<input size="8" type="text" name="c_no" placeholder="课程号">&nbsp;&nbsp;
        <input type="submit" value="查询"><br><br>
    </div>
    <table align="center" border="1" cellpadding="15" class="gridtable">
        <tr>
            <%--<th>ID</th>--%>
            <th>学号</th>
            <th>姓名</th>
            <th>课程号</th>
            <th>课程名</th>
            <th>分数</th>
            <th>备注</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${gradeList}" var="grade">
            <tr>
                <%--<td>${grade.id}</td>--%>
                <td>${grade.s_no}</td>
                <td>${grade.s_name}</td>
                <td>${grade.c_no}</td>
                <td>${grade.c_name}</td>
                <td>${grade.grade}</td>
                <td>${grade.memo eq "" ? "无" : grade.memo}</td>
                <td>
                    <a href="GradeListServlet?method=update&post1=${grade.s_no}&post2=${grade.c_no}">修改</a>&nbsp;&nbsp;
                    <%--<a href="GradeListServlet?method=delete&post1=${grade.s_no}&post2=${grade.c_no}">删除</a>--%>
                    <a href="javascript:if(confirm('确实要删除吗?'))location='GradeListServlet?method=delete&post1=${grade.s_no}&post2=${grade.c_no}'">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table><br>
    <div align="center">
        <input type="button" value="上一页" onclick="location.href='GradeListServlet?method=up&post=${currentPages}'">&nbsp;&nbsp;
        当前第&nbsp;<u>${currentPages}</u>&nbsp;页&nbsp;
        &nbsp;<input type="button" value="下一页" onclick="location.href='GradeListServlet?method=down&post=${currentPages}'">
        &nbsp;&nbsp;共&nbsp;<u>${pages}</u>&nbsp;页&nbsp;&nbsp;
        &nbsp;-&nbsp;向
        <input type="text" size="5px" name="page">&nbsp;页&nbsp;
        <input type="submit" value="跳转">
    </div>

</form>
</body>
</html>
