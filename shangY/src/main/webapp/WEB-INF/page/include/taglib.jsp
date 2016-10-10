<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%-- 标签 --%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>

<%-- 自定义标签 --%>
<%@ taglib prefix="wxEL" uri="/WEB-INF/tlds/wxEL.tld"%>

<%-- 公共变量 --%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<c:if test="${pageContext.request.serverPort=='80'}">
	<c:set var="serverPath" value="${pageContext.request.serverName }${path }"></c:set>
</c:if>
<c:if test="${pageContext.request.serverPort!='80'}">
	<c:set var="serverPath" value="${pageContext.request.serverName }:${pageContext.request.serverPort}${path }"></c:set>
</c:if>
<c:if test="${pageContext.request.serverPort=='80' || pageContext.request.serverPort=='443'}">
	<c:set var="basePath" value="${pageContext.request.scheme}://${pageContext.request.serverName}${pageContext.request.contextPath}" />
</c:if>
<c:if test="${pageContext.request.serverPort!='80' && pageContext.request.serverPort!='443'}">
	<c:set var="basePath" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}" />
</c:if>
<%--  发布的版本号，每次发布版本时将此版本号加1,其主要原因是引用朿新的css文件，避免缓存 --%>


<c:set var="version" value="20160701" />

<%-- bbs --%>
<c:set var="bbsPath" value="http://bbs.gcjr.com" />
<%-- portal --%>
<c:set var="portalPath" value="http://www.gcjr.com" />

<%-- 格式匿 --%>
<c:set var="aprFmt" value="##.##"/>
<c:set var="moneyFmt" value="#,##0.00"/>
<c:set var="dateFmt" value="yyyy-MM-dd"/>
<c:set var="dateTimeFmt" value="yyyy-MM-dd HH:mm:ss"/>

<%-- 默认标题 --%>
<c:set var="unitedTitle" value="xxx"/>