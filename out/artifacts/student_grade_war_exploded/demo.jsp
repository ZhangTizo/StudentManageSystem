<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html><head><title>安徽科技学院</title>




    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type"><link rel="stylesheet" type="text/css" href="css/index.css"><script type="text/javascript" src="js/jq.js"></script><script type="text/javascript" src="js/jquery_002.js"></script><script type="text/javascript" src="js/jquery_004.js"></script><script type="text/javascript" src="js/slider.js"></script><script id="gjzonedword20150522" charset="UTF-8" src="http://s.pc.qq.com/pcmgr/zonedword/gjzonedword20150522.js" gjguid="c6dc9b266971381cd2b7e2d997cf2bb3" bid="1" sename="百度搜索" seurl="https://www.baidu.com/s?wd=%s&amp;tn=98012088_5_dg&amp;ch=11"></script><script id="gjzonedword20150522" charset="UTF-8" src="http://s.pc.qq.com/pcmgr/zonedword/gjzonedword20150522.js" gjguid="c6dc9b266971381cd2b7e2d997cf2bb3" bid="1" sename="百度搜索" seurl="https://www.baidu.com/s?wd=%s&amp;tn=98012088_5_dg&amp;ch=11"></script>


    <script id="gjzonedword20150522" charset="UTF-8" src="http://s.pc.qq.com/pcmgr/zonedword/gjzonedword20150522.js" gjguid="c6dc9b266971381cd2b7e2d997cf2bb3" bid="1" sename="百度搜索" seurl="https://www.baidu.com/s?wd=%s&amp;tn=98012088_5_dg&amp;ch=11"></script>
    <script type="text/javascript">
        try {
            var urlhash = window.location.hash;
            if (!urlhash.match("fromapp"))
            {
                if ((navigator.userAgent.match(/(iPhone|iPod|Android|ios|iPad|ucweb|Linux|UCBrowser)/i)))
                {
                    window.location="http://www.ahstu.edu.cn/m/";
                }
            }
        }
        catch(err)
        {
        }
    </script>



    <style>
        .tt{
            color:#e2d49c;
            font-size:14px;}
        .tt a{
            color:#e2d49c;
            font-size:15px;
            font-weight:blod;
            text-decoration:none;}

    </style>
    <!--Announced by Visual SiteBuilder 9-->
    <link rel="stylesheet" type="text/css" href="_sitegray/_sitegray_d.css" />
    <script language="javascript" src="_sitegray/_sitegray.js"></script>
    <!-- CustomerNO:77656262657232307b7847545253554a03060000 -->
    <link rel="stylesheet" type="text/css" href="index.vsb.css" />
    <META Name="keywords" Content="安徽科技学院" />
    <script type="text/javascript" src="/system/resource/js/counter.js"></script>
    <script type="text/javascript">_jsq_(1001,'/index.jsp',-1,1265902890)</script>
</head>
<body>
<SCRIPT type="text/javascript">

    function addEvent(obj,evtType,func,cap){

        cap=cap||false;

        if(obj.addEventListener){

            obj.addEventListener(evtType,func,cap);

            return true;

        }else if(obj.attachEvent){

            if(cap){

                obj.setCapture();

                return true;

            }else{

                return obj.attachEvent("on" + evtType,func);

            }

        }else{

            return false;

        }

    }

    function getPageScroll(){

        var xScroll,yScroll;

        if (self.pageXOffset) {

            xScroll = self.pageXOffset;

        } else if (document.documentElement && document.documentElement.scrollLeft){

            xScroll = document.documentElement.scrollLeft;

        } else if (document.body) {

            xScroll = document.body.scrollLeft;

        }

        if (self.pageYOffset) {

            yScroll = self.pageYOffset;

        } else if (document.documentElement && document.documentElement.scrollTop){

            yScroll = document.documentElement.scrollTop;

        } else if (document.body) {

            yScroll = document.body.scrollTop;

        }

        arrayPageScroll = new Array(xScroll,yScroll);

        return arrayPageScroll;

    }

    function GetPageSize(){

        var xScroll, yScroll;

        if (window.innerHeight && window.scrollMaxY) {

            xScroll = document.body.scrollWidth;

            yScroll = window.innerHeight + window.scrollMaxY;

        } else if (document.body.scrollHeight > document.body.offsetHeight){

            xScroll = document.body.scrollWidth;

            yScroll = document.body.scrollHeight;

        } else {

            xScroll = document.body.offsetWidth;

            yScroll = document.body.offsetHeight;

        }

        var windowWidth, windowHeight;

        if (self.innerHeight) {

            windowWidth = self.innerWidth;

            windowHeight = self.innerHeight;

        } else if (document.documentElement && document.documentElement.clientHeight) {

            windowWidth = document.documentElement.clientWidth;

            windowHeight = document.documentElement.clientHeight;

        } else if (document.body) {

            windowWidth = document.body.clientWidth;

            windowHeight = document.body.clientHeight;

        }

        if(yScroll < windowHeight){

            pageHeight = windowHeight;

        } else {

            pageHeight = yScroll;

        }

        if(xScroll < windowWidth){

            pageWidth = windowWidth;

        } else {

            pageWidth = xScroll;

        }

        arrayPageSize = new Array(pageWidth,pageHeight,windowWidth,windowHeight)

        return arrayPageSize;

    }



    var AdMoveConfig=new Object();

    AdMoveConfig.IsInitialized=false;

    AdMoveConfig.ScrollX=0;

    AdMoveConfig.ScrollY=0;

    AdMoveConfig.MoveWidth=0;

    AdMoveConfig.MoveHeight=0;

    AdMoveConfig.Resize=function(){

        var winsize=GetPageSize();

        AdMoveConfig.MoveWidth=winsize[2];

        AdMoveConfig.MoveHeight=winsize[3];

        AdMoveConfig.Scroll();

    }

    AdMoveConfig.Scroll=function(){

        var winscroll=getPageScroll();

        AdMoveConfig.ScrollX=winscroll[0];

        AdMoveConfig.ScrollY=winscroll[1];

    }

    addEvent(window,"resize",AdMoveConfig.Resize);

    addEvent(window,"scroll",AdMoveConfig.Scroll);

    function AdMove(id){

        if(!AdMoveConfig.IsInitialized){

            AdMoveConfig.Resize();

            AdMoveConfig.IsInitialized=true;

        }

        var obj=document.getElementById(id);

        obj.style.position="absolute";

        var W=AdMoveConfig.MoveWidth-obj.offsetWidth;

        var H=AdMoveConfig.MoveHeight-obj.offsetHeight;

        var x = W*Math.random(),y = H*Math.random();

        var rad=(Math.random()+1)*Math.PI/6;

        var kx=Math.sin(rad),ky=Math.cos(rad);

        var dirx = (Math.random()<0.5?1:-1), diry = (Math.random()<0.5?1:-1);

        var step = 1;

        var interval;

        this.SetLocation=function(vx,vy){x=vx;y=vy;}

        this.SetDirection=function(vx,vy){dirx=vx;diry=vy;}

        obj.CustomMethod=function(){

            obj.style.left = (x + AdMoveConfig.ScrollX) + "px";

            obj.style.top = (y + AdMoveConfig.ScrollY) + "px";

            rad=(Math.random()+1)*Math.PI/6;

            W=AdMoveConfig.MoveWidth-obj.offsetWidth;

            H=AdMoveConfig.MoveHeight-obj.offsetHeight;

            x = x + step*kx*dirx;

            if (x < 0){dirx = 1;x = 0;kx=Math.sin(rad);ky=Math.cos(rad);}

            if (x > W){dirx = -1;x = W;kx=Math.sin(rad);ky=Math.cos(rad);}

            y = y + step*ky*diry;

            if (y < 0){diry = 1;y = 0;kx=Math.sin(rad);ky=Math.cos(rad);}

            if (y > H){diry = -1;y = H;kx=Math.sin(rad);ky=Math.cos(rad);}

        }

        this.Run=function(){

            var delay = 10;

            interval=setInterval(obj.CustomMethod,delay);

            obj.onmouseover=function(){clearInterval(interval);}

            obj.onmouseout=function(){interval=setInterval(obj.CustomMethod, delay);}

        }

    }

