<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/taglibs.jsp" %>
<html>
<head>
    <title>Home</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${ctx}/resources/plugins/layui/css/layui.css"  media="all">
    <link rel="stylesheet" href="${ctx}/resources/plugins/layui/css/modules/layer/default/layer.css">
    <!--引入外部js-->
    <script src="${ctx}/resources/plugins/jquery/jquery-3.2.1.min.js"></script>
    <script src="${ctx}/resources/plugins/layui/layui.js"></script>
    <script src="${ctx}/resources/plugins/layui/lay/modules/layer.js"></script>

    <script src="${ctx}/resources/app/js/home/home.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">家庭管理系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <%--<li class="layui-nav-item"><a href="javascript:void(0);">财务管理</a></li>--%>
            <%--<li class="layui-nav-item"><a href="">权限管理</a></li>
            <li class="layui-nav-item"><a href="">控制台</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>--%>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    ${username}
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="${ctx}/logout">退出登录</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item">
                    <a class="" href="javascript:">账户管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:" target='main_iframe'>银联</a></dd>
                        <dd><a href="javascript:" target='main_iframe'>微信</a></dd>
                        <dd><a href="javascript:" target='main_iframe'>支付宝</a></dd>
                    </dl>
                </li>

                <%--<li class="layui-nav-item">
                    <a href="javascript:">理财管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:" target='main_iframe'>基金管理</a></dd>
                        <dd><a href="javascript:" target='main_iframe'>债券管理</a></dd>
                        <dd><a href="javascript:" target='main_iframe'>股票管理</a></dd>
                    </dl>
                </li>--%>

                <li class="layui-nav-item">
                    <a href="javascript:">收支管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:" target='main_iframe'>收入管理</a></dd>
                        <dd><a href="javascript:" target='main_iframe'>支出管理</a></dd>
                        <%--<dd><a href="javascript:" target='main_iframe'>预算管理</a></dd>--%>
                    </dl>
                </li>

                <li class="layui-nav-item">
                    <a href="javascript:">借贷管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:" target='main_iframe'>借入管理</a></dd>
                        <dd><a href="javascript:" target='main_iframe'>借出管理</a></dd>
                    </dl>
                </li>

                <li class="layui-nav-item">
                    <a href="javascript:">人员管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:" target='main_iframe'>人员管理</a></dd>
                    </dl>
                </li>

                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:">权限管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${ctx}/user/index" target='main_iframe'>权限管理</a></dd>
                    </dl>
                </li>

                <li class="layui-nav-item">
                    <a href="javascript:">轻松一刻</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${ctx}/relax/rose" target='main_iframe'>玫瑰花</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div>
            <iframe id="main_iframe"  name="main_iframe" frameborder="0"
                    height="100%" width="100%" scrolling="auto" >

            </iframe>
        </div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        <a href="http://ccfly.cc/">© Copyright (C) 2017 Jalen. All rights reserved.</a>
    </div>
</div>

<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
</script>

</body>
</html>
