<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/taglibs.jsp" %>
<html>
<head>
    <title>Home</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${ctx}/resources/plugins/layui/css/layui.css"  media="all">
    <link rel="stylesheet" href="${ctx}/resources/app/css/common.css"  media="all">
    <link rel="stylesheet" href="${ctx}/resources/plugins/layui/css/modules/layer/default/layer.css">
    <script src="${ctx}/resources/app/js/user/mail.js"></script>
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
    <form id="mailForm" class="layui-form">
        <br>
        <div class="layui-form-item">
            <label class="layui-form-label">寄件人地址</label>
            <div class="layui-input-block">
                <!-- 这里的user对象是当前登录的用户信息，从session中获取 -->
                <input type="text" id="senderAddress" name="senderAddress" value="${user.email}" lay-verify="email" autocomplete="off" placeholder="请输入寄件人地址" class="layui-input" readonly>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">收件人地址</label>
            <div class="layui-input-block">
                <input type="text" id="recipientAddress" name="recipientAddress" value="${userInfo.email}" lay-verify="email" autocomplete="off" placeholder="请输入收件人地址" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">邮件主题</label>
            <div class="layui-input-block">
                <input type="text" id="subject" name="subject" autocomplete="off" placeholder="邮件主题" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">邮件内容</label>
            <div class="layui-input-block">
                <textarea id="message" name="message" placeholder="请输入内容" class="layui-textarea"></textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                <button class="layui-btn" onclick="sendEmail()" lay-submit="" lay-filter="save">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</body>
</html>