</SCRIPT>



<div id="ad1" style="z-index: 1000;">
    <IMG src="images/jxcg.png" usemap="#planetmap" alt="" />
    <map name="planetmap" id="planetmap">
        <area shape="rect" coords="0,0,397,64" href="http://www2.ahstu.edu.cn/web/xxnc" target="_blank" />
        <area shape="rect" coords="0,113,397,180" href="http://www.cdgdc.edu.cn/hzbx/bx-index.action?xmbh=BX_2018_1&jlbh=8681" target="_blank" />
    </map>

    </A>

</div>





<SCRIPT type="text/javascript">

    var ad1=new AdMove("ad1");

    ad1.Run();



</SCRIPT>

<div class="head">
    <div class="head-con">
        <div class="head-logo"><!--#begineditable name="LOGO" viewid="127161" tagname="LOGO" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="0" istemp=""-->
            <table border="0" cellspacing="0" cellpadding="0"><tr><td><a href="index.htm" title="安徽科技学院" alt="网站LOGO"><img src="images/logo.png" border="0" alt="安徽科技学院" title="安徽科技学院"></a></td></tr></table><!--#endeditable--></div></div></div>
<div class="nav">
    <div class="nav-con"><!--#begineditable name="网站导航" viewid="127162" tagname="网站导航" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="0" istemp=""-->


        <ul>
            <li> <a href="xxgk1/xxjj.htm" target="_blank" title="学校概况">学校概况</a>
            </li>

            <li> <a href="jxyb.htm" target="_blank" title="教学院部">教学院部</a>
            </li>

            <li> <a href="gljg.htm" target="_blank" title="管理机构">管理机构</a>
            </li>

            <li> <a href="http://www.ahstu.edu.cn/jwc/" target="_blank" title="教育教学">教育教学</a>
            </li>

            <li> <a href="http://www.ahstu.edu.cn/kyc/" target="_blank" title="科学研究">科学研究</a>
            </li>

            <li> <a href="http://www.ahstu.edu.cn/rsc/" target="_blank" title="师资队伍">师资队伍</a>
            </li>

            <li> <a href="http://xgb.ahstu.edu.cn" target="_blank" title="学生工作">学生工作</a>
            </li>

            <li> <a href="http://www.ahstu.edu.cn/zsc/" target="_blank" title="招生就业">招生就业</a>
            </li>

            <li> <a href="http://www.ahstu.edu.cn/yjs/" target="_blank" title="研究生教育">研究生教育</a>
            </li>

            <li> <a href="http://www.ahstu.edu.cn/gjjlhz/" target="_blank" title="国际交流">国际交流</a>
            </li>

            <li> <a href="http://www.ahstu.edu.cn/jxjyxy/" target="_blank" title="继续教育">继续教育</a>
            </li>

            <li> <a href="http://lib.ahstu.edu.cn" target="_blank" title="图书资料">图书资料</a>
            </li>




        </ul>

        <!--#endeditable--></div></div><!--修改banner开始--><!--#begineditable name="图片文章列表-new" viewid="128203" tagname="图片文章列表-new" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="0" istemp=""--><script language="javascript" src="/system/resource/js/dynclicks.js"></script><script language="javascript" src="/system/resource/js/jquery/jquery-latest.min.js"></script><script type="text/javascript" src="js/jq.js"></script>
