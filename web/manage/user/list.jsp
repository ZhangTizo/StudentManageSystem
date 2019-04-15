<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        h1 {
            background-color: deepskyblue;
        }
        body{
            /*background-image: url("../img/BGP.jpg");*/
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
            border-width:1px;
            padding:8px;
            border-style:solid;
            border-color:#666666;
            background-color:#dedede;
        }
        table.gridtable td{
            border-width:1px;
            padding:8px;
            border-style:solid;
            border-color:#666666;
            background-color:#ffffff;
        }

    </style>
</head>
<body>
<form action="SearchUserServlet" method="post">
    <input type="button" onclick="location.href='../success.jsp'" value="返回上一页">
    <div align="center">
        <h1>用户管理</h1>
    </div><br>
    <div align="center"><br>
        用户名:<input size="10" type="text" name="username" placeholder="用户名">&nbsp;&nbsp;
        <input type="submit" value="查询"><br><br>
    </div>
    <table align="center" border="1" cellpadding="15" class="gridtable">
        <tr>
            <%--<th>ID</th>--%>
            <th>用户名</th>
            <th>性别</th>
            <th>年龄</th>
        </tr>
        <c:forEach var="user" items="${userList}">
            <tr>
                <%--<td>${user.id}</td>--%>
                <td>${user.username}</td>
                <td>${user.user_sex eq 1 ? "男" : "女"}</td>
                <td>${user.user_age}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
