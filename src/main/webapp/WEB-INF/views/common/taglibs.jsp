<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="user" value="${sessionScope.Operator}"/>
<script>
    var ctx = '${ctx}';
</script>
<link href="${ctx}/resources/app/images/bitbug_favicon.ico" rel="shortcut icon" />
<link rel="stylesheet" href="${ctx}/resources/plugins/layui/css/layui.css"  media="all">
<link rel="stylesheet" href="${ctx}/resources/app/css/common.css"  media="all">
<link rel="stylesheet" href="${ctx}/resources/plugins/layui/css/modules/layer/default/layer.css">
<script src="${ctx}/resources/plugins/jquery/jquery-3.2.1.min.js"></script>
<script src="${ctx}/resources/plugins/template/template.js" ></script>
<script src="${ctx}/resources/plugins/pagination/jquery.simplePagination.js" ></script>
<script src="${ctx}/resources/plugins/layui/layui.js"></script>
<script src="${ctx}/resources/plugins/layui/lay/modules/layer.js"></script>