<script type="text/javascript" src="js/jquery_002.js"></script>
<script type="text/javascript" src="js/jquery_004.js"></script>
<script type="text/javascript" src="js/slider.js"></script>

<div class="iosSliderDemo">
    <div class="fluidHeight">
        <div class="sliderContainer">
            <div class="iosSlider">
                <div class="slider">








                    <div class="item item1">
                        <div class="inner">
                            <a href="javascript:void()"><img src="img/D9D7433B74BB3124E92126E5C6A_773F020F_AEA19.jpg" title=""></a>
                            <div class="selectorShadow"></div>
                            <div class="text1"><span>合影留念</span></div>

                        </div>
                    </div>



                    <div class="item item1">
                        <div class="inner">
                            <a href="javascript:void()"><img src="img/7F54CD13225DA69E305E6BE244F_A9E70E2D_7B861.jpg" title=""></a>
                            <div class="selectorShadow"></div>
                            <div class="text1"><span>毕业季</span></div>

                        </div>
                    </div>



                    <div class="item item1">
                        <div class="inner">
                            <a href="javascript:void()"><img src="img/75B6ABC7EE00FF621F22AFDC99E_47BB3A92_68690.jpg" title=""></a>
                            <div class="selectorShadow"></div>
                            <div class="text1"><span>认真学习宣传贯彻党的十九大精神</span></div>

                        </div>
                    </div>



                    <div class="item item1">
                        <div class="inner">
                            <a href="javascript:void()"><img src="img/19DE9459DA1BCFA88CBC0DFAA88_4AB831AA_F2E54.jpg" title=""></a>
                            <div class="selectorShadow"></div>
                            <div class="text1"><span>又是一年银杏黄</span></div>

                        </div>
                    </div>



                    <div class="item item1">
                        <div class="inner">
                            <a href="javascript:void()"><img src="img/048ED9385C8D6A6978F104B9F0D_A66AC11D_853A5.jpg" title=""></a>
                            <div class="selectorShadow"></div>
                            <div class="text1"><span>龙湖校区军训</span></div>

                        </div>
                    </div>



                    <div class="item item1">
                        <div class="inner">
                            <a href="javascript:void()"><img src="img/355ACFCE646A3D68EBA7953D0E0_9EC4F7F4_98A8C.jpg" title=""></a>
                            <div class="selectorShadow"></div>
                            <div class="text1"><span>中都鼓韵</span></div>

                        </div>
                    </div>



                    <div class="item item1">
                        <div class="inner">
                            <a href="javascript:void()"><img src="img/D19039521B8EF10CFDB92BBB9DA_52AE1FE0_85AB6.jpg" title=""></a>
                            <div class="selectorShadow"></div>
                            <div class="text1"><span>精神辈出的地方</span></div>

                        </div>
                    </div>



                    <div class="item item1">
                        <div class="inner">
                            <a href="javascript:void()"><img src="../img/A200577CAE4200A92AF48966E55_6CD857D2_21852.jpg" title=""></a>
                            <div class="selectorShadow"></div>
                            <div class="text1"><span>凤阳校区一角</span></div>

                        </div>
                    </div>



                    <div class="item item1">
                        <div class="inner">
                            <a href="javascript:void()"><img src="../img/3F99E2006F91320FB2ED794B5FD_5CC7DC63_64DA8.jpg" title=""></a>
                            <div class="selectorShadow"></div>
                            <div class="text1"><span>龙湖校区南向总体示意图鸟瞰</span></div>

                        </div>
                    </div>



                    <div class="item item1">
                        <div class="inner">
                            <a href="javascript:void()"><img src="../img/3D563292917E671898560374599_36D9A6F0_87826.jpg" title=""></a>
                            <div class="selectorShadow"></div>
                            <div class="text1"><span>凤阳校区西区鸟瞰</span></div>

                        </div>
                    </div>

                </div>
            </div>
            <div class="slideSelectors">
                <div class="prev"></div>
                <div class="item selected"></div>
                <div class="item"></div>
                <div class="item"></div>
                <div class="item"></div>
                <div class="item"></div>
                <div class="item"></div>
                <div class="item"></div>

                <div class="next"></div>
            </div>
            <div class="scrollbarContainer"></div>
        </div>
    </div>
</div>






