
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成绩报表</title>
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
    </style>
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/echarts-all-3.js"></script>
</head>
<body>
<img src="../../img/16.png" style="width: 100%">
<br>
<br>
<input type="button" onclick="location.href='GradeTableServlet'" value="返回上一页">
<br>
<div align="center">
    <h1>成绩报表</h1>
</div>
<br>
<div align="center">
    <h2><c:out value="学生姓名：${name}"></c:out></h2>
    <br>
    <div id="main" style="width: 900px; height: 550px"></div>
    <script type="text/javascript">
        var myChart = echarts.init(document.getElementById('main'));
        var option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['成绩']
            },
            itemStyle: {
                normal: {
                    // 随机显示
                    color:function(d){return "#"+Math.floor(Math.random()*(256*256*256-1)).toString(16);}

                    // 定制显示（按顺序）
                    // color: function(params) {
                    //     var colorList = ['#C33531','#EFE42A','#64BD3D','#EE9201','#29AAE3', '#B74AE5','#0AAF9F','#E89589','#16A085','#4A235A','#C39BD3 ','#F9E79F','#BA4A00','#ECF0F1','#616A6B','#EAF2F8','#4A235A','#3498DB' ];
                    //     return colorList[params.dataIndex]
                    // }
                },
            },
            label: {
                normal: {
                    show: true,
                    position: 'top',
                    textStyle:{
                        color:'black'
                    }
                }
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    name: '学科',
                    type : 'category',
                    data : ${classes}
                }
            ],
            yAxis : [
                {
                    name:'分数',
                    type : 'value',
                    splitArea : {show : true},
                }
            ],
            series : [
                {
                    name:'分数',
                    type:'bar',
                    data:${grade}
                }
            ]
        };
        myChart.setOption(option);
    </script>
</div>
</body>
</html>
