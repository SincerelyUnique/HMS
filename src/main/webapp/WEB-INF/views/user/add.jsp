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

    <script src="${ctx}/resources/app/js/user/add.js"></script>

    <style>
        .layui-textarea{
            width: 400px;
        }
        .layui-input{
            width: 400px;
        }
    </style>
</head>
<body>
    <form id="addForm" class="layui-form">
        <br>
        <div class="layui-form-item">
            <label class="layui-form-label">账号</label>
            <div class="layui-input-block">
                <input type="text" id="username" name="username" autocomplete="off" placeholder="请输入账号" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">密码</label>
            <div class="layui-input-block">
                <input type="password" id="password" name="password" lay-verify="email" autocomplete="off" placeholder="请输入密码" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">角色</label>
            <div class="layui-input-block">
                <input type="text" id="userRole" name="userRole" lay-verify="email" autocomplete="off" placeholder="请设置角色" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">是否启用</label>
            <div class="layui-input-block">
                <input type="text" id="enable" name="enable" autocomplete="off" placeholder="是否启用,0为禁用，1为启用" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">电子邮箱</label>
            <div class="layui-input-block">
                <input type="text" id="email" name="email" autocomplete="off" placeholder="电子邮箱" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">电话号码</label>
            <div class="layui-input-block">
                <input type="text" id="telephone" name="telephone" autocomplete="off" placeholder="电话号码" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">备注</label>
            <div class="layui-input-block">
                <textarea id="remark" name="remark" placeholder="请输入备注" class="layui-textarea"></textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                <button class="layui-btn" onclick="saveAdd()" lay-submit="" lay-filter="save">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</body>
</html>