<script>_showDynClickBatch(['dynclicks_u2_16622','dynclicks_u2_16602','dynclicks_u2_13254','dynclicks_u2_13685','dynclicks_u2_12881','dynclicks_u2_13255','dynclicks_u2_13455','dynclicks_u2_12670','dynclicks_u2_6417','dynclicks_u2_6168'],[16622,16602,13254,13685,12881,13255,13455,12670,6417,6168],"wbnews", 1265902890)</script>
<!--#endeditable--><!--修改banner结束-->
<div class="maintain">
    <div class="new">
        <h2 style="height: 48px; line-height: 48px"><a href="index/akxw.htm" target="_blank">安科新闻</a><small>NEWS</small> <!--#begineditable name="标题列表-浮动字幕" viewid="127613" tagname="标题列表-浮动字幕" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="0" istemp=""-->  <marquee direction="left" width="800" height="40" scrollamount="2" scrolldelay="10" onMouseOver="this.stop()" onMouseOut="this.start()" style="vertical-align:middle;overflow-x:hidden;overflow-y:hidden;">


            <a href="http://www.ahstu.edu.cn/index/cpyc.htm " target="_blank" style="TEXT-DECORATION: none"><span style="font-size:16px;color:#a40000;margin-right:20px;">安徽科技学院2018年诚聘英才</span></a>&nbsp;&nbsp; &nbsp; &nbsp; &nbsp;

        </marquee>

            <script>_showDynClickBatch(['dynclicks_u3_16318'],[16318],"wbnews", 1265902890)</script>
            <!--#endeditable--><span class="more"><a href="index/akxw.htm" target="_blank"><img src="images/more.jpg"></a></span></h2><!--#begineditable name="标题列表-安科新闻" viewid="127167" tagname="标题列表-安科新闻" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="0" istemp=""-->

        <DIV class="newL"><A href="info/1014/16799.htm" target="_blank"><IMG src="/__local/0/54/AF/DB3629DDBB25628093644CA6DB1_69B70151_33731.jpg" width="340" height="190"></A> <A href="info/1014/16799.htm" title="学校召开“讲忠诚、严纪律、立政德”专题警示教育动员部署会议" target="_blank">
            <H3>学校召开“讲忠诚、严纪律、立政...</H3></A><A href="info/1014/16799.htm" target="_blank">
            <P>7月6日，学校在会议中心一楼报告厅召开“讲忠诚、严纪律、立政德”专题警示教育动员部署会议，传达学习全省“讲忠诚、严纪律、立政德”专题警示教育推...</P></A></DIV>

        <DIV class="newR">
            <UL>


                <LI><A href="info/1014/16930.htm" title="​校领导出席“安徽科技学院优质生源基地”挂牌仪式" target="_blank">​校领导出席“安徽科技学院优质...</A> <SPAN class="new-time"><SMALL>07-19</SMALL></SPAN> </LI>



                <LI><A href="info/1014/16928.htm" title="我校团队参加第四届中国“互联网+”大学生创新创业大赛“青年红色筑梦之旅”对接活动（江西）" target="_blank">我校团队参加第四届中国“互联网+...</A> <SPAN class="new-time"><SMALL>07-19</SMALL></SPAN> </LI>



                <LI><A href="info/1014/16929.htm" title="“青春大学习 建功新时代”暑期社会实践系列报道之六：追寻改革足迹 助力城乡振兴" target="_blank">“青春大学习 建功新时代”暑期社...</A> <SPAN class="new-time"><SMALL>07-19</SMALL></SPAN> </LI>



                <LI><A href="info/1014/16927.htm" title="“青春大学习 建功新时代”暑期社会实践系列报道之五：传承红色精神  牢记青春使命" target="_blank">“青春大学习 建功新时代”暑期社...</A> <SPAN class="new-time"><SMALL>07-19</SMALL></SPAN> </LI>



                <LI><A href="info/1014/16923.htm" title="学校召开预算执行与财务收支审计整改动员部署会" target="_blank">学校召开预算执行与财务收支审计...</A> <SPAN class="new-time"><SMALL>07-19</SMALL></SPAN> </LI>



            </UL></DIV>
        <DIV class="newR newRR">
            <UL>

                <LI><A href="info/1014/16907.htm" title="“青春大学习 建功新时代”暑期社会实践系列报道之四：助力禁毒防艾 共建美好珠城" target="_blank">“青春大学习 建功新时代”暑期社...</A> <SPAN class="new-time"><SMALL>07-16</SMALL></SPAN> </LI>



                <LI><A href="info/1014/16905.htm" title="学校赴蚌埠、滁州开展家庭经济困难学生走访慰问活动" target="_blank">学校赴蚌埠、滁州开展家庭经济困...</A> <SPAN class="new-time"><SMALL>07-16</SMALL></SPAN> </LI>



                <LI><A href="info/1014/16904.htm" title="八六级农教专业校友毕业三十周年荣归母校" target="_blank">八六级农教专业校友毕业三十周年...</A> <SPAN class="new-time"><SMALL>07-16</SMALL></SPAN> </LI>



                <LI><A href="info/1014/16900.htm" title="校领导率队参加全国独立设置职业技术师范院校2018年教学研讨会" target="_blank">校领导率队参加全国独立设置职业...</A> <SPAN class="new-time"><SMALL>07-15</SMALL></SPAN> </LI>



                <LI><A href="info/1014/16899.htm" title="我校教师荣获“2017年度全省高校优秀辅导员”荣誉称号" target="_blank">我校教师荣获“2017年度全省高校...</A> <SPAN class="new-time"><SMALL>07-15</SMALL></SPAN> </LI>

            </UL></DIV><script>_showDynClickBatch(['dynclicks_u4_16799','dynclicks_u4_16930','dynclicks_u4_16928','dynclicks_u4_16929','dynclicks_u4_16927','dynclicks_u4_16923','dynclicks_u4_16907','dynclicks_u4_16905','dynclicks_u4_16904','dynclicks_u4_16900','dynclicks_u4_16899'],[16799,16930,16928,16929,16927,16923,16907,16905,16904,16900,16899],"wbnews", 1265902890)</script>
        <!--#endeditable--></div>
    <div class="artical">
        <div class="new notice"><!--#begineditable name="标题列表-通知公告" viewid="127168" tagname="标题列表-通知公告" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="0" istemp=""-->
            <h2><a href="index/tzgg.htm" target="_blank">通知公告</a><small>NOTICE</small> <span class="more"><a href="index/tzgg.htm" target="_blank"><img src="images/more.jpg"></a></span></h2>



            <table height="45" cellspacing="10" width="100%" border="0" style="margin-bottom: 5px;text-align: left">
                <tbody>
                <tr>
                    <td width="55">
                        <table cellspacing="1" cellpadding="0" width="100%" border="0" style="background-color: #dba018">
                            <tbody>
                            <tr>
                                <td height="17" align="center" style="color: #ffffff">July </td></tr>
                            <tr>
                                <td bgcolor="#ffffff" height="20" align="center"><span>2</span></td></tr></tbody></table></td>
                    <td>
                        <table cellspacing="0" cellpadding="0" width="100%" border="0">
                            <tbody>
                            <tr>
                                <td class="to-list" height="40" valign="top"><a href="info/1015/16740.htm" title="关于2018年暑期安排的通知" target="_blank">关于2018年暑期安排的通知</a> </td></tr></tbody></table></td></tr></tbody></table>






            <table height="45" cellspacing="10" width="100%" border="0" style="margin-bottom: 5px;text-align: left">
                <tbody>
                <tr>
                    <td width="55">
                        <table cellspacing="1" cellpadding="0" width="100%" border="0" style="background-color: #dba018">
                            <tbody>
                            <tr>
                                <td height="17" align="center" style="color: #ffffff">July </td></tr>
                            <tr>
                                <td bgcolor="#ffffff" height="20" align="center"><span>17</span></td></tr></tbody></table></td>
                    <td>
                        <table cellspacing="0" cellpadding="0" width="100%" border="0">
                            <tbody>
                            <tr>
                                <td class="to-list" height="40" valign="top"><a href="info/1015/16914.htm" title="关于举办安徽科技学院“纪念改革开放40周年”书画、摄影大赛的通知" target="_blank">关于举办安徽科技学院“纪念改革开放40周年”书画、摄影大赛...</a> </td></tr></tbody></table></td></tr></tbody></table>






            <table height="45" cellspacing="10" width="100%" border="0" style="margin-bottom: 5px;text-align: left">
                <tbody>
                <tr>
                    <td width="55">
                        <table cellspacing="1" cellpadding="0" width="100%" border="0" style="background-color: #dba018">
                            <tbody>
                            <tr>
                                <td height="17" align="center" style="color: #ffffff">July </td></tr>
                            <tr>
                                <td bgcolor="#ffffff" height="20" align="center"><span>16</span></td></tr></tbody></table></td>
                    <td>
                        <table cellspacing="0" cellpadding="0" width="100%" border="0">
                            <tbody>
                            <tr>
                                <td class="to-list" height="40" valign="top"><a href="info/1015/16906.htm" title="关于开展2018年度安徽省学术和技术带头人及后备人选学术科研活动资助经费申报工作的通知" target="_blank">关于开展2018年度安徽省学术和技术带头人及后备人选学术科研...</a> </td></tr></tbody></table></td></tr></tbody></table>




            <script>_showDynClickBatch(['dynclicks_u5_16740','dynclicks_u5_16914','dynclicks_u5_16906'],[16740,16914,16906],"wbnews", 1265902890)</script>
            <!--#endeditable--></div>
        <div class="new notice"><!--#begineditable name="标题列表-校园动态" viewid="127169" tagname="标题列表-校园动态" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="0" istemp=""-->
            <h2><a href="index/xydt.htm" target="_blank">校园动态</a><small>DYNAMIC</small> <span class="more"><a href="index/xydt.htm" target="_blank"><img src="images/more.jpg"></a></span></h2>
            <div class="n-listcon">
                <ul>

                    <li><a href="info/1016/16931.htm" title="电气与电子工程学院开展慰问暑期留宿学生活动" target="_blank">电气与电子工程学院开展慰问暑期留宿...</a> <span class="new-time"><SMALL>07-20</SMALL></span> </li>

                    <li><a href="info/1016/16924.htm" title="建筑学院社会实践报道一：走进西递宏村，探寻历史文化遗产" target="_blank">建筑学院社会实践报道一：走进西递宏...</a> <span class="new-time"><SMALL>07-19</SMALL></span> </li>

                    <li><a href="info/1016/16922.htm" title="财经学院“青春大学习 建功新时代”暑期社会实践系列报道之二：蚌埠市居民就诊检查及健康意识调查" target="_blank">财经学院“青春大学习 建功新时代”暑...</a> <span class="new-time"><SMALL>07-18</SMALL></span> </li>

                    <li><a href="info/1016/16921.htm" title="生命与健康科学学院学子实践系列报道之二：赴南京缅怀先烈 察青年爱国梦" target="_blank">生命与健康科学学院学子实践系列报道...</a> <span class="new-time"><SMALL>07-18</SMALL></span> </li>

                    <li><a href="info/1016/16920.htm" title="生命与健康科学学院学子实践系列报道之一：赴国家级贫困县 助理精准扶贫" target="_blank">生命与健康科学学院学子实践系列报道...</a> <span class="new-time"><SMALL>07-18</SMALL></span> </li>

                    <li><a href="info/1016/16919.htm" title="农学院学子实践进行时之四：精准扶贫，我们在行动" target="_blank">农学院学子实践进行时之四：精准扶贫...</a> <span class="new-time"><SMALL>07-17</SMALL></span> </li>


                </ul>


            </div>
            <script>_showDynClickBatch(['dynclicks_u6_16931','dynclicks_u6_16924','dynclicks_u6_16922','dynclicks_u6_16921','dynclicks_u6_16920','dynclicks_u6_16919'],[16931,16924,16922,16921,16920,16919],"wbnews", 1265902890)</script>
            <!--#endeditable--></div>
        <div class="new notice"><!--#begineditable name="标题列表-学术信息" viewid="127170" tagname="标题列表-学术信息" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="0" istemp=""-->
            <h2><a href="index/xsxx.htm" target="_blank">学术信息</a><small>SCIENTIFIC</small> <span class="more"><a href="index/xsxx.htm" target="_blank"><img src="images/more.jpg"></a></span></h2>
            <div class="n-listcon">
                <ul>

                    <li><a href="info/1017/16932.htm" title="关于进一步规范横向科研项目合同管理的通知" target="_blank">关于进一步规范横向科研项目合同管理...</a> <span class="new-time"><SMALL>07-20</SMALL></span> </li>

                    <li><a href="info/1017/16911.htm" title="关于推荐2018年度高等学校科学研究优秀成果奖的公示" target="_blank">关于推荐2018年度高等学校科学研究优...</a> <span class="new-time"><SMALL>07-16</SMALL></span> </li>

                    <li><a href="info/1017/16814.htm" title="关于推荐2018年度高等学校科学研究自然科学技术奖的公示" target="_blank">关于推荐2018年度高等学校科学研究自...</a> <span class="new-time"><SMALL>07-09</SMALL></span> </li>

                    <li><a href="info/1017/16728.htm" title="关于报送2018年度省自然科学基金项目绩效目标的通知" target="_blank">关于报送2018年度省自然科学基金项目...</a> <span class="new-time"><SMALL>06-30</SMALL></span> </li>

                    <li><a href="info/1017/16574.htm" title="关于拟推荐2018年度上海外语教育出版社外语类委托研究项目的公示" target="_blank">关于拟推荐2018年度上海外语教育出版...</a> <span class="new-time"><SMALL>06-15</SMALL></span> </li>

                    <li><a href="info/1017/16546.htm" title="关于组织申报国家创新方法工作专项2018年度项目的通知" target="_blank">关于组织申报国家创新方法工作专项201...</a> <span class="new-time"><SMALL>06-14</SMALL></span> </li>


                </ul>


            </div> <script>_showDynClickBatch(['dynclicks_u7_16932','dynclicks_u7_16911','dynclicks_u7_16814','dynclicks_u7_16728','dynclicks_u7_16574','dynclicks_u7_16546'],[16932,16911,16814,16728,16574,16546],"wbnews", 1265902890)</script>
            <!--#endeditable--></div></div>
    <div class="clean"></div></div>
