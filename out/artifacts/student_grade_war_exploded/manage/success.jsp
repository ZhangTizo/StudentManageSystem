<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎使用</title>
    <link rel="stylesheet" href="css/Cooldog.css">
    <link rel="stylesheet" href="css/iconfont.css">
    <style>
        .menuDiv {
            /*border: 2px solid #aac;*/
            overflow: hidden;
            display:inline-block;
        }

        /* 去掉a标签的下划线 */
        .menuDiv a {
            text-decoration: none;
        }

        /* 设置ul和li的样式 */
        .menuDiv ul , .menuDiv li {
            list-style: none;
            margin: 0;
            padding: 0;
            float: left;
        }

        /* 设置二级菜单绝对定位，并隐藏 */
        .menuDiv > ul > li > ul {
            position: absolute;
            display: none;
        }

        /* 设置二级菜单的li的样式 */
        .menuDiv > ul > li > ul > li {
            float: none;
        }

        /* 鼠标放在一级菜单上，显示二级菜单 */
        .menuDiv > ul > li:hover ul {
            display: block;
        }

        /* 一级菜单 */
        .menuDiv > ul > li > a {
            width: 120px;
            line-height: 40px;
            color: black;
            /*background-color: #cfe;*/
            text-align: center;
            /*border-left: 1px solid #bbf;*/
            display: block;
        }

        /* 在一级菜单中，第一个不设置左边框 */
        .menuDiv > ul > li:first-child > a {
            /*border-left: none;*/
        }

        /* 在一级菜单中，鼠标放上去的样式 */
        .menuDiv > ul > li > a:hover {
            color: #f0f;
            background-color: lightyellow;
        }

        /* 二级菜单 */
        .menuDiv > ul > li > ul > li > a {
            /*width: 60px;*/
            line-height: 18px;
            color: black;
            background-color: white;
            text-align: left;
            /*border: 2px solid black;*/
            /*border-top: none;*/
            display: block;
        }

        /* 在二级菜单中，第一个设置顶边框 */
        /*.menuDiv > ul > li > ul > li:first-child > a {
            border-top: 1px solid whitesmoke;
        }*/

        /* 在二级菜单中，鼠标放上去的样式 */
        .menuDiv > ul > li > ul > li > a:hover {
            background-color: #3388ff;
            /*background-color: #cdf;*/
        }
        /* -------------菜单css代码----------end---------- */

        body{
            /*background-image: url("../img/BGP.jpg");*/
            background-size: 100%;
            background-color: #B5DEF2;
        }

        img{
            background-repeat : repeat;
        }

        h1 {

        }

        .but {
            background-color:lightblue;
            width:110px;
            height:35px;
            font-size:16px;
            color:black;
            font-weight:bold;
            border-radius:15px;
            border-color: lightblue;
        }

        input:hover {
            background-color: deepskyblue;
            transition-duration: 0.4s;
        }

        /*.user:hover{
            background-color: palevioletred;
            transition-duration: 0s;
        }*/

        .Box {
            border: 1px solid black;
            font: 14px;
            width: 80px;
        }
    </style>
</head>
<body>
<img src="../img/title.png" style="width: 100%">
    <div class="menuDiv" style="float: top">
        当前用户:&nbsp;
    </div>
    <div class="menuDiv">
        <ul>
            <li>
                <u style="color: darkblue;"><c:out value="${username}"></c:out></u>
                <ul class="Box">
                    <li><a href="user/update.jsp">修改密码</a></li>
                    <li><a href="logout.jsp">注销</a></li>
                </ul>
            </li>
        </ul>
    </div>
    <br><br>
    <div align="center">
        <%--<h1>欢迎使用教务信息管理系统</h1>--%>
        <img src="../img/12.png">
    </div><br><br><br>
    <div align="center">
        <input type="button" onclick="location.href='classes/ClassesListServlet'" value="课程管理" class="but">&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" onclick="location.href='student/StudentListServlet'" value="学生管理" class="but">&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" onclick="location.href='teacher/TeacherListServlet'" value="教师管理" class="but">&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" onclick="location.href='grade/GradeListServlet'" value="成绩管理" class="but">&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" onclick="location.href='table/GradeTableServlet'" value="成绩报表" class="but">&nbsp;&nbsp;&nbsp;&nbsp;
        <%--<input type="button" onclick="location.href='user/UserServlet'" value="用户管理" class="but"><br>--%>
    </div>
    <div class="Cooldog_container" style="float: top;top: -100px;">
        <div class="Cooldog_content" style="width: 150%;height: 150%;">
            <ul>
                <li class="p1">
                    <a href="#">
                        <img src="../img/1.png">
                    </a>
                </li>
                <li class="p2">
                    <a href="#">
                        <img src="../img/2.png">
                    </a>
                </li>
                <li class="p3">
                    <a href="#">
                        <img src="../img/4.png">
                    </a>
                </li>
                <li class="p4">
                    <a href="#">
                        <img src="../img/3.png">
                    </a>
                </li>
                <li class="p5">
                    <a href="#">
                        <img src="../img/5.png">
                    </a>
                </li>
                <li class="p5">
                    <a href="#">
                        <img src="../img/6.png">
                    </a>
                </li>
                <li class="p5">
                    <a href="#">
                        <img src="../img/7.png">
                    </a>
                </li>
            </ul>
        </div>
        <a href="javascript:;" class="btn_left">
            <i class="iconfont icon-zuoyoujiantou"></i>
        </a>
        <a href="javascript:;" class="btn_right">
            <i class="iconfont icon-zuoyoujiantou-copy-copy"></i>
        </a>
        <a href="javascript:;" class="btn_close">
            <i class="iconfont icon-icon-test"></i>
        </a>
        <div class="buttons clearfix">
            <a href="javascript:;" class="color"></a>
            <a href="javascript:;"></a>
            <a href="javascript:;"></a>
            <a href="javascript:;"></a>
            <a href="javascript:;"></a>
            <a href="javascript:;"></a>
            <a href="javascript:;"></a>
        </div>
    </div>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/Cooldog.js"></script>
</body>
</html>
