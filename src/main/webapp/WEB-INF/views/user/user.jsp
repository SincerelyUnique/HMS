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
    <script src="${ctx}/resources/app/js/user/user.js"></script>
</head>
<body>
<!--外层容器-->
<div>
    <div class="layui-box">
        <div>
            <div>
                <ul class="layui-form-item">
                    <li>
                        <button class="layui-btn layui-btn-warm" id="add">新增设置</button>
                    <li>
                </ul>
            </div>
            <div >
                <div id="showDefault">
                    <table class="layui-table">
                        <thead>
                        <tr>
                            <th class="common-tc" width="3%"></th>
                            <th class="common-tc" width="12%">操作</th>
                            <th class="common-tc" width="10%">账号</th>
                            <th class="common-tc" width="10%">角色</th>
                            <th class="common-tc" width="10%">是否启用</th>
                            <th class="common-tc" width="10%">电子邮箱</th>
                            <th class="common-tc" width="10%">电话号码</th>
                            <th class="common-tc" width="10%">备注</th>
                        </tr>
                        </thead>
                        <tbody id="list_table">

                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </div>
    <!--分页-->
    <div id="pageFoot" style="text-align:center"></div>
</div>

<script id="list-tmpl" type="text/html">
    {{each list}}
    <tr>
        <td class="common-tc"><input type="checkbox" data-id="{{$value.id}}"/></td>
        <td class="common-tc">
            <a class="common-tag" href="#" onclick="edit('{{$value.id}}')">编辑</a>
            <a class="common-tag common-tag-warm" href="#" onclick="deleteItem('{{$value.id}}')">删除</a>
        </td>
        <td title="{{$value.username}}" class="common-tc">{{$value.username}}</td>
        <td title="{{$value.userRole}}" class="common-tc">{{$value.userRole}}</td>
        <td title="{{$value.enable}}" class="common-tc">{{$value.enable}}</td>
        <td title="{{$value.email}}" class="common-tc" onclick="email('{{$value.id}}');">{{$value.email}}</td>
        <td title="{{$value.telephone}}" class="common-tc">{{$value.telephone}}</td>
        <td title="{{$value.remark}}" class="common-tc">{{$value.remark}}</td>
    </tr>
    {{/each}}
</script>
</body>
</html>