<div class="link">
    <div class="link-con"><!--#begineditable name="链接列表-重要链接" viewid="127172" tagname="链接列表-重要链接" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="0" istemp=""--><script language="javascript" src="/system/resource/js/openlink.js"></script><UL>

        <LI><A href="http://211.70.48.79/part/bgxt.html" target="_blank">

            <DIV class="name-bg"></DIV>










            <DIV>办公系统</DIV></A></LI>



        <LI><A href="http://portal.ahstu.edu.cn" target="_blank">

            <DIV class="name-fw"></DIV>










            <DIV>数字化校园</DIV></A></LI>



        <LI><A href="http://jwxt.ahstu.edu.cn" target="_blank">

            <DIV class="name-jw"></DIV>










            <DIV>教务系统</DIV></A></LI>



        <LI><A href="http://mail.ahstu.edu.cn/" target="_blank">
            <DIV class="name-yj"></DIV>










            <DIV>邮件系统</DIV></A></LI>



        <LI><A href="xgxt.htm" target="_blank">

            <DIV class="name-xg"></DIV>










            <DIV>学工系统</DIV></A></LI>



        <LI><A href="http://172.16.250.201:8080/" target="_blank">

            <DIV class="name-cw"></DIV>










            <DIV>财务平台</DIV></A></LI>



        <LI><A href="fwcn.htm" target="_blank">
            <DIV class="name-cn"></DIV>










            <DIV>服务承诺</DIV></A></LI>



        <LI><A href="index/cpyc.htm" target="_blank">

            <DIV class="name-cp"></DIV>









            <DIV>诚聘英才</DIV></A></LI>



        <LI><A href="http://www.ahstu.edu.cn/zbcg" target="_blank">

            <DIV class="name-zb"></DIV>









            <DIV>招标采购</DIV></A></LI>



        <LI><A href="http://www.ahstu.edu.cn/xxgk/" target="_blank">


            <DIV class="name-xx"></DIV>








            <DIV>信息公开</DIV></A></LI>



        <LI><A href="http://www.ahstu.edu.cn/index/ldxx.htm" target="_blank">



            <DIV class="name-ld"></DIV>







            <DIV>领导信箱</DIV></A></LI>




    </UL><!--#endeditable--></div></div>
