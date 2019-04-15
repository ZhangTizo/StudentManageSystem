
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生列表</title>
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
            text-align:center;
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
<form action="SearchTableServlet">
    <img src="../../img/16.png" style="width: 100%">
    <br><br>
    <input type="button" onclick="location.href='../success.jsp'" value="返回上一页">
    <div align="center">
        <h1>成绩报表</h1>
    </div><br>
    <div align="center"><br>
        姓名:<input size="10" type="text" name="s_name" placeholder="姓名">&nbsp;&nbsp;
        <input type="submit" value="查询"><br><br>
    </div>
    <table align="center" border="1" cellpadding="15" class="gridtable">
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>操作</th>
        </tr>
        <c:forEach var="student" items="${studentList}">
            <tr>
                <td>${student.s_no}</td>
                <td>${student.s_name}</td>
                <td>
                    <a href="GradeTableServlet?post=${student.id}">生成成绩报表</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>
