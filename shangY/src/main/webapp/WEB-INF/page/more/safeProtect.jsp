<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/page/common/taglib.jsp"%>
<!doctype html>
<html lang="zh">
<head>
  <meta charset="UTF-8">
  <%@include file="/WEB-INF/page/common/public3.jsp"%>
</head>
<body style=" background:url(/images/saftbg.png)">
<!-- 头部 -->
<header>
  <div class="func"></div>
  <div class="subtop"><div class="goback"><a href="javascript:history.back()"><i class="iconfont white">&#xe60c;</i></a></div>安全保障</div>
</header>
<div class="safe2">
  <img src="${path}/images/safe.png?${version }" alt=""/>
</div>

<div style="height:4rem;"></div>
<!-- 浮动导航 -->
<%@ include file="/WEB-INF/page/common/footer2.jsp"%>
</body>
</html>