<div class="footb">
    <div class="foot-con">
        <div class="box1">
            <h4>专题专栏</h4><!--#begineditable name="专题链接1列表" viewid="182050" tagname="专题链接1列表" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="" istemp=""--><UL class="foot-list">
            <LI><a href="http://www.ahstu.edu.cn/longhu/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13108)">新校区建设</a></li>
            <LI><a href="http://211.70.48.79/bkzlgc/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13022)">应用大学建设</a></li>
            <LI><a href="http://www.ahstu.edu.cn/lx1z/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13020)">两学一做</a></li>
            <LI><a href="http://211.70.48.79/Part/ahxywh/xywh.html" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13021)">校园文化</a></li>
            <LI><a href="http://www.ahstu.edu.cn/wmw/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13019)">文明创建</a></li>
        </UL><!--#endeditable--><!--#begineditable name="专题链接2列表-" viewid="182052" tagname="专题链接2列表-" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="" istemp=""--><UL class="foot-list">
            <LI><a href="http://211.70.48.79/Part/Jpkc.shtml" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13109)">精品课程</a></li>
            <LI><a href="http://www.ahstu.edu.cn/llxx/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13023)">理论学习</a></li>
            <LI><a href="http://www.ahstu.edu.cn/zdxg/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13024)">中都弦歌</a></li>
            <LI><a href="http://211.70.48.11/web/cyzx/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13025)">创业教育</a></li>
            <li><a href="ztzl.htm" target="_blank"><small>MORE &gt;&gt;</small></a></li>
        </UL><!--#endeditable--></div>
        <div class="box1">
            <h4>常用服务</h4><!--#begineditable name="常用服务1列表" viewid="182053" tagname="常用服务1列表" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="" istemp=""--><UL class="foot-list">
            <LI><a href="http://zdxg.ahstu.edu.cn/zxpt/" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 18154)">服务平台</a></li>
            <LI><a href="mailto:xcb@ahstu.edu.cn" title="xcb@ahstu.edu.cn" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13110)">投稿信箱</a></li>
            <LI><a href="http://www.ahstu.edu.cn/hqgs/fwcn.htm" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13077)">维修服务</a></li>
            <LI><a href="http://10.100.2.6/web/b/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13078)">报告厅申请</a></li>
            <LI><a href="http://10.100.2.6/web/hf/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13187)">横幅申请</a></li>
        </UL><!--#endeditable--><!--#begineditable name="常用服务2列表" viewid="182054" tagname="常用服务2列表" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="" istemp=""--><UL class="foot-list">
            <LI><a href="https://211.70.50.91/welcome.php" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13082)">VPN</a></li>

            <LI><a href="http://www.icourses.cn/home/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13083)">视频公开课</a></li>

            <LI><a href="index/xcbc.htm" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13084)">校车班次</a></li>

            <LI><a href="http://www.ahstu.edu.cn/jwc/list.jsp?urltype=tree.TreeTempUrl&amp;wbtreeid=1969" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13111)">校历查询</a></li>

            <li><a href="cyfw.htm" target="_blank"><small>MORE &gt;&gt;</small></a></li>

        </UL><!--#endeditable--></div>
        <div class="box1">
            <h4>友情链接</h4><!--#begineditable name="友情链接1列表" viewid="182055" tagname="友情链接1列表" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="" istemp=""--><UL class="foot-list">
            <LI><a href="http://www.moe.edu.cn/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13086)">教育部</a></li>
            <LI><a href="http://www.ahedu.gov.cn/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13087)">安徽教育网</a></li>
            <LI><a href="http://211.70.48.79/part/pingtai.html" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13088)">省级科研平台</a></li>
            <LI><a href="http://www.hao123.com/edu" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13089)">中国大学</a></li>
            <LI><a href="http://www.anhuinews.com/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13189)">中安在线</a></li>
        </UL><!--#endeditable--><!--#begineditable name="友情链接2列表" viewid="182056" tagname="友情链接2列表" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="" istemp=""--><UL class="foot-list">
            <LI><a href="http://www.most.gov.cn/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13090)">科技部</a></li>
            <LI><a href="http://www.ahgj.gov.cn/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13091)">安徽高教网</a></li>
            <LI><a href="http://211.70.48.79/jt/index.html" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13092)">农业职业教育</a></li>
            <LI><a href="http://paper.jyb.cn/" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13093)">中国教育报</a></li>
            <li><a href="yqlj.htm" target="_blank"><small>MORE &gt;&gt;</small></a></li>
        </UL><!--#endeditable--></div>
        <div class="box1 fd">
            <div class="media"><!--#begineditable name="微博链接列表" viewid="182058" tagname="微博链接列表" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="" istemp="true"--><UL>


                <LI>
                    <DIV class="wb">
                        <A href="http://weibo.com/ahstunews" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13094)"></A></DIV>

                    <DIV>微博</DIV>



                </LI>






                <LI>
                    <DIV class="wx" id="weixin">
                        <A href="#" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13095)"></A></DIV>
                    <DIV>微信</DIV>

                    <div class="wx-img" style="display:none">
                        <div class="wx-img-con">
                            <div>
                                <img src="images/gw.jpg">
                            </div>
                            <div class="wx-img-name">安科官方微信</div>
                        </div>

                        <div class="wx-img-con">
                            <div>
                                <img src="images/jy.png">
                            </div>
                            <div class="wx-img-name">毕业生就业指导中心</div>
                        </div>
                        <div class="wx-img-con">
                            <div>
                                <img src="images/xt.png">
                            </div>
                            <div class="xt-img-name">安科小团</div>
                        </div>
                        <div class="wx-img-con">
                            <div>
                                <img src="images/zsb.png">
                            </div>
                            <div class="wx-img-name">招生办公室</div>
                        </div>
                        <div class="wx-img-con">
                            <div>
                                <img src="images/zz.png">
                            </div>
                            <div class="wx-img-name">学生资助管理中心</div>
                        </div>
                    </div>





                </LI>







                <LI>
                    <DIV class="mt">
                        <A href="http://www.ahstu.edu.cn/index/mtak.htm" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13096)"></A></DIV>
                    <DIV>媒体</DIV>



                </LI>





                <LI>
                    <DIV class="sp">
                        <A href="http://www.ahstu.edu.cn/index/spxw.htm" target="_blank" title="" onclick="_addDynClicks(&#34;wburl&#34;, 1265902890, 13069)"></A></DIV>
                    <DIV>视频</DIV>



                </LI>

            </UL>
                <script type="text/javascript">
                    $(document).ready(function(){
                        $("#weixin").hover(function(){
                            $(".wx-img").fadeToggle("slow");
                        });
                    });
                </script><!--#endeditable--></div>
            <div class="clean"></div>
            <div><!--#begineditable name="简单检索1" viewid="127269" tagname="简单检索1" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="" istemp="true"-->





                <form action="search.jsp?wbtreeid=1001" method="post" name="a127269a" onsubmit="return subsearchdataa127269a()" style="display: inline;">
                    <input type="hidden" name="Find" value="find"><input type="hidden" name="entrymode" value="1"><input type="hidden" id="INTEXT2" name="INTEXT2" value=""><input type="hidden" name="news_search_code">
                    <table border="0" cellspacing="1" cellpadding="0">
                        <tr>
                            <td Valign="middle" nowrap="nowrap" height="22">
                                <span style="font-size:9pt;"></span>
                                <input type="hidden" name="condition" value="0">   </td><td>
                            <span id="intextspana127269a"></span>
                            <iframe id="intextframea127269a" src="about:blank" scrolling="no" frameborder="0" style="position:absolute;top:0px;left:0px;display:none;"></iframe>
                            <input name="INTEXT" class="inp1">
                        </td>
                            <td align="absmiddle" nowrap="nowrap" height="1">

                                <input class="search" type="submit" value="搜索" name="ie">
                            </td>
                        </tr>
                    </table>
                </form>
                <script>
                    String.prototype.trim　= function()
                    {
                        var t = this.replace(/(^\s*)|(\s*$)/g, "");
                        return t.replace(/(^　*)|(　*$)/g, "");
                    }
                    function subsearchdataa127269a()
                    {
                        if(document.a127269a.INTEXT.value.trim()=="")
                        {
                            alert("请输入查询关键字！");
                            return false;
                        }
                        if(checkDataa127269a(document.a127269a))
                        {
                            return true;
                        }
                        return false;
                    }
                </script>

                <script language="JavaScript" src="_dwr/engine.js"></script>
                <script language="JavaScript" src="_dwr/util.js"></script>
                <script language="JavaScript" src="_dwr/interface/NewsSearchDWR.js"></script>
                <script language="JavaScript" src="/system/resource/js/vsb_news_search.js"></script>
                <script language="JavaScript" src="/system/resource/js/vsb_news_search_entry.js"></script>
                <script language="JavaScript" src="/system/resource/js/language.js"></script>
                <script language="JavaScript" src="/system/resource/js/base64.js"></script>
                <script language="JavaScript" src="/system/resource/js/formfunc.js"></script>

                <script>
                    news_searcha127269a = new vsb_news_search();
                    news_searcha127269a.isShowCode=false;
                    news_searcha127269a.tooltipid = 'tooltipa127269a';
                    news_searcha127269a.apptag = 'intextspana127269a';
                    news_searcha127269a.frametag = 'intextframea127269a';
                    news_search_entrya127269a = new vsb_news_search_entry();
                    news_search_entrya127269a.formname = "a127269a";
                    news_search_entrya127269a.news_search_obj = news_searcha127269a;
                    news_search_entrya127269a.querytxtsize = 155
                    news_search_entrya127269a.yzmts ="您的查询过于频繁，请输入验证码后继续查询";
                    news_search_entrya127269a.qdstyle ="";
                    news_search_entrya127269a.qdname = "确定";
                    news_search_entrya127269a.qxstyle = "";
                    news_search_entrya127269a.qxname = "取消";
                    function checkDataa127269a(formname)
                    {
                        return news_search_entrya127269a.checkdata(formname)
                    }
                </script>
                <script language="javascript" src="/system/resource/js/base64.js"></script>
                <!--#endeditable--></div></div></div></div>
<div class="copyright"><!--#begineditable name="版权" viewid="127188" tagname="版权" action="" layout="" contype="" stylesysid="" template="" tplstyle="" clone="0" istemp=""--><!-- 版权内容请在本组件"内容配置-版权"处填写 -->
    <p>
        邮政编码：233100 地址：安徽省凤阳县东华路9号（凤阳校区） 蚌埠市黄山大道1501号(龙湖校区) Copyright©
        &nbsp;<a href="http://211.70.48.81:8080/lg" target="_blank" textvalue="安徽科技学院 " style="COLOR: #e2d49c">安徽科技学院 </a>皖ICP备12009839号 <a href="http://211.70.48.79/english/english.htm" target="_blank" style="COLOR: #e2d49c">English </a><a href="/tougao.jsp?wbtreeid=1001" target="_blank" style="COLOR: #e2d49c">在线投稿 </a>
    </p><!--#endeditable--></div>
<div style="width:300px;margin:0 auto; padding:20px 0;">
    <a target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=34112602000142" style="display:inline-block;text-decoration:none;height:20px;line-height:20px;"><img src="images/batb.png" style="float:left;" /><p style="float:left;height:20px;line-height:20px;margin: 0px 0px 0px 5px; color:#939393;">皖公网安备 34112602000142号</p></a>
</div>
<div></div>
<div style="display:none;"><!--#begineditable name="RSS文章发布" viewid="128914" tagname="RSS文章发布" action="" layout="" contype="news" stylesysid="" template="" tplstyle="" clone="" istemp=""-->




    <a href="/system/resource/code/rss/rssfeed.jsp?type=list&treeid=1001&viewid=128914&mode=10&dbname=vsb&owner=1265902890&ownername=ahkjxy&contentid=118540&number=20" target="_blank"><img src="/system/resource/images/rss/rss.gif" border="0" align="absmiddle"></a><!--#endeditable--></div>
<div style="display:none;"><!--#begineditable name="RSS通知公告文章发布" viewid="128915" tagname="RSS通知公告文章发布" action="" layout="" contype="news" stylesysid="" template="" tplstyle="" clone="" istemp=""-->




    <a href="/system/resource/code/rss/rssfeed.jsp?type=list&treeid=1001&viewid=128915&mode=10&dbname=vsb&owner=1265902890&ownername=ahkjxy&contentid=118541&number=20" target="_blank"><img src="/system/resource/images/rss/rss.gif" border="0" align="absmiddle"></a><!--#endeditable--></div>
<div style="display:none;"><!--#begineditable name="RSS校园动态文章发布" viewid="128916" tagname="RSS校园动态文章发布" action="" layout="" contype="news" stylesysid="" template="" tplstyle="" clone="" istemp=""-->




    <a href="/system/resource/code/rss/rssfeed.jsp?type=list&treeid=1001&viewid=128916&mode=10&dbname=vsb&owner=1265902890&ownername=ahkjxy&contentid=118542&number=20" target="_blank"><img src="/system/resource/images/rss/rss.gif" border="0" align="absmiddle"></a><!--#endeditable--></div>
<div style="display:none;"><!--#begineditable name="RSS学术信息文章发布" viewid="128917" tagname="RSS学术信息文章发布" action="" layout="" contype="news" stylesysid="" template="" tplstyle="" clone="" istemp=""-->




    <a href="/system/resource/code/rss/rssfeed.jsp?type=list&treeid=1001&viewid=128917&mode=10&dbname=vsb&owner=1265902890&ownername=ahkjxy&contentid=118543&number=20" target="_blank"><img src="/system/resource/images/rss/rss.gif" border="0" align="absmiddle"></a><!--#endeditable--></div>
</body></html>
